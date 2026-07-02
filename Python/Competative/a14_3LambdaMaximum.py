""""
Algorithm   :
    START
        Accept first number as No1
        Accept second number as No2
        Create a lambda function to perform maximum of two numbers
        Display result
    STOP   
"""

"""
 Function name    :   Maximum
 Input    :           int, int
 Output   :           int
 Description  :       Perform maximum of two numbers
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Maximum = lambda No1, No2 : No1 if No1 > No2 else No2

"""
Application to perform maximum of two numbers of int value
"""

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret = Maximum(Value1, Value2)

    if(Ret == True):
        print("Maximum number is : ",Ret)
    else:
        print("Maximum number is : ",Ret)


if __name__ == "__main__":
    main()

"""
Input   :   5   2
Output  :   5

Input   :   9   13
Output  :   13
"""



