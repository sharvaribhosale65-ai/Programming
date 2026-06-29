chkEven = lambda No : (No % 2 == 0)

def main():
    Data = [13, 12, 8, 10, 11, 20]

    print("Input data is : ",Data)

    fData = list(filter(chkEven, Data))     #functional programming   Data - iterable, chkEven - function
                                            #sequence is important (function, iterable)
    print("Data after filter : ",fData)

if __name__ == "__main__":
    main()