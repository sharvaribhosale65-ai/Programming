#check
import pandas as pd

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


