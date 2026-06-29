"""
Algorithm   :
    Accept one number as No
    Print many numbers starting from 1
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def PrintNumber(No):
    arr = list()

    for i in range(1,No+1):
        arr.append(i)
    return arr

def main():

    print("Enter the number : ")
    Value = int(input())

    Ret = PrintNumber(Value)

    print(Ret, end="\t")

if __name__ == "__main__":
    main()

"""
Input   =   5
Output  =   [1, 2, 3, 4, 5]
"""