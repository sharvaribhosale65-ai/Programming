class Base:
    def __init__(self):
        print("Inside Base constructor")

    def fun(self):
        print("Inside base fun")

class Derived(Base):
    def __init__(self):
        super().__init__()      #call base class
        print("Inside Derived constructor")

dObj = Derived()

dObj.fun()

"""
Output :

Inside Base constructor
Inside Derived constructor
Inside base fun
"""