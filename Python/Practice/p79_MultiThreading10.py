import threading
import time


def SumEven(No):
    print("TID of SumEven thread is : ",threading.get_ident())

#1+3+5+7+9 = 25
def SumOdd(No):
    print("TID of SumOdd thread is : ",threading.get_ident())


def main():

    print("TID of main thread is : ",threading.get_ident())
   

    start_time = time.perf_counter()

    tObj1 = threading.Thread(target=SumEven,args=(10000000,))
    tObj2 = threading.Thread(target=SumOdd,args=(10000000,))
                                     
    tObj1.start()
    tObj2.start()

    tObj1.join()
    tObj2.join()

    end_time = time.perf_counter()

    print(f"Time required is : {end_time - start_time:.4f}")

if __name__ == "__main__":
    main()

