def SearchElement(No, Arr):
    Count = 0
    for i in No:
        if(i == Arr):
            Count = Count + 1
    return Count

def main():

    Value = int(input("Enter the number of elements : "))
    
    data = list()

    print("Enter the elements : ")
    for i in range(Value):
        no = int(input())
        data.append(no)

    Search = int(input("Enter element to search : "))

    Ret = SearchElement(data, Search)

    print(f"Frequency of {Search} is : ",Ret)

if __name__ == "__main__":
    main()

"""
Input   :   10
            1   2   7   9   0   2   6   2   4   8
            2
Output  :   3
"""