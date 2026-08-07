import pandas as pd
import matplotlib.pyplot as plt
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree

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
    X, y, test_size=0.2, random_state=42
)

#########################################################
# Train Decision Tree Model
#########################################################

model = DecisionTreeClassifier(random_state=42)
model.fit(X_train, y_train)

#########################################################
# Display Root Node Feature
#########################################################

root_feature = X.columns[model.tree_.feature[0]]
print("Root Node Feature :", root_feature)

#########################################################
# Visualize Decision Tree
#########################################################

plt.figure(figsize=(18,10))

plot_tree(
    model,
    feature_names=X.columns,
    class_names=["Pass", "Fail"],   # Change order if your encoding is reversed
    filled=True,
    rounded=True,
    fontsize=10
)

plt.title("Decision Tree Visualization")
plt.show()
"""
Output :

Root Node Feature : Attendance

"""