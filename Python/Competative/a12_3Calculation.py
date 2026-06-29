"""
Algorithm   :
    Accept 2 numbers as No1, No2
    Perform the addition, substraction, multiplication, division of that 2 numbers
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def displayCalculation(No1, No2):

    Addition = No1 + No2

    Substraction = No1 - No2

    Multiplication = No1 * No2

    Division = No1 / No2

    return Addition, Substraction, Multiplication, Division

def main():

    Value1 = int(input("Enter the first number : "))
    Value2 = int(input("Enter the second number : "))

    Add, Sub, Mult, Div = displayCalculation(Value1, Value2)

    print("Addition is : ",Add)
    print("Substraction is : ",Sub)
    print("Multiplication is : ",Mult)
    print("Division is : ",Div)

if __name__ == "__main__":
    main()

"""
Input   :   12, 2
Output  :   Addition is :  14
            Substraction is :  10
            Multiplication is :  24
            Division is :  6.0

"""