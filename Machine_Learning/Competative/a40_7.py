import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

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
# Train Model with Different Random States
#########################################################

random_states = [0, 10, 42]

print("Testing Accuracy for Different Random States\n")

for rs in random_states:

    # Split dataset
    X_train, X_test, y_train, y_test = train_test_split(
        X,
        y,
        test_size=0.20,
        random_state=rs
    )

    # Train model
    model = DecisionTreeClassifier(random_state=rs)
    model.fit(X_train, y_train)

    # Predict
    prediction = model.predict(X_test)

    # Calculate accuracy
    accuracy = accuracy_score(y_test, prediction)

    print("Random State =", rs,
          "-> Testing Accuracy =", round(accuracy * 100, 2), "%")
    
"""
Output :

Testing Accuracy for Different Random States

Random State = 0 -> Testing Accuracy = 83.33 %
Random State = 10 -> Testing Accuracy = 83.33 %
Random State = 42 -> Testing Accuracy = 100.0 %

"""