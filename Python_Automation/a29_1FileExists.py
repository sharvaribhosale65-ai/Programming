import os

def CheckFileExists(Filename):

    data = os.path.exists(Filename)

    if data == True:
        print(Filename, "is present in current directory")

    else:
        print(Filename, "is not present in current directory")

def main():

    Name = input("Enter the filename : ")

    Ret = CheckFileExists(Name)

if __name__ == "__main__":
    main()

"""
Input   :   Demo.txt
Output  :   Demo.txt is present in current directory

Input   :   Marvellous.txt
Output  :   Marvellous.txt is not present in current directory
"""