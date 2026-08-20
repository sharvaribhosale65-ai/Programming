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

    # Step 7 : Split the dataset

    print(border)
    print("Step 7 : Split the dataset")
    print(border)    

    X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size=0.2, random_state=42)

    print("Training data : ",X_train.shape)

    print("Testing data : ",X_test.shape)    

    # Step 8 : Create and train the model 

    print(border)
    print("Step 8 : Create and train the model ")
    print(border) 

    model = LinearRegression()

    model = model.fit(X_train, Y_train)
    print("Model trained successfully")

    # Step 9 : Test the model 

    print(border)
    print("Step 9 : Test the model ")
    print(border)

    y_Pred = model.predict(X_test)

    print("Expected answers : ")
    print(Y_test[:3])                   #first 3 values of Y_test.

    print("Predicted answers : ")
    print(y_Pred[:3])                   #first 3 predicted values.

def main():

    MarvellousRegression("Advertising.csv")

if __name__ == "__main__":
    main()