"""
Algorithm   :
    Accept a number as No
    Count the digits of that No
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def countDigit(No):
    Count = 0
    Digit = 0
    while(No != 0):
        Digit = No % 10
        Count = Count + 1
        No = No // 10
    return Count
    
def main():

    Value = int(input("Enter the number : "))
    Ret = countDigit(Value)

    print("Count of digits are : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5673
Output  :   4
"""