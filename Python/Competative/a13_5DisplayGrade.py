""""
Algorithm   :
    Accept a number as No
    Display the grade according to No
    If No >= 75
        Print Distinction
    Else if No >= 60
        Print first class
    Else if No >= 50
        Print second class
    Else if No < 50
        Print fail

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def displayGrade(No):

    if(No >= 75):
        return "Distinction"
    elif (No >= 60):
        return "First class"
    elif (No >= 50):
        return "Second class"
    else:
        return "Fail"

def main():

    Marks = int(input("Enter the marks : "))

    Ret = displayGrade(Marks)

    print("Grade : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   89
Output  :   Distinction

Input   :   45
Output  :   Fail
"""