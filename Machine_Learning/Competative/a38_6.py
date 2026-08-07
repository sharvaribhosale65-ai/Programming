import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

plt.hist(df["StudyHours"], bins=5)
plt.xlabel("Study hours")
plt.ylabel("Number of students")
plt.title("Distribution of study hours")
plt.show()