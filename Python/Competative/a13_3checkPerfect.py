""""
Algorithm   :
    Accept a number as No
    Check whether that No is perfect number or not
    If yes
        Print it is a perfect number
    Else
        Print it is not a perfect number
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def chkPerfect(No):

    Digit = 0
    Sum = 0
    Temp = No

    for i in range(1,No):
        if (No % i == 0):
            Sum = Sum + i
    
    if Sum == Temp:
        return True
    else:
        return False

def main():

    Value = int(input("Enter the number : "))

    Ret = chkPerfect(Value)

    if Ret == True:
        print("It is a perfect number")
    else:
        print("It is not a perfect number")

if __name__ == "__main__":
    main()

"""
Input   :   6
Output  :   It is a perfect number

Input   :   8
Output  :   It is not a perfect number
"""