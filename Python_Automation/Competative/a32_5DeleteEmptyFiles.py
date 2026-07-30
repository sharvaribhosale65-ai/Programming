##########################################################
#
#   Importing required libraries
#
##########################################################

import schedule
import sys
import time
import os
import datetime
import shutil

##########################################################
#
#   Function name :     DeleteFiles
#   Input :             Directory name
#   Output :            None
#   Description :       Deletes all empty files from the given directory and stores the details in a log file.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def DeleteFiles(DirectoryPath):

    Ret1 = False

    Ret1 = os.path.exists(DirectoryPath)
    if(Ret1 == False):
        print("Directory does not exists\n")
        return

    logfile = "logfile.log"
    
    fObj = open(logfile,"a")

    for FolderName, SubFolder, FileName in os.walk(DirectoryPath):
        for fName in FileName:

            path = os.path.join(FolderName, fName)
            size = os.path.getsize(path)

            if size == 0:
                os.remove(path)
                fObj.write("Deleted : " + path + "\n")

    fObj.close()    

    print("Empty files gets deleted...")

##########################################################
#
#   Function name :     main
#   Input :             Command line arguments
#   Output :            None
#   Description :       Controls the execution of the automation script.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def main():

    if(len(sys.argv) == 2):

        if((sys.argv[1] == "--h") or (sys.argv[1] == "--H")):
            print("This automation script is used to travel directory path\n")
            print("For better usage enter --u or --U\n")

        elif((sys.argv[1] == "--u") or (sys.argv[1] == "--U")):
            print("Please execute the script as - \n")
            print("python filename.py\n")

        else:

            schedule.every(1).hour.do(DeleteFiles,sys.argv[1])

            while True:
                schedule.run_pending()
                time.sleep(1)

##########################################################
#
#   Application to delete empty files from a directory
#   periodically and maintain a log file.
#
##########################################################

if __name__ == "__main__":
    main()