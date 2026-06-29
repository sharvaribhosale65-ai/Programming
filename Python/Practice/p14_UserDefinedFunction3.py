#Accept :   One parameter
#Return :   One value

def Marvellous(Value):
    print("Inside marvellous : ",Value)
    return 21

def main():
    ret = Marvellous(11)
    print("Return value is : ",ret)

if __name__ == '__main__':
    main()