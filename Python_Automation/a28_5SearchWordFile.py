
def SearchWord(Filename, Wordsearch):

    try:
        fobj = open(Filename,"r")

        data = fobj.read()

        if Wordsearch in data:
            print(Wordsearch, "is present in filename")
        else:
            print(Wordsearch, "is not present in filename")

        fobj.close()

    except FileNotFoundError as obj:
        print("File not found")
        

def main():

    Name = input("Enter file name : ")
    Word = input("Enter word to search : ")

    SearchWord(Name, Word)

if __name__ == "__main__":
    main()

"""
Input   :   Demo.txt    Hello
Output  :   Hello is present in filename
"""