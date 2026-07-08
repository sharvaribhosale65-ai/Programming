def DisplayMax(No):
    Max = No[0]
    for i in No:
        if (i > Max):
            Max = i
    return Max


def main():

    Value = int(input("Enter the number of elements : "))
    
    data = list()

    print("Enter the elements : ")
    for i in range(Value):
        no = int(input())
        data.append(no)

    Ret = DisplayMax(data)

    print("Maximum number form list : ", Ret)

if __name__ == "__main__":
    main()

"""
Input   :   5
            3 6 8 9 1 
Output  :   9
"""