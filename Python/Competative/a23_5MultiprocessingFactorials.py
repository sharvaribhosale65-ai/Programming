"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Calculate the factorial of each number.
            Return the factorial.
            Display the result and execution time.
        STOP
"""

"""
Import required libraries
"""
import multiprocessing
import os
import time

"""
Function name   :   Factorials
Input           :   int
Output          :   int
Description     :   Calculate and return the factorial of the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def Factorials(No):

    iFact = 1

    for i in range(No, 0, -1):
        iFact = iFact * i

    print("Process id : ", os.getpid())
    print("Input number is : ", No)
    print("Factorial is : ", iFact)

    return iFact

"""
Application to calculate the factorial of numbers using multiprocessing.
"""

def main():

    Data = [10, 15, 20, 25]

    Result = list()

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(Factorials, Data)

    pObj.close()
    pObj.join()

    end_time = time.perf_counter()

    print("Final result is : ", Result)
    print(f"Required time is : {end_time - start_time:.4f} seconds")


if __name__ == "__main__":
    main()

"""
Input   :   [10, 15, 20, 25]

Output  :   Process id : 12616
            Input number is : 10
            Factorial is : 3628800

            Process id : 12616
            Input number is : 15
            Factorial is : 1307674368000

            Process id : 12616
            Input number is : 20
            Factorial is : 2432902008176640000

            Process id : 12616
            Input number is : 25
            Factorial is : 15511210043330985984000000

            Final result is :
            [3628800, 1307674368000, 2432902008176640000, 15511210043330985984000000]

            Required time is : 0.2015 seconds
"""