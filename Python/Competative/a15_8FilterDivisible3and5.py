""""
Algorithm   :
    START
        Accept a list as No
        Check the list of numbers divisible by both 3 and 5
        Display the result
    STOP   
"""

"""
 Function name    :   Divisible
 Input    :           int
 Output   :           int
 Description  :       Check the list of numbers divisible by both 3 and 5
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Divisible = lambda No : No % 3 == 0 and No % 5 == 0

"""
Application to check the list of numbers divisible by both 3 and 5 of int value
"""

def main():

    Data = [15, 23, 67, 30, 56, 100]

    fData = list(filter(Divisible, Data))

    print(fData)

if __name__ == "__main__":
    main()

"""
Input   :   [15, 23, 67, 30, 56, 100]
Output  :   [15, 30]
"""