import pandas as pd

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

result_count = df["FinalResult"].value_counts()

print("Distribution of final result : ",result_count)

total_students = len(df)

pass_percentage = (result_count[1] / total_students) * 100
print("Percentage of passed students : ", pass_percentage , "%")

fail_percentage = (result_count[0] / total_students) * 100
print("Percentage of failed students : ", fail_percentage , "%")