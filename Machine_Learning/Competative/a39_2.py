import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, confusion_matrix

df = pd.read_csv("student_performance_ml.csv")

X = df[["StudyHours","Attendance","PreviousScore","AssignmentsCompleted","SleepHours"]]
y = df["FinalResult"]

X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

model = DecisionTreeClassifier(random_state=42)

model.fit(X_train, y_train)

print("Model trained successfully!")

Result = model.predict(X_test)

print("\nActual vs Predicted Results:\n")
result_df = pd.DataFrame({"Actual Result": y_test.values, "Predicted Result": Result})

print(result_df)


"""
Output :
    
Model trained successfully!

Actual vs Predicted Results:

   Actual Result  Predicted Result
0              1                 1
1              0                 0
2              0                 0
3              0                 0
4              0                 0
5              0                 0
"""