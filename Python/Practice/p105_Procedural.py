
def Addition(No1, No2):

    Ans = No1 + No2
    return Ans

def Substraction(No1, No2):

    Ans = No1 - No2
    return Ans

print("Enter first number : ")
Value1 = int(input())

print("Enter second number : ")
Value2 = int(input())

Ret1 = Addition(Value1, Value2)
print("Addition is : ",Ret1)

Ret2 = Substraction(Value1, Value2)
print("Substraction is : ",Ret2)