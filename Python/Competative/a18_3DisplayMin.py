def DisplayMin(No):
    Min = No[0]
    for i in No:
        if(i < Min):
            Min = i
    return Min

def main():

    Value = int(input("Enter the number of elements : "))
    
    data = list()

    print("Enter the elements : ")
    for i in range(Value):
        no = int(input())
        data.append(no)

    Ret = DisplayMin(data)

    print("Minimum number form list : ", Ret)

if __name__ == "__main__":
    main()

"""
Input   :   4
            13  5   56  89 
Output  :   5
"""