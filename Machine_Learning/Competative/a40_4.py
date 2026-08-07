##############################################################
# Import Required Libraries
##############################################################

import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier

##############################################################
# Step 1 : Load the Dataset
##############################################################

df = pd.read_csv("student_performance_ml.csv")

##############################################################
# Step 2 : Select Features and Target
##############################################################

X = df[["StudyHours",
        "Attendance",
        "PreviousScore",
        "AssignmentsCompleted",
        "SleepHours"]]

y = df["FinalResult"]

##############################################################
# Step 3 : Split Dataset into Training and Testing
##############################################################

X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.20,
    random_state=42
)

##############################################################
# Step 4 : Train Decision Tree Model
##############################################################

model = DecisionTreeClassifier(random_state=42)

model.fit(X_train, y_train)

print("Model Trained Successfully...\n")

##############################################################
# Step 5 : Create DataFrame of 5 New Students
##############################################################

new_students = pd.DataFrame({
    "StudyHours": [6, 4, 8, 2, 7],
    "Attendance": [85, 70, 95, 60, 90],
    "PreviousScore": [66, 50, 88, 40, 75],
    "AssignmentsCompleted": [7, 4, 9, 2, 8],
    "SleepHours": [7, 6, 8, 5, 7]
})

##############################################################
# Step 6 : Predict Results
##############################################################

prediction = model.predict(new_students)

##############################################################
# Step 7 : Add Predictions to DataFrame
##############################################################

new_students["PredictedResult"] = prediction

##############################################################
# Step 8 : Display Predictions
##############################################################

print("Prediction of 5 New Students\n")
print(new_students)

##############################################################
# Step 9 : Display Pass/Fail Clearly (Optional)
##############################################################

print("\nPrediction in Pass/Fail Format:\n")

for i in range(len(new_students)):
    if prediction[i] == 0:
        result = "Pass"
    else:
        result = "Fail"

    print("Student", i + 1, ":", result)


"""
Output :

Model Trained Successfully...

Prediction of 5 New Students

   StudyHours  Attendance  PreviousScore  AssignmentsCompleted  SleepHours  PredictedResult
0           6          85             66                     7           7                1
1           4          70             50                     4           6                0
2           8          95             88                     9           8                1
3           2          60             40                     2           5                0
4           7          90             75                     8           7                1

Prediction in Pass/Fail Format:

Student 1 : Fail
Student 2 : Pass
Student 3 : Fail
Student 4 : Pass
Student 5 : Fail

"""