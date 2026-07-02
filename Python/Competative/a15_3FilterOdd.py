""""
Algorithm   :
    START
        Accept a list as No
        Check odd numbers of that list
        Return odd numbers
        Display the result
    STOP   
"""

"""
 Function name    :   Odd
 Input    :           int
 Output   :           int
 Description  :       Perform to check odd numbers of that list
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Odd = lambda No : No % 2 != 0

"""
Application to perform to check odd numbers of that list of int value
"""

def main():

    Data = [1, 2, 3, 4, 5]

    fData = list(filter(Odd, Data))

    print(fData)

if __name__ == "__main__":
    main()

"""
Input   : 
Output  :   
"""