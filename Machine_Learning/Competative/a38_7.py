import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

pass_students = df[df["FinalResult"] == 1]
fail_students = df[df["FinalResult"] == 0]

# Scatter plot
plt.scatter(
    pass_students["StudyHours"],
    pass_students["PreviousScore"],
    label="Pass"
)

plt.scatter(
    fail_students["StudyHours"],
    fail_students["PreviousScore"],
    label="Fail"
)

plt.xlabel("Study Hours")
plt.ylabel("Previous Score")
plt.title("Study Hours vs Previous Score")
plt.legend()
plt.show()