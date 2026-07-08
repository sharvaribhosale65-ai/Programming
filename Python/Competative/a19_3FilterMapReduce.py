from functools import reduce

FilterX = lambda iNo : iNo >= 70 and iNo <= 90

MapX = lambda iNo : iNo + 10

ReduceX = lambda iNo1, iNo2 : iNo1 * iNo2

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
Input   :   12
            4   34  36  76  68  24  89  23  86  90  45  70

Output  :   List after filter :  [76, 89, 86, 90, 70]
            List after map :  [86, 99, 96, 100, 80]
            List after reduce :  6538752000
"""