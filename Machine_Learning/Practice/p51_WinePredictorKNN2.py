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

    df.dropna(inplace=True)            #row contains one column missing value it removes whole row

    print("Shape of dataset : ",df.shape)       #all dataset (178, 14)
    print("Total records : ",df.shape[0])       #rows excluding columns(178)
    print("Total columns : ", df.shape[1])      #columns (14)

    print(border)

    

def main():
    MarvellousClassifier("WinePredictor.csv")

if __name__ == "__main__":
    main()