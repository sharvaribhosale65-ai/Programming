import sys
import os
import hashlib              #calculate checksum functions

def CalculateCheckSum(FileName):
    fObj = open(FileName,"rb")          #rb = binary

    hObj = hashlib.md5()                

    Buffer = fObj.read(1000)            #read 1000 byte

    while(len(Buffer) > 0):
        hObj.update(Buffer)
        Buffer = fObj.read(1000)

    fObj.close()

    return hObj.hexdigest()                    #checksum

def main():

    Ret = CalculateCheckSum("Demo.txt")
    print("Check sum of file is : ",Ret)

if __name__ == "__main__":
    main()

"""

C:\Users\WIN\OneDrive\Desktop\Python\Automation>python p37_CalculateCheckSum.py
Check sum of file is :  1a88f20756104dd343405e22464dac42

"""