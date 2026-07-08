"""
Algorithm:
    START
        Accept first number as No1
        Accept second number as No2
        Perform the addition of that 2 numbers
        Display the result
    STOP
"""

"""
Function Name   :   Add
Input           :   int, int
Output          :   int
Description     :   Perform the addition of 2 numbers
Date            :   04/07/2026
Author          :   Sharvari Gorakhnath Bhosale
"""

def Add(No1, No2):
    Ans = No1 + No2
    return Ans

"""
Application to perform the addition of 2 numbers"
"""

def main():
    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret = Add(Value1, Value2)

    print("Addition is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   11  10
Output  :   21 
"""