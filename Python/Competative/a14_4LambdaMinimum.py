""""
Algorithm   :
    START
        Accept first number as No1
        Accept second number as No2
        Create a lambda function to perform minimum of two numbers
        Display result
    STOP   
"""

"""
 Function name    :   Minimum
 Input    :           int
 Output   :           int
 Description  :       Perform minimum of two numbers
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Minimum = lambda No1, No2 : No1 if No1 < No2 else No2

"""
Application to perform minimum of two numbers of int value
"""

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret = Minimum(Value1, Value2)

    if(Ret == True):
        print("The minimum number is : ",Ret)
    else:
        print("The minimum number is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5   7
Output  :   5

Input   :   56   12
Output  :   12
"""



