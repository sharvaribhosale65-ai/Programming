import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

# Load dataset
df = pd.read_csv("student_performance_ml.csv")

####################################################
# Model 1 : With SleepHours
####################################################

X1 = df[["StudyHours", "Attendance", "PreviousScore",
          "AssignmentsCompleted", "SleepHours"]]

y = df["FinalResult"]

X1_train, X1_test, y_train, y_test = train_test_split(
    X1, y, test_size=0.2, random_state=42
)

model1 = DecisionTreeClassifier(random_state=42)
model1.fit(X1_train, y_train)

prediction1 = model1.predict(X1_test)

accuracy1 = accuracy_score(y_test, prediction1)

####################################################
# Model 2 : Without SleepHours
####################################################

X2 = df[["StudyHours", "Attendance",
          "PreviousScore", "AssignmentsCompleted"]]

X2_train, X2_test, y_train, y_test = train_test_split(
    X2, y, test_size=0.2, random_state=42
)

model2 = DecisionTreeClassifier(random_state=42)
model2.fit(X2_train, y_train)

prediction2 = model2.predict(X2_test)

accuracy2 = accuracy_score(y_test, prediction2)

####################################################
# Compare Results
####################################################

print("Accuracy with SleepHours    :", round(accuracy1 * 100, 2), "%")
print("Accuracy without SleepHours :", round(accuracy2 * 100, 2), "%")

if accuracy2 > accuracy1:
    print("\nConclusion: Removing SleepHours improved the model performance.")
elif accuracy2 < accuracy1:
    print("\nConclusion: Removing SleepHours reduced the model performance.")
else:
    print("\nConclusion: Removing SleepHours did not affect the model performance.")

"""
Output :

Accuracy with SleepHours    : 100.0 %
Accuracy without SleepHours : 100.0 %

Conclusion: Removing SleepHours did not affect the model performance.

"""