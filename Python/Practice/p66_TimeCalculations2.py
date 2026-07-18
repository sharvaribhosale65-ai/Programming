# Find the factorial 6 : 6 * 5 * 4 * 3 * 2 * 1
def factorial(No):
    iFact = 1
    for i in range(1,No+1):
        iFact =  iFact * i
    return iFact

def main():
    Value = int(input("Enter the number : "))

    Ret = factorial(Value)

    print(f"Factorial of {Value} is {Ret}")       #f(formatted printing) like printf in c

if __name__ == "__main__":
    main()