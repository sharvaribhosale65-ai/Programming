""""
Algorithm   :
    START
        Accept a list as No
        Perform the addition of all elements of that list
        Display the result
    STOP   
"""

from functools import reduce

"""
 Function name    :   Addition
 Input    :           int
 Output   :           int
 Description  :       Perform the addition of all elements of that list
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Addition = lambda No1, No2 : No1 + No2

"""
Application to perform the addition of all elements of that list of int value
"""
def main():

    Data = [1, 2, 3, 4, 5]

    rData = reduce(Addition, Data)

    print(rData)

if __name__ == "__main__":
    main()

"""
Input   :   [1, 2, 3, 4, 5]
Output  :   15   
"""