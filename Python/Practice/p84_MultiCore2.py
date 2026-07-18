def DisplayCube(No):
    iSum = 0
    for i in range(1,No+1):
        iSum = iSum + (i ** 3)          #3 for cube
    return iSum

def main():

    Value = int(input("Enter the number : "))
    Ret = DisplayCube(Value)

    print("Cube is : ",Ret)

if __name__ == "__main__":
    main()