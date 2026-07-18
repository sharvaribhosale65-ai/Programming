from abc import ABC, abstractmethod

class Base(ABC):                    #abstract
    @abstractmethod                 #abc module -> ABC class -> @abstractmethod decorator
    def Addition(self, No1, No2):
        pass

class Derived(Base):                #concrete
    def Addition(self, No1, No2):
        return No1 + No2            

dObj = Derived()
Ret = dObj.Addition(10, 11)

print("Addition is : ",Ret)

"""
Output :
Addition is :  21
"""