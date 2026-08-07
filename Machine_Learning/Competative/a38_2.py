import pandas as pd

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

pCount = 0
fCount = 0

total_student = len(df)

pass_student = (df["FinalResult"] == 1).sum()

fail_student = (df["FinalResult"] == 0).sum()

print("\nTotal number of students : ", total_student)
print("\nNumber of students who passed : ",pass_student)
print("\nNumber of students who failed : ",fail_student)