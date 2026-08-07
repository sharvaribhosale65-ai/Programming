import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

plt.scatter(df["SleepHours"],df["FinalResult"])
plt.xlabel("Sleep Hours")
plt.ylabel("Final Result(0 = Fail, 1 = Pass)")
plt.title("Sleep Hours vs Final Result")
plt.show()