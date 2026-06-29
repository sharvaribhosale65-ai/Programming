"""
Algorithm   :
    Accept a number as No
    Print the factorial of that number  
    Display the result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplayFactorial(No):
    Fact = 1
    Sum = 0
    for i in range(1, No+1):
        Fact = Fact * i
        print(i)
    return Fact
        
        
def main():

    Value = int(input("Enter the number : "))

    Ret = DisplayFactorial(Value)

    print("Factorials are : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5
Output  :    120
"""