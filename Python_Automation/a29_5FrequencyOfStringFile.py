import sys

def CompareFileContent(fName, str):
    try:

        fObj = open(fName, "r")
        data = fObj.read()

        Count = data.count(str)

        print("Frequency of "+str+" is : ",Count)

        fObj.close()
        return Count
    
    
    except FileNotFoundError as fObj:
        print("File Not Found")


def main():

    CompareFileContent(sys.argv[1], sys.argv[2])
    

if __name__ == "__main__":
    main()

"""
Input   :   python a29_5FrequencyOfStringfile.py Demo.txt Hello
Output  :   Frequency of Hello is :  1
"""