""""
Algorithm   :
    START
        Accept the number as No
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

Divisible = lambda No : No % 5 == 0

"""
Application to check number is odd or not of int value
"""

def main():

    Value = int(input("Enter the number : "))

    Ret = Divisible(Value)

    if(Ret == True):
        print("It is divisible by 5")
    else:
        print("It is not divisible by 5")

if __name__ == "__main__":
    main()

"""
Input   :   55
Output  :   It is divisible by 5

Input   :   77
Output  :   It is not divisible by 5
"""