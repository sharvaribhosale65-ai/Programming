"""
Algorithm   :
        START
            Create a class Arithmetic.
            Accept two numbers from the user.
            Perform addition, subtraction, multiplication, and division.
            Display the results.
        STOP
"""

"""
Function name   :   __init__
Input           :   None
Output          :   None
Description     :   Initialize the instance variables.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
class Arithmetic:

    def __init__(self):
        self.Value1 = 0
        self.Value2 = 0


    """
    Function name   :   Accept
    Input           :   int, int
    Output          :   None
    Description     :   Accept two integer values from the user.
    """

    def Accept(self):
        self.Value1 = int(input("Enter first number : "))
        self.Value2 = int(input("Enter second number : "))

    """
    Function name   :   Addition
    Input           :   None
    Output          :   int
    Description     :   Calculate and return the addition of two numbers.
    """

    def Addition(self):
        self.Add = self.Value1 + self.Value2
        return self.Add


    """
    Function name   :   Substraction
    Input           :   None
    Output          :   int
    Description     :   Calculate and return the subtraction of two numbers.
    """

    def Substraction(self):
        self.Sub = self.Value1 - self.Value2
        return self.Sub


    """
    Function name   :   Multiplication
    Input           :   None
    Output          :   int
    Description     :   Calculate and return the multiplication of two numbers.
    """

    def Multiplication(self):
        self.Mult = self.Value1 * self.Value2
        return self.Mult


    """
    Function name   :   Division
    Input           :   None
    Output          :   float
    Description     :   Calculate and return the division of two numbers.
    """

    def Division(self):
        self.Div = self.Value1 / self.Value2
        return self.Div
    

"""
Application to perform arithmetic operations on two numbers.
"""

aObj1 = Arithmetic()
aObj1.Accept()
print("Addition : ", aObj1.Addition())
print("Substraction : ", aObj1.Substraction())
print("Multiplication : ", aObj1.Multiplication())
print("Division : ", aObj1.Division())

aObj2 = Arithmetic()
aObj2.Accept()
print("Addition : ", aObj2.Addition())
print("Substraction : ", aObj2.Substraction())
print("Multiplication : ", aObj2.Multiplication())
print("Division : ", aObj2.Division())

"""
Input   :   11  21

Output  :   Enter first number : 11
            Enter second number : 21
            Addition : 32
            Substraction : -10
            Multiplication : 231
            Division : 0.5238095238095238

Input   :   51  101

Output  :   Enter first number : 51
            Enter second number : 101
            Addition : 152
            Substraction : -50
            Multiplication : 5151
            Division : 0.504950495049505
"""