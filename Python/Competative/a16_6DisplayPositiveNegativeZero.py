"""
Algorithm:
    START
        Accept number as No
        If No > 0
            Print Positive
        Else if No < 0
            Print Negative
        Else
            Print Zero
    STOP
"""

"""
Function Name   : Display
Input           : int
Output          : String
Description     : Checks whether the given number is Positive, Negative, or Zero.
Date            : 04/07/2026
Author          : Sharvari Gorakhnath Bhosale
"""

def Display(No):
    if No > 0:
        return "Positive"
    elif No < 0:
        return "Negative"
    else:
        return "Zero"

"""
Application to check whether a number is Positive, Negative, or Zero of int value.
"""

def main():
    Value = int(input("Enter the number: "))
    Ret = Display(Value)
    print(Ret)

if __name__ == "__main__":
    main()

"""
Input   : 10
Output  : Positive

Input   : -3
Output  : Negative

Input   : 0
Output  : Zero
"""