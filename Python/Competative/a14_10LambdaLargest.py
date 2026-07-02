""""
Algorithm   :
    START
        Accept first number as No1
        Accept second number as No2
        Accept third number as No3
        Perform the largest number of that three numbers
        Display the result
    STOP   
"""

"""
 Function name    :   Largest
 Input    :           int, int
 Output   :           int
 Description  :       Perform the largest number of that three numbers
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Largest = lambda No1, No2, No3 : No1 if No1 > No2 and No1 > No3 else (No2 if No2 > No1 and No2 > No3 else No3) 

"""
Application to perform the largest number of that three numbers of 3 int values
"""

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))
    Value3 = int(input("Enter third number : "))

    Ret = Largest(Value1, Value2, Value3)

    print("Largest number is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :  11   21  51 
Output  :  51  
"""