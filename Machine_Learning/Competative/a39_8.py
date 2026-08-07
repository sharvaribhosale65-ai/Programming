##############################################################
# Import Required Libraries
##############################################################

import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, confusion_matrix

##############################################################
# Step 1 : Load the Dataset
##############################################################

df = pd.read_csv("student_performance_ml.csv")

print("Dataset Loaded Successfully...\n")

##############################################################
# Step 2 : Data Analysis
##############################################################

print("First 5 Records")
print(df.head())

print("\nDataset Information")
print(df.info())

print("\nStatistical Summary")
print(df.describe())

print("\nMissing Values")
print(df.isnull().sum())

##############################################################
# Step 3 : Data Visualization
##############################################################

# Pass / Fail Count
plt.figure(figsize=(5,5))
df["FinalResult"].value_counts().plot(kind="bar")
plt.title("Final Result Distribution")
plt.xlabel("Final Result")
plt.ylabel("Number of Students")
plt.show()

# Study Hours vs Previous Score
plt.figure(figsize=(6,5))
plt.scatter(df["StudyHours"], df["PreviousScore"])
plt.title("Study Hours vs Previous Score")
plt.xlabel("Study Hours")
plt.ylabel("Previous Score")
plt.show()

##############################################################
# Step 4 : Prepare Input and Output Data
##############################################################

X = df[["StudyHours",
        "Attendance",
        "PreviousScore",
        "AssignmentsCompleted",
        "SleepHours"]]

y = df["FinalResult"]

##############################################################
# Step 5 : Split Dataset into Training and Testing
##############################################################

X_train, X_test, y_train, y_test = train_test_split(
    X,
    y,
    test_size=0.20,
    random_state=42
)

##############################################################
# Step 6 : Train Decision Tree Model
##############################################################

model = DecisionTreeClassifier(random_state=42)

model.fit(X_train, y_train)

print("\nModel Trained Successfully...")

##############################################################
# Step 7 : Predict Test Data
##############################################################

prediction = model.predict(X_test)

##############################################################
# Step 8 : Display Actual and Predicted Values
##############################################################

result = pd.DataFrame({
    "Actual": y_test.values,
    "Predicted": prediction
})

print("\nActual vs Predicted Values")
print(result)

##############################################################
# Step 9 : Calculate Accuracy
##############################################################

accuracy = accuracy_score(y_test, prediction)

print("\nTesting Accuracy :", round(accuracy * 100, 2), "%")

##############################################################
# Step 10 : Generate Confusion Matrix
##############################################################

cm = confusion_matrix(y_test, prediction)

print("\nConfusion Matrix")
print(cm)

##############################################################
# Step 11 : Predict New Student Result
##############################################################

student = pd.DataFrame({
    "StudyHours": [6],
    "Attendance": [85],
    "PreviousScore": [66],
    "AssignmentsCompleted": [7],
    "SleepHours": [7]
})

student_result = model.predict(student)

print("\nPrediction for New Student :", student_result[0])

##############################################################
# Step 12 : Final Conclusion
##############################################################

print("\n================ FINAL CONCLUSION ================")

print("Model Used : Decision Tree Classifier")
print("Testing Accuracy :", round(accuracy * 100, 2), "%")

if accuracy >= 0.90:
    print("Conclusion : The model performs excellently and gives highly accurate predictions.")
elif accuracy >= 0.75:
    print("Conclusion : The model performs well and provides good predictions.")
else:
    print("Conclusion : The model needs improvement by tuning parameters or using more data.")

print("The trained model can predict whether a student is likely to Pass or Fail based on:")
print("- Study Hours")
print("- Attendance")
print("- Previous Score")
print("- Assignments Completed")
print("- Sleep Hours")
print("==================================================")