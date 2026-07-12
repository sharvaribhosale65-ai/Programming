"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Calculate the sum of fifth powers up to each number.
            Return the sum.
            Display the result and execution time.
        STOP
"""

"""
Import required libraries
"""
import multiprocessing
import time
import os

"""
Function name   :   Power
Input           :   int
Output          :   int
Description     :   Calculate and return the sum of fifth powers of numbers from 1 to the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def Power(No):

    print("Process id : ", os.getpid())

    iSum = 0

    for i in range(1, No + 1):
        Ans = i ** 5
        iSum = iSum + Ans

    print("Input number is : ", No)
    print("Power is : ", iSum)

    return iSum

"""
Application to calculate the sum of fifth powers using multiprocessing.
"""

def main():

    Data = [1000000, 2000000, 3000000, 4000000]

    Result = []

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(Power, Data)

    pObj.close()
    pObj.join()

    end_time = time.perf_counter()

    print("Final result is : ", Result)
    print(f"Required time is : {end_time - start_time:.4f} seconds")

if __name__ == "__main__":
    main()

"""
Input   :   [1000000, 2000000, 3000000, 4000000]

Output  :   Process id : 14032
            Process id : 10384
            Process id : 11948
            Process id : 16888

            Input number is : 1000000
            Power is : 166667166667083333333333250000000000

            Input number is : 2000000
            Power is : 10666682666673333333333333000000000000

            Input number is : 3000000
            Power is : 121500121500033749999999999250000000000

            Input number is : 4000000
            Power is : 682667178666773333333333332000000000000

            Final result is :
            [166667166667083333333333250000000000,
             10666682666673333333333333000000000000,
             121500121500033749999999999250000000000,
             682667178666773333333333332000000000000]

            Required time is : 0.8261 seconds
"""