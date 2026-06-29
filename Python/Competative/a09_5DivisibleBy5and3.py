"""
Algorithm   :
    Accept a number as No
    Check whether number is divisible by 5 and 3
    If yes
        return true
    else
        return false    
    Display the result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""
def chkDivisible(No):
    if((No % 5 == 0) and (No % 3 == 0)):
        return True
    else:
        return False

def main():

    print("Enter the number : ")
    Value = int(input())

    Ret = chkDivisible(Value)

    if(Ret == True):
        print("It is divisible by 3 and 5")
    else:
        print("It is not divisible by 3 and 5")

if __name__ == "__main__":
    main()

"""
Input   :   15
Output  :   It is divisible by 3 and 5

Input   :   12
Output  :   It is not divisible by 3 and 5
""" 