import sys

def CopyFileContent(fName):
    try:
        fObj1 = open(fName, "r")
        fObj2 = open("Marvellous.txt","w")

        data = fObj1.read()
        fObj2.write(data)

        fObj1.close()
        fObj2.close()

        print("File copied successfully")
    
    except FileNotFoundError as fObj:
        print("File Not Found")


def main():

    CopyFileContent(sys.argv[1])
    

if __name__ == "__main__":
    main()

"""
Input   :   python a29_3CopyFileContent.py Demo.txt
Output  :   File copied successfully
"""