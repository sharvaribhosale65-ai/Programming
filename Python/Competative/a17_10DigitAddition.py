def DigitAddition(No):

    Digit = 0
    Sum = 0

    while(No != 0):
        Digit = No % 10
        Sum = Sum + Digit
        No = No // 10

    return Sum

def main():

    Value = int(input("Enter the number : "))
    
    Ret = DigitAddition(Value)

    print("Number of digits are : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5187934 
Output  :   37

Input   :   12345 
Output  :   15
"""