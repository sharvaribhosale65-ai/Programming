"""
Algorithm   :
    Accept a length as No1
    Accept a width as No2
    Perform the area of rectangle
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplayArea(No1, No2):

    Area = No1 * No2
    return Area

def main():

    Value1 = int(input("Enter length : "))
    Value2 = int(input("Enter width : "))

    Ret = DisplayArea(Value1, Value2)

    print("Area of rectangle is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   10, 11
Output  :   110
"""