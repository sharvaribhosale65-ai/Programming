""""
Algorithm   :
    START
        Accept first number as No1
        Accept second number as No2
        Perform the multiplication of that two numbers
        Display the result
    STOP   
"""

"""
 Function name    :   Multiplication
 Input    :           int, int
 Output   :           int
 Description  :       Perform the multiplication of two numbers
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Multiplication = lambda No1, No2 : No1 * No2


"""
Application to perform the multiplication of two numbers of 2 int values
"""

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret = Multiplication(Value1, Value2)

    print("Multiplication is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   10  11
Output  :   110

Input   :   5  4
Output  :   20
"""