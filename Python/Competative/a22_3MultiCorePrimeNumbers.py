"""
Algorithm   :
        START
            Accept a list of numbers.
            Create a pool of processes.
            Count the prime numbers up to each number.
            Return the count of prime numbers.
            Display the result.
        STOP
"""

"""
Import required libraries
"""
import multiprocessing
import os

"""
Function name   :   CheckPrime
Input           :   int
Output          :   bool
Description     :   Check whether the given number is prime or not.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def CheckPrime(No):

    for i in range(2, No):
        if(No % i == 0):
            return False

    return True

"""
Function name   :   CountPrime
Input           :   int
Output          :   int
Description     :   Count the total number of prime numbers up to the given number.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""

def CountPrime(No):

    print("Process is running with pid : ", os.getpid())

    iCount = 0

    for i in range(2, No + 1):
        if(CheckPrime(i) == True):
            iCount = iCount + 1

    return iCount

"""
Application to count prime numbers using multiprocessing.
"""

def main():

    Data = [1000, 2000, 3000, 4000]

    Result = []

    pObj = multiprocessing.Pool()

    Result = pObj.map(CountPrime, Data)

    pObj.close()
    pObj.join()

    print("Final result is : ", Result)

if __name__ == "__main__":
    main()

"""
Input   :   [1000, 2000, 3000, 4000]

Output  :   Process is running with pid : 12345
            Process is running with pid : 12346
            Process is running with pid : 12347
            Process is running with pid : 12348

            Final result is :
            [168, 303, 430, 550]
"""