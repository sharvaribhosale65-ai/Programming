import threading

def Maximum(Arr):
    print("Maximum element:", max(Arr))

def Minimum(Arr):
    print("Minimum element:", min(Arr))

def main():
    Arr = list(map(int, input("Enter numbers: ").split()))

    t1 = threading.Thread(target=Maximum, args=(Arr,))
    t2 = threading.Thread(target=Minimum, args=(Arr,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

if __name__ == "_main_":
    main()