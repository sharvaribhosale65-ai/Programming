""""
Algorithm   :
    START
        Accept the first number as No
        Create a lambda function to check number is odd or not
        If yes
            Display true
        Else
            Display false
        Display result
    STOP   
"""

"""
 Function name    :   Odd
 Input    :           int
 Output   :           int
 Description  :       Perform to check number is odd or not
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Odd = lambda No : No % 2 != 0

"""
Application to check number is odd or not of int value
"""

def main():

    Value = int(input("Enter the number : "))

    Ret = Odd(Value)

    if(Ret == True):
        print("True")
    else:
        print("False")


if __name__ == "__main__":
    main()

"""
Input   :   5
Output  :   True

Input   :   8
Output  :   False
"""