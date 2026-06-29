chkEven = lambda No : (No % 2 == 0)
Increment = lambda No : No+1
Addition = lambda No1, No2 : No1 + No2

def filterX(Task, Elements):        #(chkEven, Data)
    Result = []
    for No in Elements: 
        Ret = Task(No)      #chkEven(No)

        if(Ret == True):
            Result.append(No)

    return Result 

def mapX(Task, Elements):
    Result = []
    for No in Elements:

        Ret = Task(No)  #increment
        Result.append(Ret)

    return Result

def reduceX(Task, Elements):
    Result = []
    Sum = 0
    for No in Elements:
        
        Sum = Task(Sum, No)
    return Sum     

def main():
    Data = [13, 12, 8, 10, 11, 20]

    print("Input data is : ",Data)

    fData = list(filterX(chkEven, Data))     
    print("Data after filter : ",fData)

    mData = list(mapX(Increment, fData))
    print("Data after map : ",mData)

    rData = reduceX(Addition, mData)         
    print("Data after reduce : ",rData)


if __name__ == "__main__":
    main()