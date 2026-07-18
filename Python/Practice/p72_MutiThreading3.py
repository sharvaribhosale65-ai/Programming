import threading

def Display(No):                                        #error
    print("Inside Display : ",threading.get_ident())        #get_ident(it is method to give thread id)

def main():
    print("Inside main : ",threading.get_ident())

    tObj = threading.Thread(target=Display)                       #tObj is object of class Thread

    tObj.start()                                                

if __name__ == "__main__":
    main()

