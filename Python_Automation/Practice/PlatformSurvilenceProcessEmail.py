import psutil
import sys
import os
import time
import schedule
import datetime
import smtplib
from email.message import EmailMessage

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


def Top10CpuProcess():

    Data = ProcessScan()

    #Data can sort CPU percent in descending order
    Data.sort(key = lambda x : x["cpu_percent"], reverse=True)      

    return Data

def Top10RamProcess():

    Data = ProcessScan()

    #Data can sort RAM percent in descending order
    Data.sort(key= lambda x : x["memory_percent"], reverse=True)

    return Data

def ProcessScan():

    listprocess = []

    for proc in psutil.process_iter():
        try:
            info = proc.as_dict(attrs=["pid","name","username","status"])

            info["cpu_percent"] = proc.cpu_percent(None)
            info["memory_percent"] = proc.memory_percent()
            info["creation_time"] = proc.create_time()

            listprocess.append(info)

        except(psutil.NoSuchProcess,psutil.AccessDenied,psutil.ZombieProcess):
            pass

    return listprocess
 
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
    fobj.write("---- Marvellous Platform Survillence System ----\n")
    fobj.write("Log file gets created at : "+timestamp+"\n")
    fobj.write(Border+"\n\n")

    fobj.write("---------------- System Report -----------------\n")

    # CPU information
    fobj.write("CPU Report\n")
    fobj.write("Number of active CPU cores : %s\n" %psutil.cpu_count())
    fobj.write("CPU Usage : %s %%\n" %psutil.cpu_percent())
    fobj.write(Border+"\n")

    # RAM information
    memory = psutil.virtual_memory()

    fobj.write("RAM Report\n")
    fobj.write("RAM Usage : %s %%\n" %memory.percent)
    fobj.write("Total RAM available : %s\n" %memory.total)
        
    fobj.write(Border+"\n")

    # Netork Usage
    netobj = psutil.net_io_counters()

    fobj.write("Network Report\n")
    fobj.write("Sent : %.2f MB\n" %(netobj.bytes_sent / (1024 * 1024)))
    fobj.write("Receive : %.2f MB\n" %(netobj.bytes_recv / (1024 * 1024)))

    fobj.write(Border+"\n")

    # Disk Information
    dObj = psutil.disk_usage("/")           #it contais root directory 

    fobj.write("Disk Report\n")
    fobj.write("Total disk space : %.2f GB\n" %(dObj.total / (1024 ** 3)))
    fobj.write("Used disk space : %.2f GB\n" %(dObj.used / (1024 ** 3)))
    fobj.write("Free disk space : %.2f GB\n" %(dObj.free / (1024 ** 3)))
    fobj.write("Disk Usage : %s %%\n" %dObj.percent)

    fobj.write(Border+"\n")

    # Process log
    Data = ProcessScan()

    fobj.write("Process Report\n")
    fobj.write(Border+"\n")

    for info in Data:

        fobj.write("PID : %s\n" %info.get("pid"))
        fobj.write("Name : %s\n" %info.get("name"))
        fobj.write("User Name : %s\n" %info.get("username"))
        fobj.write("Status : %s\n" %info.get("status"))
        fobj.write("CPU usage : %.2f\n" %info.get("cpu_percent"))
        fobj.write("RAM usage : %.2f\n" %info.get("memory_percent"))

        creation_time = datetime.datetime.fromtimestamp(info.get("creation_time"))
        creation_time = creation_time.strftime("%d_%m_%Y_%H_%M_%S_%p")

        fobj.write("Process creation time : %s\n" %creation_time)

        fobj.write(Border+"\n")

    #Top 10 CPU process
    Data = Top10CpuProcess()

    Cout = 0

    fobj.write("Top 10 CPU Consuming Processes\n")
    fobj.write(Border+"\n")

    for info in Data:
        if(Cout == 10):
            break

        fobj.write("PID : %s\n" %info.get("pid"))
        fobj.write("Name : %s\n" %info.get("name"))
        fobj.write("CPU usage : %.2f\n" %info.get("cpu_percent"))

        Cout = Cout + 1

        fobj.write(Border+"\n")

    #Top 10 RAM Process
    Data = Top10RamProcess()

    fobj.write("Top 10 RAM Consuming Processes\n")
    fobj.write(Border+"\n")

    Cout = 0

    for info in Data:
        if(Cout == 10):
            break;

        fobj.write("PID : %s\n" %info.get("pid"))
        fobj.write("Name : %s\n" %info.get("name"))
        fobj.write("RAM usage %s %%\n" %info.get("memory_percent"))

        Cout = Cout + 1

        fobj.write(Border+"\n")

    #Battery Information

    Battery = psutil.sensors_battery()

    fobj.write("Battery Information\n")
    fobj.write(Border + "\n")

    if(Battery != None):
        fobj.write("Battery Percentage : %s %%\n" %Battery.percent)

        if(Battery.power_plugged == True):

            if(Battery.percent == 100):
                fobj.write("Battery Status : Fully Charged\n")
            else:
                fobj.write("Battery Status : Charging\n")

        else:
            fobj.write("Battery status : Discharging\n")

    else:
        fobj.write("Battery information is not available\n")
  

    fobj.write(Border+"\n")

    fobj.write(Border+"\n")
    fobj.write("--------------- End of Log File ----------------\n")
    fobj.write(Border+"\n")

    fobj.close()

    print("Log created")
    print("Calling send_mail")

    send_mail(FileName,sender_email, app_password, receiver_email, subject, body)
    print("Mail function completed")

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
        receiver_email = "sharvaribhosale65@gmail.com"
        subject = "Platform Survilence Process Automation Script"
        body = "Hello,\n\nPlease find the attached Platform Surveillance Log File.\n\nThank You."

        print("Schedular started succesfully")
        print("Press Ctrl + C to abort the automation script")
        
        schedule.every(int(sys.argv[1])).minutes.do(PlatformSurvillance, sys.argv[2], sender_email, app_password, receiver_email, subject, body)

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

if __name__ == "__main__":
    main()