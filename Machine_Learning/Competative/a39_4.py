import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier
from sklearn.metrics import accuracy_score, confusion_matrix, ConfusionMatrixDisplay

#Load Dataset
df = pd.read_csv("student_performance_ml.csv")

#Separate features and labels
X = df[["StudyHours","Attendance","PreviousScore","AssignmentsCompleted","SleepHours"]]
y = df["FinalResult"]

#Split data into training and testing
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=42)

#create decision tree model
model = DecisionTreeClassifier(random_state=42)

#Train the model
model.fit(X_train, y_train)

print("Model trained successfully!")

#Test the model
Result = model.predict(X_test)

#Display predicted and actual values
print("\nActual vs Predicted Results:\n")
result_df = pd.DataFrame({"Actual Result": y_test.values, "Predicted Result": Result})

print(result_df)

#Accuracy
accuracy = accuracy_score(y_test, Result)
print("\nModel Accuracy : ", accuracy * 100 , "%")

#Confusion matrix
cm = confusion_matrix(y_test, Result)

display = ConfusionMatrixDisplay(confusion_matrix=cm, display_labels=["Fail", "Pass"])

display.plot()
plt.title("Confusion Matrix")
plt.show()

print("\nConfusion matrix display successfully...")

"""
Output   :

Model trained successfully!

Actual vs Predicted Results:

   Actual Result  Predicted Result
0              1                 1
1              0                 0
2              0                 0
3              0                 0
4              0                 0
5              0                 0

Model Accuracy :  100.0 %

Confusion matrix display successfully...
"""