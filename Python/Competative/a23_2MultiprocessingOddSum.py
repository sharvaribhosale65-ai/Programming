"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Calculate the sum of odd numbers up to each number.
            Return the sum of odd numbers.
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
Function name   :   SumOdd
Input           :   int
Output          :   int
Description     :   Calculate and return the sum of odd numbers from 1 to the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def SumOdd(No):

    iSum = 0

    for i in range(1, No + 1):
        if(i % 2 != 0):
            iSum = iSum + i

    print("Process id : ", os.getpid())
    print("Input number is : ", No)
    print("Sum of odd number is : ", iSum)

    return iSum

"""
Application to calculate the sum of odd numbers using multiprocessing.
"""

def main():

    Data = [1000000, 2000000, 3000000, 4000000]

    Result = list()

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(SumOdd, Data)

    pObj.close()
    pObj.join()

    end_time = time.perf_counter()

    print("Final result is : ", Result)
    print(f"Required time is : {end_time - start_time:.4f} seconds")

if __name__ == "__main__":
    main()

"""
Input   :   [1000000, 2000000, 3000000, 4000000]

Output  :   Process id : 13184
            Input number is : 1000000
            Sum of odd number is : 250000000000

            Process id : 16268
            Input number is : 2000000
            Sum of odd number is : 1000000000000

            Process id : 9428
            Input number is : 3000000
            Sum of odd number is : 2250000000000

            Process id : 16924
            Input number is : 4000000
            Sum of odd number is : 4000000000000

            Final result is :
            [250000000000, 1000000000000, 2250000000000, 4000000000000]

            Required time is : 0.5562 seconds
"""