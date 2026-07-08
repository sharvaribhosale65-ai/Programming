import threading

def CheckPrime(No):
    if No < 2:
        return False

    for i in range(2, No):
        if No % i == 0:
            return False
    return True

def Prime(Arr):
    print("Prime numbers are:")
    for i in Arr:
        if CheckPrime(i):
            print(i, end=" ")
    print()

def NonPrime(Arr):
    print("Non Prime numbers are:")
    for i in Arr:
        if not CheckPrime(i):
            print(i, end=" ")
    print()

def main():
    Arr = list(map(int, input("Enter numbers: ").split()))

    t1 = threading.Thread(target=Prime, args=(Arr,))
    t2 = threading.Thread(target=NonPrime, args=(Arr,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

if __name__ == "_main_":
    main()