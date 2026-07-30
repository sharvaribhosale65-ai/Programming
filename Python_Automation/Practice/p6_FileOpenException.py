def main():

    try :
        open("Demo.txt","r")
        print("file gets opened")

    except FileNotFoundError as fObj:
        print("File is not present in current directory")       #automation directory


if __name__ == "__main__":
    main()