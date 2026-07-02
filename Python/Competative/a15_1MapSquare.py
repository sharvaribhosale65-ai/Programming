""""
Algorithm   :
    START
        Accept a list as No
        Perform the square of each number from list
        Display the result
    STOP   
"""

"""
 Function name    :   Square
 Input    :           int
 Output   :           int
 Description  :       Perform the square of each number from list
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Square = lambda No : No * No

"""
Application to perform the square of each number from list of int value
"""

def main():

    Data = [1, 2, 3, 4, 5]

    mData = list(map(Square, Data))

    print("Square is : ",mData)
    

if __name__ == "__main__":
    main()

"""
Input   :  [1, 2, 3, 4, 5]
Output  :  [1, 4, 9, 16, 25]  
"""