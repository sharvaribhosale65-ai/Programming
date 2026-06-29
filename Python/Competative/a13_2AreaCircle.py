"""
Algorithm   :
    Accept the radius as rad
    Perform the area of circle
    Display the result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def DisplayArea(rad):

    pi = 3.14
    Circle = pi*rad*rad

    return Circle

def main():

    Value = int(input("Enter the radius : "))

    Ret = DisplayArea(Value)

    print("Area of circle is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   4
Output  :   50.24
"""