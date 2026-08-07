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

# Train Decision Tree Model
model = DecisionTreeClassifier(random_state=42)
model.fit(X_train, y_train)

# Display Feature Importance
print("Feature Importance Scores:\n")

importance = model.feature_importances_

for feature, score in zip(X.columns, importance):
    print(feature, ":", round(score, 4))

# Find most and least important feature
most_important = X.columns[importance.argmax()]
least_important = X.columns[importance.argmin()]

print("\nMost Important Feature :", most_important)
print("Least Important Feature :", least_important)

"""
Output :

Feature Importance Scores:

StudyHours : 0.0
Attendance : 1.0
PreviousScore : 0.0
AssignmentsCompleted : 0.0
SleepHours : 0.0

Most Important Feature : Attendance
Least Important Feature : StudyHours
"""