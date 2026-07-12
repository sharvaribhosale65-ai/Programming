"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Count the even numbers up to each number.
            Return the count of even numbers.
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
Function name   :   CountEven
Input           :   int
Output          :   int
Description     :   Count and return the total number of even numbers from 1 to the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def CountEven(No):

    iCount = 0

    for i in range(1, No + 1):
        if(i % 2 == 0):
            iCount = iCount + 1

    print("Process id : ", os.getpid())
    print("Input number is : ", No)
    print("Count of even number is : ", iCount)

    return iCount

"""
Application to count the even numbers using multiprocessing.
"""

def main():

    Data = [1000000, 2000000, 3000000, 4000000]

    Result = list()

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(CountEven, Data)

    pObj.close()
    pObj.join()

    end_time = time.perf_counter()

    print("Final result is : ", Result)
    print(f"Required time is : {end_time - start_time:.4f} seconds")

if __name__ == "__main__":
    main()

"""
Input   :   [1000000, 2000000, 3000000, 4000000]

Output  :   Process id : 17988
            Input number is : 1000000
            Count of even number is : 500000

            Process id : 8288
            Input number is : 2000000
            Count of even number is : 1000000

            Process id : 9460
            Input number is : 3000000
            Count of even number is : 1500000

            Process id : 7536
            Input number is : 4000000
            Count of even number is : 2000000

            Final result is :
            [500000, 1000000, 1500000, 2000000]

            Required time is : 0.4143 seconds
"""