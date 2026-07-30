def main():

    try :
        fObj = open("Demo.txt","w")           
        print("file gets opened")

        fObj.close()
        
    except FileNotFoundError as fObj:
        print("File is not present in current directory")      


if __name__ == "__main__":
    main()