"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Calculate the factorial of each number.
            Return the factorial of each number.
            Display the result.
        STOP
"""

"""
Import required libraries
"""
import multiprocessing
import os

"""
Function name   :   CalculateFactorial
Input           :   int
Output          :   int
Description     :   Calculate and return the factorial of the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def CalculateFactorial(No):

    Fact = 1

    for i in range(1, No + 1):
        Fact = Fact * i

    print(f"Process id : {os.getpid()} | Input number : {No} | Factorial is : {Fact}")

    return Fact

"""
Application to calculate the factorial of each number using multiprocessing.
"""

def main():

    Data = [10, 15, 20, 25]

    Result = list()

    pObj = multiprocessing.Pool()

    Result = pObj.map(CalculateFactorial, Data)

    pObj.close()
    pObj.join()

    print("Final result is : ", Result)


if __name__ == "__main__":
    main()

"""
Input   :   [10, 15, 20, 25]

Output  :   Process id : 8540 | Input number : 10 | Factorial is : 3628800
            Process id : 8540 | Input number : 15 | Factorial is : 1307674368000
            Process id : 8540 | Input number : 20 | Factorial is : 2432902008176640000
            Process id : 8540 | Input number : 25 | Factorial is : 15511210043330985984000000

            Final result is :
            [3628800, 1307674368000, 2432902008176640000, 15511210043330985984000000]
"""