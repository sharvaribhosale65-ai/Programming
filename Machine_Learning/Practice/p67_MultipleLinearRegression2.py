import numpy as np
from sklearn.linear_model import LinearRegression

def main():
    
    X = np.array([
            [1,7],              #first - hrs of study second - hrs of sleep
            [2,6],
            [3,7],
            [4,6],
            [5,8]
        ])

    Y = np.array([50,55,60,65,70])      #marks

    model = LinearRegression()

    model = model.fit(X, Y)

    print(model.predict([[6,5]]))

    print("Coefficient : ", model.coef_)        #it gives 2 coeff because of 2 features

    print("Intercept : ", model.intercept_)
    

if __name__ == "__main__":
    main()