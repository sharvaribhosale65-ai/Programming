def main():

    try :
        fObj = open("Demo.txt","r")             
        print("file gets opened")

        print("File offset is : ",fObj.tell())      #0
        Data = fObj.read(10)            
        print(Data)                                 #Marvellous
        print("File offset is : ",fObj.tell())      #10

        Data = fObj.read(10)                        
        print(Data)
        print("File offset is : ",fObj.tell())      #20
        
        fObj.close()
        
    except FileNotFoundError as fObj:
        print("File is not present in current directory")      


if __name__ == "__main__":
    main()