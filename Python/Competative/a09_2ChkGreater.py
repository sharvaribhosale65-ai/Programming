"""
Algorithm :
    Accept first number as iNo1
    Accept second number as iNo2
    Check the greater number
    Display the result 

Author  :   Sharvari Gorakhnath Bhosale
Date    :   27/06/2026
"""

def chkGreater():

    print("Enter first number : ")
    iNo1 = int(input())
    print("Enter second number : ")
    iNo2 = int(input())

    if(iNo1 > iNo2):
        print(iNo1 , "is greater")
    else:
        print(iNo2 , "is greater")

def main():
    chkGreater()

if __name__ == "__main__":
    main()

"""
Output  :   10, 20
            20 is greater
"""