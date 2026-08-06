#check
import pandas as pd

import matplotlib.pyplot as plt
import seaborn as sns

from sklearn.model_selection import train_test_split

Border = "-"*30

##################################################
# Step 1 : Load the data set
##################################################

print(Border)
print("Step 1 : Load the data set")
print(Border)

Datapath = "iris.csv"       

df = pd.read_csv(Datapath)      #df - data frame

print("Dataset loaded sucessfully")
print("Initial entries from dataset are : ")
print(df.head())

##################################################
# Step 2 : Exploratory Data Analysis (EDA)
##################################################

print(Border)
print("Step 2 : Exploratory Data Analysis")
print(Border)

print("Shape of dataset : ",df.shape)     #shape is property

print("Column names : ",list(df.columns))

print("Missing values per column : ")
print(df.isnull().sum)                    #canonical function call

print("Class distribution (species count) : ")
print(df["species"].value_counts())

print("Statistical report of dataset : ")
print(df.describe())

##################################################
# Step 3 : Decide independent and dependent variables
##################################################

print(Border)
print("Step 3 : Decide independent and dependent variables")
print(Border)

# X : Independent variable(features)
# Y : Dependent variable(labels)

feature_cols = [
                "sepal length (cm)",
                "sepal width (cm)",
                "petal length (cm)",
                "petal width (cm)"
                ]                           #from csv

X = df[feature_cols]
Y = df["species"]

print("X Shape : ",X.shape)
print("Y Shape : ",Y.shape)

##################################################
# Step 4 : Visualization of Dataset
##################################################

print(Border)
print("Step 4 : Visualization of Dataset")
print(Border)

#scatter plot
plt.figure(figsize=(7, 5))

for sp in df["species"].unique():

    temp = df[df["species"] == sp]
    plt.scatter(temp["petal length (cm)"], temp["petal width (cm)"], label = sp)

plt.title("Marvellous Iris Case Study")

plt.xlabel("petal length (cm)")
plt.ylabel("petal width (cm)")

plt.legend()
plt.grid()
plt.show()

##################################################
# Step 5 : Split the dataset for training and testing
##################################################

print(Border)
print("Step 5 : Split the dataset for training and testing")
print(Border)

X_train, X_test, Y_train, Y_test = train_test_split(X, Y,test_size=0.5, random_state=42)       #random state - shuffle

print("Dataset splitting activity done")

print("X : ",X.shape)       #(150, 4)
print("Y : ", Y.shape)      #(150,)

print("X_train : ", X_train.shape)      #(75, 4)
print("X_test : ", X_test.shape)        #(75, 4)

print("Y_train : ", Y_train.shape)      #(75,)
print("Y_test : ", Y_test.shape)        #(75,)