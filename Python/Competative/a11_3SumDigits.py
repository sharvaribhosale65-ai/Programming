"""
Algorithm   :
    Accept a number as No
    Print the summation of digits of that No
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def sumDigits(No):
    Digit = 0
    Sum = 0
    while(No != 0):

        Digit = No % 10
        Sum = Sum + Digit
        No = No //10
    return Sum


def main():
    Value = int(input("Enter the number : "))

    Ret = sumDigits(Value)

    print("Summation of digits are : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   1234
Output  :   10
"""