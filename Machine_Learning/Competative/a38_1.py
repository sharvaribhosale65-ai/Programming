import pandas as pd

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

print("\nFirst five records : ")
print(df.head())

print("\nLast five records : ")
print(df.tail())

print("\nTotal number of rows and columns : ")
print(df.shape)

print("\nList of column names : ")
print(list(df.columns))

print("\nData types of each column : ")
print(df.dtypes)