from abc import ABC, abstractmethod

class Base(ABC):                    #We dont create object of base class cause it contains abstract method
                                    #ABC is class of abc module
    @abstractmethod                 #abc module -> ABC class -> @abstractmethod decorator
    def Addition(self, No1, No2):
        pass

class Derived(Base):
    pass

dObj = Derived()                    #error