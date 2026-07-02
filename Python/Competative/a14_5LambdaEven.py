""""
Algorithm   :
    START
        Accept the first number as No
        Create a lambda function to check number is even or not
        If yes
            Display true
        Else
            Display false
        Display result
    STOP   
"""

"""
 Function name    :   Even
 Input    :           int
 Output   :           int
 Description  :       Perform to check number is even or not
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Even = lambda No : No % 2 == 0

"""
Application to perform to check number is even or not of int value
"""

def main():

    Value = int(input("Enter the number : "))

    Ret = Even(Value)

    if(Ret == True):
        print("True")
    else:
        print("False")


if __name__ == "__main__":
    main()

"""
Input   :   6
Output  :   True

Input   :   9
Output  :   False
"""