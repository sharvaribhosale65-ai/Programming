import threading

Counter = 0
lock = threading.Lock()

def Increment():
    global Counter

    for i in range(100000):
        lock.acquire()
        Counter += 1
        lock.release()

def main():
    global Counter

    t1 = threading.Thread(target=Increment)
    t2 = threading.Thread(target=Increment)

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    print("Final Counter:", Counter)

if __name__ == "_main_":
    main()