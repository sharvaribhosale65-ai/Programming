"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Calculate the sum of even numbers up to each number.
            Return the sum of even numbers.
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
Function name   :   SumEven
Input           :   int
Output          :   int
Description     :   Calculate and return the sum of even numbers from 1 to the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def SumEven(No):

    iSum = 0

    for i in range(1, No + 1):
        if(i % 2 == 0):
            iSum = iSum + i

    print("Process id : ", os.getpid())
    print("Input number is : ", No)
    print("Sum of even number is : ", iSum)

    return iSum

"""
Application to calculate the sum of even numbers using multiprocessing.
"""

def main():

    Data = [1000000, 2000000, 3000000, 4000000]

    Result = list()

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(SumEven, Data)

    pObj.close()
    pObj.join()

    end_time = time.perf_counter()

    print("Final result is : ", Result)
    print(f"Required time is : {end_time - start_time:.4f} seconds")

if __name__ == "__main__":
    main()

"""
Input   :   [1000000, 2000000, 3000000, 4000000]

Output  :   Process id : 1720
            Input number is : 1000000
            Sum of even number is : 250000500000

            Process id : 9420
            Input number is : 2000000
            Sum of even number is : 1000001000000

            Process id : 14940
            Input number is : 3000000
            Sum of even number is : 2250001500000

            Process id : 1836
            Input number is : 4000000
            Sum of even number is : 4000002000000

            Final result is :
            [250000500000, 1000001000000, 2250001500000, 4000002000000]

            Required time is : 0.5104 seconds
"""