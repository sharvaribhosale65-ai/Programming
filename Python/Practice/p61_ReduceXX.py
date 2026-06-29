from functools import reduce

chkEven = lambda No : (No % 2 == 0)

Increment = lambda No : No+1
 
Addition = lambda No1, No2 : No1 + No2


def main():
    Data = [13, 12, 8, 10, 11, 20]

    print("Input data is : ",Data)

    fData = list(filter(chkEven, Data))     
    print("Data after filter : ",fData)

    mData = list(map(Increment, fData))
    print("Data after map : ",mData)

    rData = reduce(Addition, mData)         #we import funtools so we dont use typcast
    print("Data after reduce : ",rData)


if __name__ == "__main__":
    main()