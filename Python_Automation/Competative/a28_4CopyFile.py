##########################################################
#
#   Function name :     CopyFile
#   Input :             Source file name, Destination file name
#   Output :            None
#   Description :       Copies the contents of one file into another file.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def CopyFile(Filename1, Filename2):
    try:
        fObj1 = open(Filename1, "r")
        fObj2 = open(Filename2, "w")

        Data = fObj1.read()
        fObj2.write(Data)

        fObj1.close()
        fObj2.close()

        print("Copy data successfully")

    except FileNotFoundError as obj:
        print("File not found")


##########################################################
#
#   Function name :     main
#   Input :             Source file name, Destination file name
#   Description :       Accepts two file names and copies the contents.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def main():

    Name1 = input("Enter first file name : ")
    Name2 = input("Enter second file name : ")

    Ret = CopyFile(Name1, Name2)


##########################################################
#
#   Application to copy the contents of one file into another file.
#
##########################################################

if __name__ == "__main__":
    main()


"""
Input   :   Demo.txt
            Hello.txt

Output  :   Copy data successfully
"""