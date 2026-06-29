"""
Algorithm   :
    Accept a number as No
    Display the square of that number
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplaySquare(No):
    Square = No * No
    return Square

def main():
    Value = int(input("Enter the number : "))
    Ret = DisplaySquare(Value)
    print("Square is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5
Output  :   25

Input   :   4
Output  :   16
"""    