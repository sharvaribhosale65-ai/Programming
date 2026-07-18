"""
Algorithm   :
        START
            Create a class Circle.
            Accept the radius from the user.
            Calculate the area of the circle.
            Calculate the circumference of the circle.
            Display the radius, area, and circumference.
        STOP
"""

"""
Function name   :   __init__
Input           :   None
Output          :   None
Description     :   Initialize the radius, area, and circumference of the circle.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
class Circle:

    pi = 3.14

    def __init__(self):
        self.Radius = 0.0
        self.Area = 0.0
        self.Circumference = 0.0

    """
    Function name   :   Accept
    Input           :   float
    Output          :   None
    Description     :   Accept the radius from the user.
    """

    def Accept(self):
        self.Radius = float(input("Enter the radius : "))

    """
    Function name   :   CalculateArea
    Input           :   None
    Output          :   None
    Description     :   Calculate the area of the circle.
    """

    def CalculateArea(self):
        self.Area = Circle.pi * self.Radius * self.Radius


    """
    Function name   :   CalculateCircumference
    Input           :   None
    Output          :   None
    Description     :   Calculate the circumference of the circle.
    """

    def CalculateCircumference(self):
        self.Circumference = 2 * Circle.pi * self.Radius


    """
    Function name   :   Display
    Input           :   None
    Output          :   None
    Description     :   Display the radius, area, and circumference.
    """
    
    def Display(self):
        print("Radius : ", self.Radius)
        print("Area : ", self.Area)
        print("Circumference : ", self.Circumference)

"""
Application to calculate the area and circumference of a circle.
"""

obj1 = Circle()
obj1.Accept()
obj1.CalculateArea()
obj1.CalculateCircumference()
obj1.Display()

obj2 = Circle()
obj2.Accept()
obj2.CalculateArea()
obj2.CalculateCircumference()
obj2.Display()

"""
Input   :   4.5     6.8

Output  :   Enter the radius : 4.5
            Radius : 4.5
            Area : 63.585
            Circumference : 28.26

            Enter the radius : 6.8
            Radius : 6.8
            Area : 145.1936
            Circumference : 42.704
"""