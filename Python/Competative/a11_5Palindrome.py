"""
Algorithm   :
    Accept a number as No
    Check whether that No is palindrome or not
    If yes
        Print it is a palindrome
    else
        Print it is not a palindrome
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def chkPalindrome(No):
    Digit = 0
    Rev = 0
    Temp = No
    while(No != 0):
        Digit = No % 10
        Rev = (Rev * 10) + Digit
        No = No // 10

    if(Rev == Temp):
        return True
    else:
        return False 

def main():

    print("Enter the number : ")
    Value = int(input())

    Ret = chkPalindrome(Value)

    if(Ret == True):
        print("It is a palindrome")
    else:
        print("It is not a palindrome")


if __name__ == "__main__":
    main()

"""
Input   :   121
Output  :   It is a palindrome

Input   :   345
Output  :   It is not a palindrome
"""