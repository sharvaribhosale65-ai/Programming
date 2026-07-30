import sys
import os
import datetime
import schedule
import time

def ScanDirectory(DirectoryPath):

    sCount = 0
    fCount = 0

    for FolderName, SubFolder, FileName in os.walk(DirectoryPath):

        if not os.path.exists(DirectoryPath):
            print("There is no such directory")
            return

        for subf in SubFolder:
            sCount = sCount + 1

        for fname in FileName:
            fCount = fCount + 1

        print("Directory name is : ",FolderName)
        print("Number of subdirectories are : ",sCount)
        print("Number of files are : ",fCount)
        print("Scane time : ",datetime.datetime.now())
        print()

def main():

    if(len(sys.argv) == 2):

        if(sys.argv[1] == "--h" or sys.argv[1] == "--H"):

            print("This script is used to travel directory")
            print("For better usage please check --u")

        elif(sys.argv[1] == "--u" or sys.argv[1] == "--U"):

            print("Please executed file as ")
            print("python filename.py DirectoryName")
            print("DirectoryName should be absolute path")

        else:
            ScanDirectory(sys.argv[1]) 

    schedule.every(1).minute.do(ScanDirectory,sys.argv[1])
    while True:
        schedule.run_pending()
        time.sleep(1)

if __name__ == "__main__":
    main()

