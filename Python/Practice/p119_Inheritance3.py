class Base:
    def __init__(self):
        print("Inside Base constructor")

class Derived(Base):
    def __init__(self):
        super().__init__()      #call base class
        print("Inside Derived constructor")

dObj = Derived()

"""
Inside Base constructor
Inside Derived constructor
"""