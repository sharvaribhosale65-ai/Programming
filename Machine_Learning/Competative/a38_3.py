import pandas as pd

df = pd.read_csv("student_performance_ml.csv")

print("Data loaded successfully")

avg_study_hrs = df["StudyHours"].mean()
avg_attendance = df["Attendance"].mean()
max_prev_score = df["PreviousScore"].max()
min_sleep_hrs = df["SleepHours"].min()

print("\nAverage study hours : ", avg_study_hrs)
print("\nAverage attendance : ",avg_attendance)
print("\nMaximum previous score : ",max_prev_score)
print("\nMinimum sleep hours : ",min_sleep_hrs)