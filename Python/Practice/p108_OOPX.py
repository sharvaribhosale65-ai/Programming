class Arithmetic:
    
    #Ret1 = Addition(self,Value1, Value2)
    def Addition(self,No1, No2):

        Ans = No1 + No2
        return Ans

    def Substraction(self,No1, No2):

        Ans = No1 - No2
        return Ans
    
aObj = Arithmetic()         #object of arithmetic class

print("Enter first number : ")
Value1 = int(input())

print("Enter second number : ")
Value2 = int(input())

Ret1 = aObj.Addition(Value1, Value2)    #Ret1 = Addition(aObj,Value1, Value2)
print("Addition is : ",Ret1)

Ret2 = aObj.Substraction(Value1, Value2)
print("Substraction is : ",Ret2)

