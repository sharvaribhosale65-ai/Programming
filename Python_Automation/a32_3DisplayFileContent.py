import schedule
import sys
import time
import os
import datetime

def readfile(DirectoryPath):

    Ret = False

    Ret = os.path.exists(DirectoryPath)

    if(Ret == False):
        print("File does not exist\n")

    else:

        fObj = open(DirectoryPath,"r")
        data = fObj.read()

        if(data == " "):
            print("File is empty\n")
        else:
            print(data + "\n\n")

        fObj.close()


def main():

    if(len(sys.argv) == 2):

        if((sys.argv[1] == "--h") or (sys.argv[1] == "--H")):
            print("This automation script is used to travel directory path\n")
            print("For better usage enter --u or --U\n")

        elif((sys.argv[1] == "--u") or (sys.argv[1] == "--U")):
            print("Please execute the script as - \n")
            print("python filename.py\n")

        else:

            schedule.every(1).minute.do(readfile,sys.argv[1])

            while True:
                schedule.run_pending()
                time.sleep(1)

if __name__ == "__main__":
    main()