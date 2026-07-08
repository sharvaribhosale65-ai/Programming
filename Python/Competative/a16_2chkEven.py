"""
Algorithm:
    START
        Accept a number as No
        Check whether No % 2 == 0
        If true
            Display it is even
        Else
            Display it is odd
    STOP
"""

"""
Function Name   :   chkEven
Input           :   Int
Output          :   Int
Description     :   Check whether number is even or odd
Date            :   04/07/2026
Author          :   Sharvari Gorakhnath Bhosale
"""

def chkEven(No):
    if (No % 2 == 0):
        return True
    else:
        return False

"""
Application to check whether number is even or odd"
"""
def main():
    Value = int(input("Enter the number : "))
    Ret = chkEven(Value)

    if(Ret == True):
        print("It is even number")
    else:
        print("It is odd number")

if __name__ == "__main__":
    main()

"""
Input   :   11
Output  :   It is odd number

Input   :   8
Output  :   It is even number
"""