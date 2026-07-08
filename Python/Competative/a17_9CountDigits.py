def CountDigits(No):

    Digit = 0
    Count = 0

    while(No != 0):
        Digit = No % 10
        Count = Count + 1
        No = No // 10

    return Count

def main():

    Value = int(input("Enter the number : "))
    
    Ret = CountDigits(Value)

    print("Number of digits are : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5187934 
Output  :   7

Input   :   12345 
Output  :   5
"""