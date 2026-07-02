""""
Algorithm   :
    START
        Accept a list as No
        Returns the minimum number of that list
        Display the result
    STOP   
"""

from functools import reduce

"""
 Function name    :   Minimum
 Input    :           int
 Output   :           int
 Description  :       Returns the minimum number of that list
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Minimum = lambda No1, No2 : No1 if No1 < No2 else No2

"""
Application to returns the minimum number of that list of int value
"""

def main():

    Data = [10, 11, 34, 78, 90]

    rData = reduce(Minimum, Data)

    print(rData)
   
if __name__ == "__main__":
    main()

"""
Input   :   [10, 11, 34, 78, 90]
Output  :   10
"""