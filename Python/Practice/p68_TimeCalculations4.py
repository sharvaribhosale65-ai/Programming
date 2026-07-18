# Find the factorial 6 : 6 * 5 * 4 * 3 * 2 * 1
# calculate time

import time

def factorial(No):
    iFact = 1
    for i in range(1,No+1):
        iFact =  iFact * i
    return iFact

def main():
    Value = int(input("Enter the number : "))

    start_time = time.time()                        #time(module) time() - method

    Ret = factorial(Value)

    end_time = time.time()

    print(f"Factorial of {Value} is {Ret}")       #f(formatted printing) like printf in c
    print(f"Time required is : {end_time - start_time :.5f} seconds")       #.5f(after . only 5 digits display)

if __name__ == "__main__":
    main()