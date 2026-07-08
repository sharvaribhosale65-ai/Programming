import threading

def EvenFactor(No):
    Sum = 0

    #print("Even factors are:", end=" ")
    for i in range(2, No + 1, 2):
        if No % i == 0:
            print(i, end=" ")
            Sum += i

    print("\nSum of even factors:", Sum)


def OddFactor(No):
    Sum = 0

    #print("Odd factors are:", end=" ")
    for i in range(1, No + 1, 2):
        if No % i == 0:
            print(i, end=" ")
            Sum += i

    print("\nSum of odd factors:", Sum)


def main():
    Value = int(input("Enter number: "))

    t1 = threading.Thread(target=EvenFactor, args=(Value,))
    t2 = threading.Thread(target=OddFactor, args=(Value,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    print("Exit from main")


if __name__ == "__main__":
    main()


