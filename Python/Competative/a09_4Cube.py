"""
Algorithm   :
    Accept a number as No
    Display the cube of that number
    Display the result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplayCube(No):
    Cube = No * No * No
    return Cube

def main():
    Value = int(input("Enter the number : "))

    Ret = DisplayCube(Value)

    print("Cube is : ", Ret)

if __name__ == "__main__":
    main()

"""
Input   :   2
Output  :   8

Input   :   10
Output  :   1000
""" 