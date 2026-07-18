def main():

    Ans = 0
    try:
    
        print("Enter first number : ")
        No1 = int(input())

        print("Enter second number : ")
        No2 = int(input())

        Ans = No1 / No2
        print("Division is successfull...")
    
    except ZeroDivisionError as zObj:

        print("Exception occured due to second operand is zero : ", zObj)
    print("Result is : ",Ans)

if __name__ == "__main__":
    main()