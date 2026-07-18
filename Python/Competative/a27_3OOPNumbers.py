"""
Algorithm   :
        START
            Create a class Numbers.
            Accept a number.
            Check whether the number is prime.
            Check whether the number is perfect.
            Display all factors of the number.
            Calculate and display the sum of factors.
        STOP
"""

"""
Function name   :   __init__
Input           :   int
Output          :   None
Description     :   Initialize the instance variable with the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
class Numbers:

    def __init__(self, No):
        self.Value = No


    """
    Function name   :   ChkPrime
    Input           :   None
    Output          :   bool
    Description     :   Check whether the given number is prime or not.
    """

    def ChkPrime(self):

        for i in range(2, self.Value):
            if(self.Value % i == 0):
                return False

        return True


    """
    Function name   :   ChkPerfect
    Input           :   None
    Output          :   bool
    Description     :   Check whether the given number is perfect or not.
    """

    def ChkPerfect(self):

        self.sum = 0

        for i in range(1, self.Value):
            if(self.Value % i == 0):
                self.sum = self.sum + i

        if(self.sum == self.Value):
            return True
        else:
            return False
        

    """
    Function name   :   Factors
    Input           :   None
    Output          :   None
    Description     :   Display all factors of the given number.
    """

    def Factors(self):

        print("Factors are : ")

        for i in range(1, self.Value):
            if(self.Value % i == 0):
                print(i, end="\t")


    """
    Function name   :   SumFactor
    Input           :   None
    Output          :   None
    Description     :   Calculate and display the sum of factors.
    """
    
    def SumFactor(self):

        self.sum = 0

        for i in range(1, self.Value):
            if(self.Value % i == 0):
                self.sum = self.sum + i

        print("\nSummation of factors : ", self.sum)
        print()

"""
Application to check prime number, perfect number, display factors, and calculate the sum of factors.
"""

nObj1 = Numbers(24)
print("Prime : ", nObj1.ChkPrime())
print("Perfect : ", nObj1.ChkPerfect())
nObj1.Factors()
nObj1.SumFactor()

nObj2 = Numbers(13)
print("Prime : ", nObj2.ChkPrime())
print("Perfect : ", nObj2.ChkPerfect())
nObj2.Factors()
nObj2.SumFactor()

nObj3 = Numbers(6)
print("Prime : ", nObj3.ChkPrime())
print("Perfect : ", nObj3.ChkPerfect())
nObj3.Factors()
nObj3.SumFactor()

"""
Output  :   Prime : False
            Perfect : False
            Factors are :
            1    2    3    4    6    8    12
            Summation of factors : 36

            Prime : True
            Perfect : False
            Factors are :
            1
            Summation of factors : 1

            Prime : False
            Perfect : True
            Factors are :
            1    2    3
            Summation of factors : 6
"""