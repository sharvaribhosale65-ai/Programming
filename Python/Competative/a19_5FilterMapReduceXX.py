from functools import reduce

FilterX = lambda iNo : iNo > 1 and all(iNo % i != 0 for i in range(2, iNo))

MapX = lambda iNo : iNo * 2

ReduceX = lambda iNo1, iNo2 : iNo1 if iNo1 > iNo2 else iNo2

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
Input   :   8
            2 70 11 10 17 23 31 77

Output  :   List after filter :  [2, 11, 17, 23, 31]
            List after map :  [4, 22, 34, 46, 62]
            List after reduce :  62
"""