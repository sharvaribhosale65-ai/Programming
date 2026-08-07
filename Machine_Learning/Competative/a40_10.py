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
# Split Dataset
#########################################################

X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.20, random_state=42
)

#########################################################
# Train Decision Tree (max_depth = None)
#########################################################

model = DecisionTreeClassifier(max_depth=None, random_state=42)
model.fit(X_train, y_train)

#########################################################
# Training Accuracy
#########################################################

train_prediction = model.predict(X_train)
train_accuracy = accuracy_score(y_train, train_prediction)

#########################################################
# Testing Accuracy
#########################################################

test_prediction = model.predict(X_test)
test_accuracy = accuracy_score(y_test, test_prediction)

#########################################################
# Display Results
#########################################################

print("Training Accuracy :", round(train_accuracy * 100, 2), "%")
print("Testing Accuracy  :", round(test_accuracy * 100, 2), "%")

#########################################################
# Conclusion
#########################################################

if train_accuracy == 1.0 and test_accuracy < 1.0:
    print("\nConclusion:")
    print("The model is overfitting.")
    print("It has learned the training data perfectly,")
    print("including noise and small details,")
    print("so its performance on unseen test data is lower.")
elif train_accuracy == test_accuracy:
    print("\nConclusion:")
    print("The model performs equally well on both training and testing data.")
    print("There is no sign of overfitting.")
else:
    print("\nConclusion:")
    print("The model is performing reasonably well.")


"""
Output :

Training Accuracy : 100.0 %
Testing Accuracy  : 100.0 %

Conclusion:
The model performs equally well on both training and testing data.
There is no sign of overfitting.

"""