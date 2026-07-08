def ListAddition(No):
    Sum = 0
    for i in No:
        Sum = Sum + i
    return Sum

def main():

    Value = int(input("Enter the number of elements : "))
    
    data = list()

    print("Enter the elements : ")
    for i in range(Value):
        no = int(input())
        data.append(no)

    Ret = ListAddition(data)

    print("Addition is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   6
            13  5   45  7   4   56
Output  :   130

Input   :   5
            1   2   3   4   5 
Output  :   15
"""