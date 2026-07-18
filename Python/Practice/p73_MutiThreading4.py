import threading

def Display(No):                                                #def Display(*No)   

    print(f"Inside Display {No}: ",threading.get_ident())        

def main():
    print("Inside main : ",threading.get_ident())

    tObj = threading.Thread(target=Display, args=(11,))          #reffer DataType.X file          

    tObj.start()                                                

if __name__ == "__main__":
    main()

