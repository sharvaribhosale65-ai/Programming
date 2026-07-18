def main():

    Ans = 0
    try:
    
        print("Enter first number : ")
        No1 = int(input())

        print("Enter second number : ")
        No2 = int(input())

        Ans = No1 / No2

    except ZeroDivisionError as zObj:               #specific except
        print("Exception occured due to second operand is zero : ", zObj)

    except ValueError as vObj:                      #specific except
        print("Exception occured due to invalid datatype : ", vObj)

    except Exception as eObj:                       #generic except
        print("Exception occuured : ",eObj)

    print("Result is : ",Ans)

if __name__ == "__main__":
    main()