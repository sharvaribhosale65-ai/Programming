import pandas as pd

def main():

    sObj = pd.Series([27000, 32000, 35000], index = ["Amit", "Sagar", "Sagar"])       #customized index
    print(sObj)

    print(sObj["Sagar"])

if __name__ == "__main__":
    main()