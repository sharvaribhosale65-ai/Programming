import threading

def Display():
    for i in range(1, 51):
        print(i, end=" ")
    print()

def Reverse():
    for i in range(50, 0, -1):
        print(i, end=" ")
    print()

def main():
    t1 = threading.Thread(target=Display, name="Thread1")
    t2 = threading.Thread(target=Reverse, name="Thread2")

    t1.start()
    t1.join()      # Wait until Thread1 completes

    t2.start()
    t2.join()


if __name__ == "_main_":
    main()