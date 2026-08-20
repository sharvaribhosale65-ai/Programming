import numpy as np      #for calculations
from sklearn.neighbors import KNeighborsClassifier

def main():

    #independent
    X = np.array([
        [1, 2],
        [2, 3],
        [3, 1],
        [5, 6]
    ])

    #depedent
    Y = np.array(["Red", "Red", "Blue", "Blue"])

    new_point = np.array([[3, 3]])          #predict

    #model creation
    model = KNeighborsClassifier(n_neighbors=3)     #kvalue (by default value is 5)

    model = model.fit(X, Y)

    y_pred = model.predict(new_point)

    print("Predicted label : ", y_pred)


if __name__ == "__main__":
    main()