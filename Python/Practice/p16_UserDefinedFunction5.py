#Accept :   Multiple parameters
#Return :   Multiple values

def Marvellous(Value1, Value2):
    print("Inside marvellous : ",Value1, Value2)
    return 21, 51

def main():
    ret1, ret2 = Marvellous(10, 20)
    print("Return values are : ",ret1, ret2)

if __name__ == '__main__':
    main()