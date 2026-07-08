"""
Algorithm:
    START
        Accept number as No
        Perform for loop No times
        Display "Marvellous" 5 times
    STOP
"""

"""
Function Name   : Display
Input           : int
Output          : String
Description     : Display "Marvellous" 5 times
Date            : 04/07/2026
Author          : Sharvari Gorakhnath Bhosale
"""

def Display(No):
    for i in range(No):
        print("Marvellous")

"""
Application to display "Marvellous" 5 times
"""

def main():
    Display(5)

if __name__ == "__main__":
    main()

"""
Input   :   5
Output  :   Marvellous
            Marvellous
            Marvellous
            Marvellous
            Marvellous
"""