"""
Algorithm   :
    Accept a number as No
    Print the odd numbers till that No
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def printOdd(No):
    for i in range(1, No+1):
        if(i % 2 != 0):
            print(i,end="\t")

def main():
    print("Enter number : ")
    Value = int(input())

    printOdd(Value)

if __name__ == "__main__":
    main()

"""
Input   :   10
Output  :   1       3       5       7       9
"""