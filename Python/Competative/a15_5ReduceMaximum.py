""""
Algorithm   :
    START
        Accept a list as No
        Returns the maximum number of that list
        Display the result
    STOP   
"""

from functools import reduce

"""
 Function name    :   Maximum
 Input    :           int
 Output   :           int
 Description  :       Returns the maximum number of that list
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Maximum = lambda No1, No2 : No1 if No1 > No2 else No2

"""
Application to returns the maximum number of that list of int value
"""

def main():

    Data = [1, 2, 3, 4, 5]

    rData = reduce(Maximum, Data)

    print(rData)

if __name__ == "__main__":
    main()

"""
Input   :   [1, 2, 3, 4, 5]
Output  :   5
"""