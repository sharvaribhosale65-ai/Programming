import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score

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

# Train model
model = DecisionTreeClassifier(random_state=42)
model.fit(X_train, y_train)

# Predict on training data
train_prediction = model.predict(X_train)

# Predict on testing data
test_prediction = model.predict(X_test)

# Calculate accuracies
training_accuracy = accuracy_score(y_train, train_prediction)
testing_accuracy = accuracy_score(y_test, test_prediction)

print("Training Accuracy :", round(training_accuracy * 100, 2), "%")
print("Testing Accuracy  :", round(testing_accuracy * 100, 2), "%")

# Compare and comment
difference = training_accuracy - testing_accuracy

if difference > 0.10:
    print("Comment : The model is Overfitting.")
elif training_accuracy < 0.70 and testing_accuracy < 0.70:
    print("Comment : The model is Underfitting.")
else:
    print("Comment : The model is Well-fitted.")

"""
Output :

Training Accuracy : 100.0 %
Testing Accuracy  : 100.0 %
Comment : The model is Well-fitted.

"""