###############################################################################
#
#   Import required libraries
#
###############################################################################

import pandas as pd

from sklearn.model_selection import train_test_split
from sklearn.preprocessing import StandardScaler
from sklearn.neighbors import KNeighborsClassifier 
from sklearn.metrics import accuracy_score

###############################################################################
#
#   Function name   :   WineCaseClassifier
#   Description     :   Load the dataset, train and test that dataset, Calculate accuracy
#   Author          :   Sharvari Gorakhnath Bhosale
#   Date            :   11.08.2026
#
###############################################################################

def WineCaseClassifier(Datapath):

    Border = "-"*40

    # Step 1 : Load the dataset
    
    print(Border)
    print("Step 1 : Load the dataset")
    print(Border)

    df = pd.read_csv(Datapath)

    print("Dataset loaded successfully")
    print("Some entries of dataset : ")
    print(df.head())
    print(Border)

    # Step 2 : Clean, Prepare and Manipulate the Data

    print(Border)
    print("Step 2 : Clean, Prepare and Manipulate the Data")
    print(Border)

    df.dropna(inplace=True)

    print("Shape of the dataset : ",df.shape)
    print("Total records : ", df.shape[0])
    print("Number of columns : ", df.shape[1])

    print(Border)

    # Step 3 : Separate independent and dependent variables

    print(Border)
    print("Step 3 : Separate independent and dependent variables")
    print(Border)

    X = df.drop(columns=['Class'])
    Y = df['Class']

    print(Border)
    print("Independent variables : ", X.columns.tolist())
    print("Dependent variables : Class")
    print(Border)

    #Step 4 : Split the dataset into training and testing

    print(Border)
    print("Step 4 : Split the dataset into training and testing")
    print(Border)

    X_train, X_test, Y_train, Y_test = train_test_split(X, Y, test_size=0.2, random_state=42)

    print("Dataset splitted successfully")
    print(Border)

    #Step 5 : Feature scalling

    print(Border)
    print("Step 5 : Feature scalling")
    print(Border)

    Scale = StandardScaler()
    X_train_scale = Scale.fit_transform(X_train)
    X_test_scale = Scale.transform(X_test)

    print("Feature scalling done")
    print(Border)

    #Step 6 : Hyperparameter Tunning

    result_AccuracyScore = []
    k_values = range(1, 11)

    for k in k_values:
        model = KNeighborsClassifier(n_neighbors=k)
        model = model.fit(X_train_scale, Y_train)
        y_pred = model.predict(X_test_scale)
        accuracy = accuracy_score(Y_test, y_pred)
        result_AccuracyScore.append(accuracy)

    print("Accuracy report : ")
    for no in result_AccuracyScore:
        print(no)

###############################################################################
#
#   Application to display Loaded dataset, Train and test dataset, and Calculate accuracy
#
###############################################################################

def main():
    WineCaseClassifier("WinePredictor.csv")


if __name__ == "__main__":
    main()