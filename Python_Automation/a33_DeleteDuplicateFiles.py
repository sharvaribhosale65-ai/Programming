##########################################################
#
#   Importing required libraries
#
##########################################################

import sys
import os
import hashlib      #md file
import schedule
import time

##########################################################
#
#   Function name :     CalculateChecksum
#   Input :             File name
#   Output :            String
#   Description :       Calculates and returns the MD5 checksum of the given file.
#   Date :              25/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def CalculateChecksum(FileName):
    fobj = open(FileName,"rb")

    hobj = hashlib.md5()            #module.class 

    Buffer = fobj.read(1024)        #list

    while(len(Buffer) > 0):
        hobj.update(Buffer)
        Buffer = fobj.read(1024)

    fobj.close()

    return hobj.hexdigest()

##########################################################
#
#   Function name :     FindDuplicate
#   Input :             Directory name
#   Output :            Dictionary
#   Description :       Finds duplicate files by comparing their MD5 checksum.
#   Date :              25/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def FindDuplicate(DirectoryName):

    Ret = False

    Ret = os.path.exists(DirectoryName)

    if(Ret == False):
        print("Path is invalid\n")
        return
    
    Ret = os.path.isdir(DirectoryName)

    if(Ret == False):
        print("There is no such directory\n")
        return

    Duplicate = {}          #set or dictonary

    for FolderName, SubFolder, FileName in os.walk(DirectoryName):
        for fName in FileName:
            fName = os.path.join(FolderName,fName)
            
            CheckSum = CalculateChecksum(fName) 

            if(CheckSum in Duplicate):
                Duplicate[CheckSum].append(fName)           #dictory

            else:
                Duplicate[CheckSum] = [fName]               #dictory

    return Duplicate

##########################################################
#
#   Function name :     DeleteDuplicate
#   Input :             Directory name
#   Output :            None
#   Description :       Deletes duplicate files and stores the details in a log file.
#   Date :              25/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def DeleteDuplicate(DirectoryName):

    logfile = "DeleteDuplicate.log"
    fObj = open(logfile,"a")

    MyDict = FindDuplicate(DirectoryName)

    Result = list(filter(lambda x : len(x) > 1, MyDict.values()))

    Count = 0
    TotalDeleted = 0

    for Value in Result:

        for subValue in Value:

            Count = Count + 1
            if Count > 1 :
                try:
                    os.remove(subValue)
                    fObj.write("Deleted : " + subValue + "\n")
                    TotalDeleted = TotalDeleted + 1
                except Exception as e:
                    fObj.write("Unable to delete : " + subValue + "\n")
        Count = 0
        
    fObj.write("Total deleted files : " + str(TotalDeleted) + "\n")
    fObj.close()

    print("Total deleted files :", TotalDeleted)

##########################################################
#
#   Function name :     main
#   Input :             Command line arguments
#   Output :            None
#   Description :       Controls the execution of the automation script.
#   Date :              25/07/2026
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
    
                schedule.every(1).hour.do(DeleteDuplicate,sys.argv[1])
    
                while True:
                    schedule.run_pending()
                    time.sleep(1)

##########################################################
#
#   Application to find duplicate files using MD5 checksum,
#   delete them periodically and maintain a log file.
#
##########################################################

if __name__ == "__main__":
    main()