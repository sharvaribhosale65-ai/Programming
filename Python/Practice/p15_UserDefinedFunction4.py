#Accept :   Multiple parameters
#Return :   One value

def Marvellous(Value1, Value2):
    print("Inside marvellous : ",Value1, Value2)
    return 21

def main():
    ret = Marvellous(10, 20)
    print("Return value is : ",ret)

if __name__ == '__main__':
    main()