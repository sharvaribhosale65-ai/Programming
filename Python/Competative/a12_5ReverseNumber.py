"""
Algorithm   :
    Accept one number as No
    Print reverse numbers of that No 
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def displayReverse(No):

    for i in range(No,0,-1):
        print(i, end="\t")

def main():

    print("Enter the number : ")
    Value = int(input())

    displayReverse(Value)

if __name__ == "__main__":
    main()

"""
Input   =   5
Output  =   5       4       3       2       1
"""