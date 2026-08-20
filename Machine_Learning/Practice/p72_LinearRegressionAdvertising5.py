import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

from sklearn.linear_model import LinearRegression
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error #mse, r2_score

def MarvellousRegression(Datapath):

    border = "-"*40

    # Step 1 : Load the data

    print(border)
    print("Step 1 : Load the data")
    print(border)

    df = pd.read_csv(Datapath)
    print(df.head())

    # Step 2 : Remove unwanted columns(EDA)

    print(border)
    print("Step 2 : Remove unwanted columns(EDA)")
    print(border)

    if "Unnamed: 0" in df.columns:
        df = df.drop(columns=["Unnamed: 0"])

    print(df.head())

    # Step 3 : Check missing values

    print(border)
    print("Step 3 : Check missing values")
    print(border)  

    print("Total missing values : ")
    print(border)
    print(df.isnull().sum()) 
    print(border)

    # Step 4 : Statistical summary

    print(border)
    print("Step 4 : Statistical summary")
    print(border)    

    print(df.describe())

    # Step 5 : Correlation

    print(border)
    print("Step 5 : Correlation")
    print(border)  

    print(df.corr())

    # Step 6 : Separate Indepedent and Dependent variables

    print(border)
    print("Step 6 : Separate Indepedent and Dependent variables")
    print(border) 

    X = df[["TV","radio","newspaper"]] 
    Y = df["sales"]

    print("Independent variables : ")
    print(X.head())

    print("Dependent variables : ")
    print(Y.head())    
    

def main():

    MarvellousRegression("Advertising.csv")

if __name__ == "__main__":
    main()