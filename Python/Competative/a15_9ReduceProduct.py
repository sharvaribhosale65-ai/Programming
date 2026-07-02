""""
Algorithm   :
    START
        Accept a list as No
        Perform an product of all elements of list 
        Display the result
    STOP   
"""

from functools import reduce

"""
 Function name    :   Product
 Input    :           int
 Output   :           int
 Description  :       Perform an product of all elements of list 
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Product = lambda No1, No2 : No1 * No2

"""
Application to perform an product of all elements of list  of int value
"""

def main():

    Data = [10, 20, 30, 40, 50]

    rData = reduce(Product, Data)

    print("Product of all elements : ",rData)


if __name__ == "__main__":
    main()

"""
Input   :   [10, 20, 30, 40, 50]
Output  :   12000000 
"""