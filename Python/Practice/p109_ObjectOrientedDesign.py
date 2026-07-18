class Arithmetic:

    def __init__(self, a, b):
        self.No1 = a
        self.No2 = b
        
    
    def Addition(self):         

        Ans = self.No1 + self.No2
        return Ans

    def Substraction(self):

        Ans = self.No1 - self.No2
        return Ans


print("Enter first number : ")
Value1 = int(input())

print("Enter second number : ")
Value2 = int(input())

aObj = Arithmetic(Value1, Value2)   

Ret1 = aObj.Addition()   
print("Addition is : ",Ret1)

Ret2 = aObj.Substraction()
print("Substraction is : ",Ret2)

