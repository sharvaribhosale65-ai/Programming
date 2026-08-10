import pandas as pd

Border = "-"*30

########################################
# Step 1 : Load the dataset
########################################

print(Border)
print("Step 1 : Load the dataset")
print(Border)

DataPath = "iris.csv"

df = pd.read_csv(DataPath)

print("Dataset loaded succefully")
print("Initial entries from dataset are. : ")
print(df.head())

########################################
# Step 2 : Data Analysis (EDA)
########################################

print(Border)
print("Step 2 : Data Analysis (EDA)")
print(Border)

print("Shape of dataset : ",df.shape)       

print("Column names : ",list(df.columns))       #header of columns

print("Mising values per column : ")
print(df.isnull().sum())            #if any column of row is empty then it displays

print("Class distribution (species count) : ")
print(df["species"].value_counts())     #total count of all species 50 50 50

print("Statistical report of dataset : ")
print(df.describe())        #generate whole report means csv (total count, mean, SD, max, min)