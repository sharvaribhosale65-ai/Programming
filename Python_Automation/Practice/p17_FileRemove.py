import os

def main():

    try : 
        #fObj.remove() -> not applicable
        os.remove("Demo.txt")     
        
    except FileNotFoundError as fObj:
        print("File is not present in current directory")      


if __name__ == "__main__":
    main()