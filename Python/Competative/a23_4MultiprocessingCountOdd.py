"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Count the odd numbers up to each number.
            Return the count of odd numbers.
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
Function name   :   CountOdd
Input           :   int
Output          :   int
Description     :   Count and return the total number of odd numbers from 1 to the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def CountOdd(No):

    iCount = 0

    for i in range(1, No + 1):
        if(i % 2 != 0):
            iCount = iCount + 1

    print("Process id : ", os.getpid())
    print("Input number is : ", No)
    print("Count of odd number is : ", iCount)

    return iCount

"""
Application to count the odd numbers using multiprocessing.
"""

def main():

    Data = [1000000, 2000000, 3000000, 4000000]

    Result = list()

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(CountOdd, Data)

    pObj.close()
    pObj.join()

    end_time = time.perf_counter()

    print("Final result is : ", Result)
    print(f"Required time is : {end_time - start_time:.4f} seconds")


if __name__ == "__main__":
    main()

"""
Input   :   [1000000, 2000000, 3000000, 4000000]

Output  :   Process id : 14512
            Input number is : 1000000
            Count of odd number is : 500000

            Process id : 14224
            Input number is : 2000000
            Count of odd number is : 1000000

            Process id : 3308
            Input number is : 3000000
            Count of odd number is : 1500000

            Process id : 15536
            Input number is : 4000000
            Count of odd number is : 2000000

            Final result is :
            [500000, 1000000, 1500000, 2000000]

            Required time is : 0.4430 seconds
"""