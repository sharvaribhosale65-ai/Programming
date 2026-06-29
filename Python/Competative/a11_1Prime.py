"""
Algorithm   :
    Accept a number as No
    Check whether No is prime or not
    If yes
        Print it is a prime number
    Else
        Print it is not a prime number
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def chkPrime(No):
    for i in range(2, No+1):
        if(No % i != 0):
            return True
        else:
            return False
        
def main():
    print("Enter the number : ")
    Value = int(input())

    Ret = chkPrime(Value)

    if(Ret == True):
        print("It is a prime number")
    else:
        print("It is not a prime number")

if __name__ == "__main__":
    main()

"""
Input   :   7
Output  :   It is a prime number

Input   :   8
Output  :   It is not a prime number
"""