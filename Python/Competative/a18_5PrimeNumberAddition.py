from MarvellousNum import *;
        
def PrimeAddition(iNo):

    Sum = 0
    for i in iNo:
        if CheckPrime(i):
            Sum = Sum + i
    return Sum

def main():

    Value = int(input("Enter the number of elements : "))

    Data = list()

    print("Enter the elements : ")
    for i in range(Value):
        No = int(input())
        Data.append(No)

    Ret = PrimeAddition(Data)

    print("Addition of prime number is : ",Ret)
    

if __name__ == "__main__":
    main()

"""
Input   :   11
            13  5   45  7   4   56  10  34  2   5   8
Output  :   32
"""