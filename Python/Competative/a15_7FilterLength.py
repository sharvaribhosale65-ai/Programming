""""
Algorithm   :
    START
        Accept a list as No
        Returns list of numbers where length is greater that 5
        Display the result
    STOP   
"""

"""
 Function name    :   Length
 Input    :           int
 Output   :           int
 Description  :       Returns list of numbers where length is greater that 5
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Length = lambda No : len(No) > 5

"""
Application to returns list of numbers where length is greater that 5 of int value
"""

def main():

    Data = ["Jay Ganesh", "marvellous", "Pune", "Sharvari"]

    fData = list(filter(Length, Data))

    print(fData)

if __name__ == "__main__":
    main()

"""
Input   :   ["Jay Ganesh", "marvellous", "Pune", "Sharvari"]
Output  :   ['Jay Ganesh', 'marvellous', 'Sharvari']
"""