import threading

def EvenList(Data):
    Sum = 0

    print("Even elements:", end=" ")
    for i in Data:
        if i % 2 == 0:
            print(i, end=" ")
            Sum += i

    print("\nSum =", Sum)


def OddList(Data):
    Sum = 0

    print("Odd elements:", end=" ")
    for i in Data:
        if i % 2 != 0:
            print(i, end=" ")
            Sum += i

    print("\nSum =", Sum)


def main():
    Value = list(map(int, input("Enter numbers: ").split()))

    t1 = threading.Thread(target=EvenList, args=(Value,))
    t2 = threading.Thread(target=OddList, args=(Value,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()


if __name__ == "__main__":
    main()