"""
Algorithm   :
    Accept a character as No
    Print the factors of that No
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplayFactors(No):
    for i in range(1,No+1):
        if(No % i == 0):
            print(i,end="\t")

def main():
    print("Enter the number : ")
    Value = int(input())

    DisplayFactors(Value)

if __name__ == "__main__":
    main()

"""
Input   :   12
Output  :   1       2       3       4       6       12
"""