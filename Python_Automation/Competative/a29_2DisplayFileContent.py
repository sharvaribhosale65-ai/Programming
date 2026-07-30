def DisplayFileContent(Filename):
    try:
        fObj = open(Filename,"r")
        data = fObj.read()
        print(data)
    
    except FileNotFoundError as fObj:
        print("File Not Found")


def main():

    Name = input("Enter the filename : ")

    DisplayFileContent(Name)

if __name__ == "__main__":
    main()

"""
Input   :   Demo.txt
Output  :   Hello
            Jay ganesh
            Marvellos infosystem

Input   :   Marvellous.txt
Output  :   File Not Found
"""