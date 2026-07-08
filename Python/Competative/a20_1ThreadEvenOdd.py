import threading
import time

def DisplayEven(No):

    for i in range(2,No+1,2):
        print("Even numbers are : ",i,end="\t")

def DisplayOdd(No):

    for i in range(1,No+1,2):
        print("Odd numbers are : ",i,end="\t")

def main():

    start_time = time.perf_counter()

    tObj1 = threading.Thread(target=DisplayEven, args=(40,))
    tObj2 = threading.Thread(target=DisplayOdd, args=(40,))

    tObj1.start()
    tObj2.start()
    
    tObj1.join()
    tObj2.join()

    end_time = time.perf_counter()

    print(f"Time required is {end_time - start_time:.4f}")

if __name__ == "__main__":
    main()