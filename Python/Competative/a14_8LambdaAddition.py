""""
Algorithm   :
    START
        Accept first number as No1
        Accept second number as No2
        Perform the addition of that two numbers
        Display the result
    STOP   
"""

"""
 Function name    :   Addition
 Input    :           int, int
 Output   :           int
 Description  :       Perform the addition of two numbers
 Date :               02/07/2026 
 Author   :           Sharvari Gorakhnath Bhosale
"""

Addition = lambda No1, No2 : No1 + No2


"""
Application to perform the addition of two numbers of 2 int values
"""

def main():

    Value1 = int(input("Enter first number : "))
    Value2 = int(input("Enter second number : "))

    Ret = Addition(Value1, Value2)

    print("Addition is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   10  11
Output  :   21

Input   :   34  67
Output  :   101
"""