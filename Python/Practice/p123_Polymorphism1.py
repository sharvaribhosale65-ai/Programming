class Base:
    def fun(self):
        print("Inside base fun")

class Derived(Base):
    def fun(self):
        print("Inside derived fun")

dObj = Derived()

dObj.fun()

"""
Output:
Inside derived fun
"""