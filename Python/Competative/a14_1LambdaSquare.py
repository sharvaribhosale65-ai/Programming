""""
Algorithm   :
    START
        Accept a number as No
        Create a lambda function to perform square operation
        Display result
    STOP
   
"""
"""
 Function name    :   Square
 Input    :           int
 Output   :           int
 Description  :       Perform square operation
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Square = lambda No : No * No

"""
Application to perform square operation of int value
"""

def main():

    print("Enter the number : ")
    Value = int(input())

    Ret = Square(Value)
    print("Square is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5
Output  :   25
"""