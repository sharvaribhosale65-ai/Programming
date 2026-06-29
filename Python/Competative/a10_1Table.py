"""
Algorithm   :
    Accept a number as No
    Print the multiplication table of that number   
    Display the result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplayTable(No):

    for i in range(1, 11):
        print(No*i)

def main():

    print("Enter the number : ")
    Value = int(input())

    DisplayTable(Value)

if __name__ == "__main__":
    main()

"""
Input   :   4

Output  :   4
            8
            12
            16
            20
            24
            28
            32
            36
            40
"""