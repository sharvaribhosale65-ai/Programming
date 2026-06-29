"""
Algorithm   :
    Accept a number as No
    Print reverse of that No
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""
def Reverse(No):
    Digit = 0
    Rev = 0
    while(No != 0):
        Digit = No % 10
        Rev = (Rev * 10) + Digit
        No = No // 10
    return Rev


def main():
    print("Enter the number : ")
    Value = int(input())

    Ret = Reverse(Value)

    print("Reverse number : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   7891
Output  :   1987
"""