#Single level

class Base:

    def fun(self):
        print("Inside base fun")

class Derived(Base):
    def sun(self):
        print("Inside derived sun")

dObj = Derived()

dObj.fun()
dObj.sun()

"""
Output :

Inside base fun
Inside derived sun
"""