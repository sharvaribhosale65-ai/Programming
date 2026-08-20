import numpy as np
from sklearn.linear_model import LinearRegression

def main():

    X = np.array([[1],[2],[3],[4],[5]]) #Two dimensional array (number of rows × number of features = 5 * 1)

    Y = np.array([50,55,60,65,70])

    model = LinearRegression()

    model = model.fit(X, Y)

    print(model.predict([[6]]))     #X_test  [[6]] - two dimensional array


if __name__ == "__main__":
    main()