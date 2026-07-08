from functools import reduce

FilterX = lambda iNo : iNo % 2 == 0

MapX = lambda iNo : iNo ** 2

ReduceX = lambda iNo1, iNo2 : iNo1 + iNo2

def main():

    Value = int(input("Enter the number of elements : "))

    Data = list()

    print("Enter the elements : ")
    for i in range(Value):
        No = int(input())
        Data.append(No)

    fRet = list(filter(FilterX, Data))
    print("List after filter : ", fRet)

    mRet = list(map(MapX, fRet))
    print("List after map : ",mRet)

    rRet = reduce(ReduceX, mRet)
    print("List after reduce : ",rRet)

    

if __name__ == "__main__":
    main()

"""
Input   :   10
            5   2   3   4   3   4   1   2   8   10

Output  :   List after filter :  [2, 4, 4, 2, 8, 10]
            List after map :  [4, 16, 16, 4, 64, 100]
            List after reduce :  204
"""