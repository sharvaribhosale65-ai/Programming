""""
Algorithm   :
    START
        Accept a number as No
        Create a lambda function to perform cube operation
        Display result
    STOP   
"""

"""
 Function name    :   Cube
 Input    :           int
 Output   :           int
 Description  :       Perform cube operation
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Cube = lambda No : No * No * No

"""
Application to perform cube operation of int value
"""

def main():

    Value = int(input("Enter the number : "))

    Ret = Cube(Value)

    print("Cube is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   2
Output  :   8

Input   :   3
Output  :   27
"""



