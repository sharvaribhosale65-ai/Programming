"""
seek(kuthe, kuthun)
kuthun = 0/1/2
0 - starting
1 - current 
2 - end
"""

def main():

    try :
        fObj = open("Demo.txt","r")             
        print("file gets opened")

        fObj.seek(10,0)             #10 offset la gelo 0 pasun
        Data = fObj.read()
        print(Data)

        fObj.close()
        
    except FileNotFoundError as fObj:
        print("File is not present in current directory")      


if __name__ == "__main__":
    main()