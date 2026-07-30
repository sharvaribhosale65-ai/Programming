import sys
import os
import hashlib      #md file

def CalculateChecksum(FileName):
    fobj = open(FileName,"rb")

    hobj = hashlib.md5()            #module.class 

    Buffer = fobj.read(1000)        #list

    while(len(Buffer) > 0):
        hobj.update(Buffer)
        Buffer = fobj.read(1000)

    fobj.close()

    return hobj.hexdigest()

def main():
    Ret = CalculateChecksum("DemoX.txt")

    print("Checksum of file is : ",Ret)

if __name__ == "__main__":
    main()