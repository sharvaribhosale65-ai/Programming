##########################################################
#
#   Function name :     DisplayLine
#   Input :             File name
#   Output :            None
#   Description :       Displays all lines from the given file.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def DisplayLine(Filename):
    try:
        fObj = open(Filename, "r")
        for line in fObj:
            print(line, end=" ")
        fObj.close()

    except FileNotFoundError as obj:
        print("File not found")


##########################################################
#
#   Function name :     main
#   Input :             File name
#   Description :       Accepts file name and displays its contents.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def main():

    Name = input("Enter file name : ")

    Ret = DisplayLine(Name)

##########################################################
#
#   Application to display all lines from a file.
#
##########################################################

if __name__ == "__main__":
    main()


"""
Input   :   Demo.txt

Output  :   Hello
            Jay ganesh
            Marvellos infosystem
"""