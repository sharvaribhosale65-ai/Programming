class Demo:
    #class variables
    Value1 = 10                 #class variables
    Value2 = 20                 #class variables

    def __init__(self):         #instance method
        self.No1 = 11
        self.No2 = 21

    def fun(self):              #instance method

        print("Inside instance method named as fun")

        print(self.No1)         #access instance variable
        print(self.No2)         #access instance variable
        print(Demo.Value1)      #access class variable
        print(Demo.Value2)      #access class variable

    @classmethod
    def gun(cls):  

        print("Inside class method named as gun")

        #print(Demo.No1)         #not allowed
        #print(Demo.No2)         #not allowed
        print(cls.Value1)        #access class variable
        print(cls.Value2)        #access class variable

    @staticmethod
    def sun():

        print("Inside static method named as sun")

        print(Demo.Value1)      #access class variable
        print(Demo.Value2)      #access class variable

Demo.sun()


"""
Output :

Inside static method named as sun
10
20
"""