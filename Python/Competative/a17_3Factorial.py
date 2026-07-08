def Factorial(No):

    fact = 1
    for i in range(1, No+1):
        fact = fact * i
    return fact

def main():

    Value = int(input("Enter the number : "))
    Ret = Factorial(Value)
    print(f"Factorial of {Value} is : ", Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5
Output  :   120

Input   :   10
Output  :   3628800
"""