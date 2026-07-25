import schedule
import sys
import time
import os
import datetime

def MonitorsSize(DirectoryPath):

    LogFile = "FileSizeLog.txt"

    print("Log file gets created with name : ",LogFile)

    fObj = open(LogFile,"a")

    for FolderName, SubFolder, FileName in os.walk(DirectoryPath):
        for fName in FileName:

            path = os.path.join(FolderName, fName)

            size = os.path.getsize(path)

            fObj.write("File path : ")
            fObj.write(path)
            fObj.write("\n")

            fObj.write("File size in bytes : ")
            fObj.write(str(size))
            fObj.write("\n")

            fObj.write("Date and time : ")
            fObj.write(str(datetime.datetime.now()))
            fObj.write("\n\n\n")

    fObj.close()
    

def main():

    if(len(sys.argv) == 2):

        if((sys.argv[1] == "--h") or (sys.argv[1] == "--H")):
            print("This automation script is used to travel directory path\n")
            print("For better usage enter --u or --U\n")

        elif((sys.argv[1] == "--u") or (sys.argv[1] == "--U")):
            print("Please execute the script as - \n")
            print("python filename.py\n")
            print("DirectoryName should be absolute path\n")

        else:

            schedule.every(30).seconds.do(MonitorsSize,sys.argv[1])

            while True:
                schedule.run_pending()
                time.sleep(1)

if __name__ == "__main__":
    main()