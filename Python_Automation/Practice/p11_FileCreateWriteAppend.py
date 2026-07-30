def main():

    try :
        fObj = open("Demo.txt","a")             #a - append  
        print("file gets opened")

        fObj.write(" Pune Maharashtra")
        
        fObj.close()
        
    except FileNotFoundError as fObj:
        print("File is not present in current directory")      


if __name__ == "__main__":
    main()