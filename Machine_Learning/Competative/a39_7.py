import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier

# Load dataset
df = pd.read_csv("student_performance_ml.csv")

# Features and Target
X = df[["StudyHours", "Attendance", "PreviousScore",
        "AssignmentsCompleted", "SleepHours"]]
y = df["FinalResult"]

# Split dataset
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.2, random_state=42
)

# Train the model
model = DecisionTreeClassifier(random_state=42)
model.fit(X_train, y_train)

# New student's data
student = [[6, 85, 66, 7, 7]]

# Predict result
prediction = model.predict(student)

print("Predicted Result :", prediction[0])

if prediction[0] == "Pass":
    print("The student will Pass.")
else:
    print("The student will Fail.")

"""
Output  :

Predicted Result : 1
The student will Fail.

"""