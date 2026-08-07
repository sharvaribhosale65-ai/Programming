import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

# Load dataset
df = pd.read_csv("student_performance_ml.csv")

y = df["FinalResult"]

####################################################
# Model 1 : Full Feature Model
####################################################

X_full = df[["StudyHours", "Attendance",
             "PreviousScore", "AssignmentsCompleted",
             "SleepHours"]]

X_train, X_test, y_train, y_test = train_test_split(
    X_full, y, test_size=0.2, random_state=42
)

model_full = DecisionTreeClassifier(random_state=42)
model_full.fit(X_train, y_train)

prediction_full = model_full.predict(X_test)

accuracy_full = accuracy_score(y_test, prediction_full)

####################################################
# Model 2 : Only StudyHours and Attendance
####################################################

X_reduced = df[["StudyHours", "Attendance"]]

X_train, X_test, y_train, y_test = train_test_split(
    X_reduced, y, test_size=0.2, random_state=42
)

model_reduced = DecisionTreeClassifier(random_state=42)
model_reduced.fit(X_train, y_train)

prediction_reduced = model_reduced.predict(X_test)

accuracy_reduced = accuracy_score(y_test, prediction_reduced)

####################################################
# Compare Results
####################################################

print("Accuracy using all features       :", round(accuracy_full * 100, 2), "%")
print("Accuracy using 2 features only    :", round(accuracy_reduced * 100, 2), "%")

if accuracy_reduced >= accuracy_full:
    print("\nConclusion: The model still performs well using only StudyHours and Attendance.")
elif accuracy_full - accuracy_reduced <= 0.05:
    print("\nConclusion: The model performs reasonably well, with only a small decrease in accuracy.")
else:
    print("\nConclusion: The model performance decreases significantly. Additional features are important.")


"""
Output :

Accuracy using all features       : 100.0 %
Accuracy using 2 features only    : 100.0 %

Conclusion: The model still performs well using only StudyHours and Attendance.

"""