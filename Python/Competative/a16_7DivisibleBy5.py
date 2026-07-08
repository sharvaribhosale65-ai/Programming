def DisplayDivision(No):

    if(No % 5 == 0):
        return True
    else:
        return False


def main():

    Value = int(input("Enter the number : "))
    
    Ret = DisplayDivision(Value)

    if(Ret == True):
        print("It is divisible by 5")
    else:
        print("It is not divisible by 5")

if __name__ == "__main__":
    main()

"""
Input   : 10
Output  : It is divisible by 5

Input   : 33
Output  : It is not divisible by 5
"""