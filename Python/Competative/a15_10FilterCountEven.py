""""
Algorithm   :
    START
        Accept a list as No
        Check even numbers of that list
        Return the count of even numbers
        Display the result
    STOP   
"""

"""
 Function name    :   Even
 Input    :           int
 Output   :           int
 Description  :       Returns the count of even numbers
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Even = lambda No : No % 2 == 0

"""
Application to returns the count of even numbers of int value
"""

def main():

    Data = [1, 2, 3, 4, 5]

    iCount = 0

    fData = list(filter(Even, Data))

    iCount = len(fData)

    print("Count of even numbers : ",iCount)

if __name__ == "__main__":
    main()

"""
Input   :   [1, 2, 3, 4, 5]   
Output  :   2   
"""