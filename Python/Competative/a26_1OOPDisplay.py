"""
Algorithm   :
        START
            Create a class Demo.
            Initialize instance variables using constructor.
            Create two objects of the class.
            Call Fun() and Gun() methods using both objects.
            Display the values.
        STOP
"""

"""
Function name   :   __init__
Input           :   int, int
Output          :   None
Description     :   Initialize the instance variables.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
class Demo:

    Value = 0

    def __init__(self, No1, No2):
        self.No1 = No1
        self.No2 = No2

    """
    Function name   :   Fun
    Input           :   None
    Output          :   None
    Description     :   Display the values of instance variables.
    Author          :   Sharvari Gorakhnath Bhosale
    Date            :   10.07.2026
    """
    def Fun(self):
        print("Inside Fun method")
        print(self.No1)
        print(self.No2)

    """
    Function name   :   Gun
    Input           :   None
    Output          :   None
    Description     :   Display the values of instance variables.
    Author          :   Sharvari Gorakhnath Bhosale
    Date            :   10.07.2026
    """
    def Gun(self):
        print("Inside Gun method")
        print(self.No1)
        print(self.No2)

"""
Application to demonstrate the use of constructor and instance methods.
"""

Obj1 = Demo(11, 21)
Obj2 = Demo(51, 101)

Obj1.Fun()
Obj2.Fun()

Obj1.Gun()
Obj2.Gun()

"""
Output  :   Inside Fun method
            11
            21
            Inside Fun method
            51
            101
            Inside Gun method
            11
            21
            Inside Gun method
            51
            101
"""