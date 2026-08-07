import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier

#########################################################
# Load Dataset
#########################################################

df = pd.read_csv("student_performance_ml.csv")

#########################################################
# Select Features and Target
#########################################################

X = df[["StudyHours",
        "Attendance",
        "PreviousScore",
        "AssignmentsCompleted",
        "SleepHours"]]

y = df["FinalResult"]

#########################################################
# Split Dataset
#########################################################

X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.20,
    random_state=42
)

#########################################################
# Train Model
#########################################################

model = DecisionTreeClassifier(random_state=42)
model.fit(X_train, y_train)

#########################################################
# Predict Results
#########################################################

y_pred = model.predict(X_test)

#########################################################
# Display Misclassified Students
#########################################################

result = X_test.copy()

result["Actual"] = y_test.values
result["Predicted"] = y_pred

misclassified = result[result["Actual"] != result["Predicted"]]

print("Misclassified Students:\n")
print(misclassified)

#########################################################
# Count Misclassified Students
#########################################################

print("\nNumber of Misclassified Students :", len(misclassified))

#########################################################
# Observation
#########################################################

if len(misclassified) == 0:
    print("\nObservation:")
    print("No students were misclassified.")
    print("The model predicted every test sample correctly.")
else:
    print("\nObservation:")
    print("Misclassified students are those where the predicted result")
    print("does not match the actual result.")
    print("These students usually have feature values that are close")
    print("to the decision boundary, making them difficult to classify.")

"""
Output :

Misclassified Students:

Empty DataFrame
Columns: [StudyHours, Attendance, PreviousScore, AssignmentsCompleted, SleepHours, Actual, Predicted]
Index: []

Number of Misclassified Students : 0

Observation:
No students were misclassified.
The model predicted every test sample correctly.

"""