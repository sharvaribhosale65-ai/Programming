import threading

def Display(No1, No2, No3):                                                #def Display(*No)   

    print(f"Inside Display {No1}, {No2}, {No3}: ",threading.get_ident())        

def main():
    print("Inside main : ",threading.get_ident())

    tObj = threading.Thread(target=Display, args=(11,21,51,))          #reffer DataType.X file  
                                                                        # last (,) for tuple        

    tObj.start()                                                

if __name__ == "__main__":
    main()

