import pandas as pd

def main():

    sObj = pd.Series([11, 21, 51, 101], index = [5, 6, 7, 8])       #customized index
    print(sObj)

    print(sObj[7])

if __name__ == "__main__":
    main()