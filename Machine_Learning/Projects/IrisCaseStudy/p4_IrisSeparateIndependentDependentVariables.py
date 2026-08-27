
import pandas as pd

def IrisCaseStudy():

    border = "-"*50

    ############################################################
    #   Step 1 : Load the dataset
    ############################################################
    
    print(border)
    print("Step 1 : Load the dataset")
    print(border)

    df = pd.read_csv("iris.csv")

    print("Some few data from iris : ")
    print(df.head(10))

    ############################################################
    #   Step 2 : Exploratory data analysis
    ############################################################

    print(border)
    print("Step 2 : Exploratory data analysis")
    print(border)

    print("Shape of the dataset : ", df.shape)

    print("Column names : ", list(df.columns))

    print("Statistical report of dataset : ")
    print(df.describe())  

    ############################################################
    #   Step 3 : Data cleaning
    ############################################################

    print(border)
    print("Step 3 : Data cleaning")
    print(border)

    print("Missing values per column : ")
    print(df.isnull().sum())

    ############################################################
    #   Step 4 : Separate Independent and Dependent Variables
    ############################################################

    print(border)
    print("Step 4 : Separate Independent and Dependent Variables")
    print(border)

    X = df.drop("species",axis=1)       #axis=1 means column
    Y = df["species"]

    print("Independent variables (features) are : ")
    print(X)

    print("Dependent variables (labels) are : ")
    print(Y)

def main():
    IrisCaseStudy()


if __name__ == "__main__":
    main()