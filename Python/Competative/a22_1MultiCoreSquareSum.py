"""
Algorithm :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Perform the square operation for each number.
            Return the sum of squares for each number.
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
Function name   :   square
Input           :   int
Output          :   int
Description     :   Perform the square operation on each element and return the sum of squares.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
def square(No):

    print("Process is running with pid : ",os.getpid())

    Sum = 0

    for i in range(1, No + 1):
        Sum = Sum + (i ** 2)

    return Sum

"""
Application to perform the square operation on each element and return the sum of squares.
"""

def main():

    Data = [1000000, 2000000, 3000000, 4000000]

    Result = list()

    start_time = time.perf_counter()

    pObj = multiprocessing.Pool()

    Result = pObj.map(square, Data)

    pObj.close()
    pObj.join()

    print("Result is : ")
    print(Result)

    end_time = time.perf_counter()

    print(f"Required time is : {end_time - start_time :.4f} seconds")


if __name__ == "__main__":
    main()

"""
Input   :   [1000000, 2000000, 3000000, 4000000]

Output  :   Process is running with pid : 17460
            Process is running with pid : 17272
            Process is running with pid : 15620
            Process is running with pid : 5564

            Result is :
            [333333833333500000,
             2666668666667000000,
             9000004500000500000,
             21333341333334000000]

            Required time is : 0.5791 seconds
"""