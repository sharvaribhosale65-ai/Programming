import time
import datetime
import schedule
import sys
import os

def Display(DirectoryPath):

    Border = "-"*50

    timestamp = time.ctime()
    LogfileName = "DirectoryCountLog%s.log"%(timestamp)
    LogfileName = LogfileName.replace(" ","_")
    LogfileName = LogfileName.replace(":","_")

    print(Border)
    print("Welcome to the Sharvari's automation script")
    print(Border)    

    print("Log file gets created with name : ",LogfileName)
    print(Border)

    fObj = open(LogfileName,"w")
    Count = 0

    for FolderName, SubFolder, FileName in os.walk(DirectoryPath):
        for fName in FileName:
            Count = Count + 1

    print(Border)

    fObj.write("Directory name : ")
    fObj.write(DirectoryPath+"\n") 

    fObj.write("Number of files : ")
    fObj.write(str(Count)+"\n") 

    fObj.write("Current date and time : ")
    fObj.write(str(datetime.datetime.now())+"\n\n") 

    print(Border)

def main():

    Border = "-"*50

    print(Border)
    print("Welcome to the Sharvari's automation script")
    print(Border)

    if(len(sys.argv) == 2):

        if(sys.argv[1] == "--h" or sys.argv[1] == "--H"):

            print("This script is used to travel directory")
            print("For better usage please check --u")

        elif(sys.argv[1] == "--u" or sys.argv[1] == "--U"):

            print("Please executed file as ")
            print("python filename.py DirectoryName")
            print("DirectoryName should be absolute path")

        else:
            schedule.every(5).minutes.do(Display,sys.argv[1])
            while True:
                schedule.run_pending()
                time.sleep(1)

    else:
        print("Invalid arguments")
        print("Please use --h or --u for more information")
        
    print("Border")
    print("Thank you for using Sharvari's automation script")
    print(Border)

if __name__ == "__main__":
    main()