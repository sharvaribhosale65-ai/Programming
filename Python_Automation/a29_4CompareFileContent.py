import sys

def CompareFileContent(fName1, fName2):
    try:
        fObj1 = open(fName1, "r")
        fObj2 = open(fName2, "r")

        data1 = fObj1.read()
        data2 = fObj2.read()

        if(data1 == data2):
            print("Success")
        else:
            print("Failure")

        fObj1.close()
        fObj2.close()
    
    except FileNotFoundError as fObj:
        print("File Not Found")


def main():

    CompareFileContent(sys.argv[1], sys.argv[2])
    

if __name__ == "__main__":
    main()

"""
Input   :   python a29_4CompareFileContent.py Demo.txt Marvellous.txt
Output  :   Success

Input   :   python a29_4CompareFileContent.py Demo.txt Abc.txt
Output  :   File Not Found

Input   :   python a29_4CompareFileContent.py Demo.txt Fun.txt
Output  :   Failure
"""