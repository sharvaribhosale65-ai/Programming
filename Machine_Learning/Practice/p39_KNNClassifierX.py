import numpy as np      #for calculations
from sklearn.neighbors import KNeighborsClassifier

def main():

    #independent
    X = np.array([
        [1, 2],
        [2, 3],
        [3, 1],
        [5, 6]
    ])                  #2D aaray (same as pandas df)

    #depedent
    Y = np.array(["Red", "Red", "Blue", "Blue"])    #1D array

    new_point = np.array([[3, 3]])          #predict

    print("Independent variables are : ")
    print(X)

    print("Dependent variables are : ")
    print(Y)

    print("Testing point is : ")
    print(new_point)


if __name__ == "__main__":
    main()