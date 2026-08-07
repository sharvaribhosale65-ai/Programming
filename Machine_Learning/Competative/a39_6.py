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

# Different max_depth values
depths = [1, 3, None]

print("Testing Accuracy for Different Decision Tree Models\n")

for depth in depths:

    # Create model
    model = DecisionTreeClassifier(max_depth=depth, random_state=42)

    # Train model
    model.fit(X_train, y_train)

    # Predict on test data
    prediction = model.predict(X_test)

    # Calculate accuracy
    accuracy = accuracy_score(y_test, prediction)

    print("Max Depth =", depth, "-> Testing Accuracy =", round(accuracy * 100, 2), "%")

"""
Output  :

Testing Accuracy for Different Decision Tree Models

Max Depth = 1 -> Testing Accuracy = 100.0 %
Max Depth = 3 -> Testing Accuracy = 100.0 %
Max Depth = None -> Testing Accuracy = 100.0 %

"""