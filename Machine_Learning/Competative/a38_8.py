import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

plt.boxplot(df["Attendance"])

plt.ylabel("Attendance")
plt.title("Attendance Box Plot")
plt.show()