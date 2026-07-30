##########################################################
#
#   Importing required libraries
#
##########################################################

import psutil
import sys
import os
import time
import schedule
import smtplib
from email.message import EmailMessage

##########################################################
#
#   Function name :     send_mail
#   Input :             File name, Sender email, App password,
#                       Receiver email, Subject, Body
#   Output :            None
#   Description :       Sends the generated log file as an email attachment.
#   Date :              30/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def send_mail(FileName,sender_email, app_password, receiver_email, subject, body):

    try:
        msg = EmailMessage()

        msg["From"] = sender_email
        msg["To"] = receiver_email
        msg["Subject"] = subject

        msg.set_content(body)

        fObj = open(FileName,"rb")
        FileData = fObj.read()
        fObj.close()

        msg.add_attachment(FileData,maintype="application",subtype="octet-stream",filename=os.path.basename(FileName))

        smtp = smtplib.SMTP_SSL("smtp.gmail.com",465)

        smtp.login(sender_email, app_password)

        smtp.send_message(msg)

        smtp.quit()

        print("Mail send successfully\n")

    except Exception as e:
        print("Unable to send email\n")
        print(e)

##########################################################
#
#   Function name :     ProcessScan
#   Input :             None
#   Output :            List
#   Description :       Collects information about all running processes.
#   Date :              30/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def ProcessScan():

    listprocess = []

    for proc in psutil.process_iter():
        try:
            info = proc.as_dict(attrs=["pid","name","username","status"])

            info["cpu_percent"] = proc.cpu_percent(None)
            info["memory_percent"] = proc.memory_percent()
            info["creation_time"] = proc.create_time()

            listprocess.append(info)

        except Exception as e:
            pass

    return listprocess

##########################################################
#
#   Function name :     PlatformSurvillance
#   Input :             Folder name, Sender email, App password,
#                       Receiver email, Subject, Body
#   Output :            None
#   Description :       Creates a process log file and sends it through email.
#   Date :              30/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################
 
def PlatformSurvillance(FolderName, sender_email, app_password, receiver_email, subject, body):
    Border = "-"*50

    Ret = False

    Ret = os.path.exists(FolderName)

    if(Ret == True):
        Ret = os.path.isdir(FolderName)
        if(Ret == False):
            print("Unable to proceed as directory name is existing but its nota adirectory")
            return
    else:
        os.mkdir(FolderName)
        print("Directory for the logfile gets created succesfully")

    timestamp = time.strftime("%Y-%m-%d_%H-%M-%S")

    FileName = os.path.join(FolderName,"Marvellous_%s.log" %timestamp)

    fobj = open(FileName,"w")

    print(f"Log file gets succesfully created with name {FileName}")

    fobj.write(Border+"\n")
    fobj.write("---- Sharvari's Platform Survillence System ----\n")
    fobj.write("Log file gets created at : "+timestamp+"\n")
    fobj.write(Border+"\n\n")

    fobj.write("---------------- System Report -----------------\n")

    # Process log
    Data = ProcessScan()

    fobj.write("Process Report\n")
    fobj.write(Border+"\n")

    for info in Data:

        fobj.write("PID : %s\n" %info.get("pid"))
        fobj.write("Name : %s\n" %info.get("name"))
        fobj.write("User Name : %s\n" %info.get("username"))

        fobj.write(Border+"\n")

    fobj.write(Border+"\n")
    fobj.write("--------------- End of Log File ----------------\n")
    fobj.write(Border+"\n")

    fobj.close()

    print("Log created")
    print("Calling send_mail")

    send_mail(FileName,sender_email, app_password, receiver_email, subject, body)
    print("Mail function completed")

##########################################################
#
#   Function name :     main
#   Input :             Command line arguments
#   Output :            None
#   Description :       Controls the execution of the automation script.
#   Date :              30/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def main():
    Border = "-"*50
    print(Border)
    print("---- Marvellous Platform Survillence System ----")
    print(Border)

    # --h & --u handling
    if(len(sys.argv) == 2):
        if(sys.argv[1] == "--h" or sys.argv[1] == "--H"):
            print("This automation script is used to perform ")
            print("1 : It fetch the information of running processess")
            print("2 : It fetch information about the primary storage as RAM")
            print("3 : It fetch information about the secondary storage as HDD")
            print("4 : It fetch the information about the microprocessor")
            print("5 : It gets auto scheduled periodically")
            print("6 : It maintains all records into log file")
            print("7 : It sends the log files through mail periodically")

        elif(sys.argv[1] == "--u" or sys.argv[1] == "--U"):
            print("Use the automation script as : ")
            print(f"python {sys.argv[0]} Time_Interval Folder_Name")
            print("Time_Interval : Time in minutes for periodic execution")
            print("Folder_Name : Name of folder for the log file creation")
            
        else:
            print("Unable to proceed as there is no matching argument")
            print("Please use --h or --u flag for getting more details")

    # Actual project code
    elif(len(sys.argv) == 3):

        sender_email = "gloomytwilight09@gmail.com"
        app_password = "noglmwvejyjwguxt"
        receiver_email = "utkarshapatil472002@gmail.com"
        subject = "Platform Survilence Process Automation Script"
        body = "Hello,\n\nPlease find the attached Platform Surveillance Log File.\n\nThank You."

        print("Schedular started succesfully")
        print("Press Ctrl + C to abort the automation script")
        
        schedule.every(int(sys.argv[1])).seconds.do(PlatformSurvillance, sys.argv[2], sender_email, app_password, receiver_email, subject, body)

        while True:
            schedule.run_pending()
            time.sleep(1)

    else:
        print("Invalid number of argumenst")
        print("Unable to proceed as arguments are not matching")
        print("Please use --h or --u flag for getting more details")

    print(Border)
    print("--- Thank you for using our automation System ---")
    print(Border)

##########################################################
#
#   Application to monitor running processes, generate
#   log files periodically and send them through email.
#
##########################################################

if __name__ == "__main__":
    main()