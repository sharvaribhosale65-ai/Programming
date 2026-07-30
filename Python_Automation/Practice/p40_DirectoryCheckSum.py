import sys
import os
import hashlib      #md file

def CalculateChecksum(FileName):
    fobj = open(FileName,"rb")

    hobj = hashlib.md5()            #module.class 

    Buffer = fobj.read(1024)        #list

    while(len(Buffer) > 0):
        hobj.update(Buffer)
        Buffer = fobj.read(1024)

    fobj.close()

    return hobj.hexdigest()

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
    
    for FolderName, SubFolder, FileName in os.walk(DirectoryName):
        for fName in FileName:
            fName = os.path.join(FolderName,fName)
            
            CheckSum = CalculateChecksum(fName)

            print(f"{fName} : {CheckSum}")

def main():

    FindDuplicate("Test");

if __name__ == "__main__":
    main()