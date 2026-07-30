def main():

    try :
        fObj = open("Demo.txt","r")             
        print("file gets opened")

        print("File offset is : ",fObj.tell())
        Data = fObj.read(10)            #array(read form current offset)
        print(Data)
        print("File offset is : ",fObj.tell())
        
        fObj.close()
        
    except FileNotFoundError as fObj:
        print("File is not present in current directory")      


if __name__ == "__main__":
    main()