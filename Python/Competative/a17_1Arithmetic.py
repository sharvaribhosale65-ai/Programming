from Arithmetic import *;

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret1 = Addition(Value1, Value2)
    print("Addition is : ",Ret1)

    Ret2 = Substraction(Value1, Value2)
    print("Substraction is : ",Ret2)

    Ret3 = Multiplication(Value1, Value2)
    print("Multiplication is : ",Ret3)

    Ret4 = Division(Value1, Value2)
    print("Division is : ",Ret4)

if __name__ == "__main__":
    main()

"""
Input   :   15  5
Output  :   Addition is :  20
            Substraction is :  10
            Multiplication is :  75
            Division is :  3.0
"""