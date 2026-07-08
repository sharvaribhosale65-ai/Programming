
def Display(No):

    length = len(No)
    return length

def main():

    Value = input("Enter the name : ")
    Ret = Display(Value)
    print(f"Length of {Value} is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   Jay Ganesh
Output  :   10

Input   :   hello 
Output  :   5
"""