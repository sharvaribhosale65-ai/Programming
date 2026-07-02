""""
Algorithm   :
    START
        Accept a list as No
        Check even numbers of that list
        Return even numbers
        Display the result
    STOP   
"""

"""
 Function name    :   Even
 Input    :           int
 Output   :           int
 Description  :       Perform to check even numbers of that list
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Even = lambda No : No % 2 == 0

"""
Application to perform to check even numbers of that list of int value
"""

def main():

    Data = [10, 11, 34, 78, 90]

    fData = list(filter(Even, Data))

    print("Even numbers is : ",fData)

if __name__ == "__main__":
    main()

"""
Input   :   [10, 11, 34, 78, 90]
Output  :   [10, 34, 78, 90]
"""