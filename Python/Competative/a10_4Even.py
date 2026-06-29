"""
Algorithm   :
    Accept a number as No
    Print the even numbers till that No
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def printEven(No):

    for i in range(1, No+1):
        if(i % 2 == 0):
            print(i,end="\t")       

def main():
    Value = int(input("Enter the number : "))

    printEven(Value)

if __name__ == "__main__":
    main()

"""
Input   :   10
Output  :   2       4       6       8       10
"""