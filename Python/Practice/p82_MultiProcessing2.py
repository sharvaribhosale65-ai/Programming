#check

import os
import multiprocessing
import time

#2+4+6+8 = 20
def SumEven(No):
    print(f"PID of SumEven are : {os.getpid()} PPID of SumEven : {os.getppid}")
    Sum = 0
    for i in range(2,No,2):
        Sum = Sum + i

    print("Summation of even : ",Sum)


#1+3+5+7+9 = 25
def SumOdd(No):
    print(f"PID of SumOdd are : {os.getpid()} PPID of SumOdd : {os.getppid}")
    Sum = 0
    for i in range(1,No,2):
        Sum = Sum + i

    print("Summation of odd : ",Sum)



def main():

    print(f"PID of main are : {os.getpid()} PPID of main : {os.getppid}")

    start_time = time.perf_counter()

    tObj1 = multiprocessing.Process(target=SumEven,args=(100,))
    tObj2 = multiprocessing.Process(target=SumOdd,args=(100,))
                                     
    tObj1.start()
    tObj2.start()

    tObj1.join()
    tObj2.join()

    end_time = time.perf_counter()

    print(f"Time required is : {end_time - start_time:.4f}")

if __name__ == "__main__":
    main()

