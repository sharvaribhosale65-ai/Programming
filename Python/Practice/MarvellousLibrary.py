def filterX(Task, Elements):      
    Result = []
    for No in Elements: 
        Ret = Task(No)      

        if(Ret == True):
            Result.append(No)

    return Result 

def mapX(Task, Elements):
    Result = []
    for No in Elements:

        Ret = Task(No) 
        Result.append(Ret)

    return Result

def reduceX(Task, Elements):
    Result = []
    Sum = 0
    for No in Elements:
        
        Sum = Task(Sum, No)
    return Sum 