"""
Algorithm:
    START
        Accept number as No
        Display numbers from 10 to 1
    STOP
"""

"""
Function Name   : Display
Input           : int
Output          : int
Description     : Display numbers from 10 to 1
Date            : 04/07/2026
Author          : Sharvari Gorakhnath Bhosale
"""

def Display(No):
    for i in range(No,0,-1):
        print(i,end="\t")

"""
Application to display numbers from 10 to 1 of int value
"""

def main():
    Display(10)

if __name__ == "__main__":
    main()

"""
Input   :   10
Output  :   10      9       8       7       6       5       4       3       2       1
"""