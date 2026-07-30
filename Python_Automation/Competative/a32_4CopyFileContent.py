import schedule
import sys
import time
import os
import datetime
import shutil

def CopyFiles(SourceDir, DestDir):

    Ret1 = False
    Ret2 = False

    Ret1 = os.path.exists(SourceDir)
    if(Ret1 == False):
        print("Source directory does not exists\n")
        return

    Ret2 = os.path.exists(DestDir)
    if(Ret2 == False):
        print("Destination directory does not exists\n")
        return

    fObj = open("Copylog.txt","a")

    for FolderName, SubFolder, FileName in os.walk(SourceDir):
        for fName in FileName:

            if fName.endswith(".txt"):
                SourcePath = os.path.join(FolderName, fName)
                shutil.copy(SourcePath, DestDir)

                fObj.write("Copied : " + SourcePath + "\n")

    fObj.close()

    print("Data gets copied successfully........")

def main():

    if(len(sys.argv) == 3):

        if((sys.argv[1] == "--h") or (sys.argv[1] == "--H")):
            print("This automation script is used to travel directory path\n")
            print("For better usage enter --u or --U\n")

        elif((sys.argv[1] == "--u") or (sys.argv[1] == "--U")):
            print("Please execute the script as - \n")
            print("python filename.py\n")

        else:

            schedule.every(2).seconds.do(CopyFiles,sys.argv[1],sys.argv[2])

            while True:
                schedule.run_pending()
                time.sleep(1)

if __name__ == "__main__":
    main()