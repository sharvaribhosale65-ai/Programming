import pandas as pd
import matplotlib.pyplot as plt

from sklearn.neighbors import KNeighborsClassifier
from sklearn.model_selection import train_test_split
from sklearn.metrics import accuracy_score, confusion_matrix
from sklearn.preprocessing import StandardScaler

def MarvellousClassifier(Datapath):

    border = "-"*40

    #Step 1 : Load dataset from CSV file

    print(border)
    print("Step 1 : Load dataset from CSV file")
    print(border)

    df = pd.read_csv(Datapath)

    print(border)
    print("Some entries from dataset : ")
    print(df.head())
    print(border)

    #Step 2 : Clean the dataset

    print(border)
    print("Step 2 : Clean the dataset")
    print(border)

    df.dropna(inplace=True)             

    print("Total records : ",df.shape[0])
    print("Total columns : ", df.shape[1])

    print(border)

    #Step 3 : Separate independent and dependent variables

    print(border)
    print("Step 3 : Separate independent and dependent variables")
    print(border)

    X = df.drop(columns= ['Class'])
    Y = df['Class']

    print("Shape of X : ",X.shape)
    print("Shape of Y : ",Y.shape)

    print(border)
    print("Input columns : ", X.columns.tolist())       #independent
    print("Output column : Class")      #dependent
    print(border)
    

def main():
    MarvellousClassifier("WinePredictor.csv")

if __name__ == "__main__":
    main()