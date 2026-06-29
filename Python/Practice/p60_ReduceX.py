from functools import reduce

def chkEven(No):
    return (No % 2 == 0)

def Increment(No):
    return No+1

def Addition(No1, No2):
    return No1 + No2

def main():
    Data = [13, 12, 8, 10, 11, 20]

    print("Input data is : ",Data)

    fData = list(filter(chkEven, Data))     
    print("Data after filter : ",fData)

    mData = list(map(Increment, fData))
    print("Data after map : ",mData)

    rData = reduce(Addition, mData)
    print("Data after reduce : ",rData)


if __name__ == "__main__":
    main()