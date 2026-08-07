import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

plt.scatter(df["AssignmentsCompleted"],df["FinalResult"])
plt.xlabel("Assignments completed")
plt.ylabel("Final Result(0 = Fail, 1 = Pass)")
plt.title("Assignments completed vs Final Result")
plt.show()