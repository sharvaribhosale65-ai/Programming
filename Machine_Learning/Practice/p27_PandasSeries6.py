import pandas as pd

def main():

    sObj = pd.Series([11, 21, 51, 101], index = ["C", "C++", "Java", "Python"])       #customized index
    print(sObj)

    print(sObj["Python"])

if __name__ == "__main__":
    main()