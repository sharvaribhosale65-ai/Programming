def FactorAddition(No):
    Sum = 0
    for i in range(1, No):
        if(No % i == 0):
            Sum = Sum + i
    return Sum


def main():

    Value = int(input("Enter the number : "))
    Ret = FactorAddition(Value)
    print("Addition of factor is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   12  
Output  :   16

Input   :   10
Output  :   8
"""