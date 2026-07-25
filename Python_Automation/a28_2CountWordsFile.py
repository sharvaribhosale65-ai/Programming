##########################################################
#
#   Function name :     CountWords
#   Input :             File name
#   Output :            Integer
#   Description :       Counts the total number of words in the given file.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def CountWords(FileName):

    try:
        fObj = open(FileName, "r")
        Count = 0
        for line in fObj:
            Word = line.split()
            Count = Count + len(Word)
        fObj.close()
        return Count
    
    except FileNotFoundError as obj:
        print("File not found")


##########################################################
#
#   Function name :     main
#   Input :             File name
#   Description :       Accepts file name and displays the total number of words.
#   Date :              24/07/2026
#   Author :            Sharvari Gorakhnath Bhosale
#
##########################################################

def main():

    Name = input("Enter the file name : ")

    Ret = CountWords(Name)
    print("Number of words in file : ",Ret)


##########################################################
#
#   Application to count the total number of words in a file.
#
##########################################################

if __name__ == "__main__":
    main()

"""
Input   :   Demo.txt

Output  :   5
"""