import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

#########################################################
# Load Dataset
#########################################################

df = pd.read_csv("student_performance_ml.csv")

#########################################################
# Create New Feature
#########################################################

df["PerformanceIndex"] = (df["StudyHours"] * 2) + df["Attendance"]

#########################################################
# Target Variable
#########################################################

y = df["FinalResult"]

#########################################################
# Model 1 : Without PerformanceIndex
#########################################################

X1 = df[["StudyHours",
         "Attendance",
         "PreviousScore",
         "AssignmentsCompleted",
         "SleepHours"]]

X1_train, X1_test, y_train, y_test = train_test_split(
    X1, y, test_size=0.20, random_state=42
)

model1 = DecisionTreeClassifier(random_state=42)
model1.fit(X1_train, y_train)

prediction1 = model1.predict(X1_test)

accuracy1 = accuracy_score(y_test, prediction1)

#########################################################
# Model 2 : With PerformanceIndex
#########################################################

X2 = df[["StudyHours",
         "Attendance",
         "PreviousScore",
         "AssignmentsCompleted",
         "SleepHours",
         "PerformanceIndex"]]

X2_train, X2_test, y_train, y_test = train_test_split(
    X2, y, test_size=0.20, random_state=42
)

model2 = DecisionTreeClassifier(random_state=42)
model2.fit(X2_train, y_train)

prediction2 = model2.predict(X2_test)

accuracy2 = accuracy_score(y_test, prediction2)

#########################################################
# Compare Accuracy
#########################################################

print("Accuracy without PerformanceIndex :", round(accuracy1 * 100, 2), "%")
print("Accuracy with PerformanceIndex    :", round(accuracy2 * 100, 2), "%")

#########################################################
# Conclusion
#########################################################

if accuracy2 > accuracy1:
    print("\nConclusion: Accuracy improved after adding PerformanceIndex.")
elif accuracy2 < accuracy1:
    print("\nConclusion: Accuracy decreased after adding PerformanceIndex.")
else:
    print("\nConclusion: Accuracy did not change after adding PerformanceIndex.")


"""
Output :

Accuracy without PerformanceIndex : 100.0 %
Accuracy with PerformanceIndex    : 100.0 %

Conclusion: Accuracy did not change after adding PerformanceIndex.

"""