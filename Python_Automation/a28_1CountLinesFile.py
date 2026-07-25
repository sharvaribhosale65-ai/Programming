##########################################################
#
#   Function name :     CountLines
#   Input :             File name
#   Output :            Integer
#   Description :       Counts the number of lines in the given file.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def CountLines(FileName):

    try:
        fObj = open(FileName, "r")
        Count = 0
        for line in fObj:
            Count = Count + 1
        fObj.close()
        return Count
    
    except FileNotFoundError as obj:
        print("File not found")


##########################################################
#
#   Function name :     main
#   Input :             File name
#   Description :       Accepts file name and displays the total number of lines.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def main():

    Name = input("Enter the file name : ")

    Ret = CountLines(Name)
    print("Number of lines in file : ",Ret)


##########################################################
#
#   Application to count the total number of lines in a file.
#
##########################################################

if __name__ == "__main__":
    main()


"""
Enter the file name : Demo.txt
Number of lines in file :  3
"""