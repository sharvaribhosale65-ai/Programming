##############################################################
# Import Required Libraries
##############################################################

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

##############################################################
# Load Dataset
##############################################################

df = pd.read_csv("student_performance_ml.csv")

##############################################################
# Select Features and Target
##############################################################

X = df[["StudyHours",
        "Attendance",
        "PreviousScore",
        "AssignmentsCompleted",
        "SleepHours"]]

y = df["FinalResult"]

##############################################################
# Split Dataset
##############################################################

X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.20,
    random_state=42
)

##############################################################
# Train Model
##############################################################

model = DecisionTreeClassifier(random_state=42)
model.fit(X_train, y_train)

##############################################################
# Predict Results
##############################################################

prediction = model.predict(X_test)

##############################################################
# Manual Accuracy Calculation
##############################################################

correct = 0

for actual, predicted in zip(y_test, prediction):
    if actual == predicted:
        correct += 1

total = len(y_test)

manual_accuracy = (correct / total) * 100

print("Correct Predictions :", correct)
print("Total Predictions   :", total)
print("Manual Accuracy     :", round(manual_accuracy, 2), "%")

##############################################################
# Sklearn Accuracy
##############################################################

sklearn_accuracy = accuracy_score(y_test, prediction) * 100

print("Sklearn Accuracy    :", round(sklearn_accuracy, 2), "%")

##############################################################
# Verification
##############################################################

if round(manual_accuracy, 2) == round(sklearn_accuracy, 2):
    print("\nVerification Successful!")
    print("Manual accuracy matches sklearn accuracy.")
else:
    print("\nVerification Failed!")
    print("Manual accuracy does not match sklearn accuracy.")

"""
Output :

Correct Predictions : 6
Total Predictions   : 6
Manual Accuracy     : 100.0 %
Sklearn Accuracy    : 100.0 %

Verification Successful!
Manual accuracy matches sklearn accuracy.

"""