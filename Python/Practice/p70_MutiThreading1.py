import threading

def Display():
    print("Inside Display : ",threading.get_ident())        #get_ident(it is method to give thread id)

def main():
    print("Inside main : ",threading.get_ident()) 
    Display()

if __name__ == "__main__":
    main()

