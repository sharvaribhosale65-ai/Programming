import threading

Sum = 0
Product = 1

def CalculateSum(Arr):
    global Sum

    for i in Arr:
        Sum += i

def CalculateProduct(Arr):
    global Product

    for i in Arr:
        Product *= i

def main():
    global Sum, Product

    Arr = list(map(int, input("Enter numbers: ").split()))

    t1 = threading.Thread(target=CalculateSum, args=(Arr,))
    t2 = threading.Thread(target=CalculateProduct, args=(Arr,))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    print("Sum =", Sum)
    print("Product =", Product)

if __name__ == "_main_":
    main()