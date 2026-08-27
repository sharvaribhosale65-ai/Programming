
import pandas as pd

def IrisCaseStudy():

    border = "-"*50

    ############################################################
    #   Step 1  :   Load the dataset
    ############################################################
    
    print(border)
    print("Step 1 : Load the dataset")
    print(border)

    df = pd.read_csv("iris.csv")

    print("Some few data from iris : ")
    print(df.head(10))

    ############################################################
    #   Step 2  :   Exploratory data analysis
    ############################################################

    print(border)
    print("Step 2 : Exploratory data analysis")
    print(border)

    print("Shape of the dataset : ", df.shape)

    print("Column names : ", list(df.columns))

    print("Statistical report of dataset : ")
    print(df.describe())  

def main():
    IrisCaseStudy()


if __name__ == "__main__":
    main()