import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

def MarvellousPredictor():

    # Load the data
    X = [1, 2, 3, 4, 5]
    Y = [3, 4, 2, 4, 5]

    print("Values of independent variables X: ",X)
    print("Values of dependent variables Y: ",Y)

    sum_x = 0
    sum_y = 0

    for i in range(len(X)):
        sum_x = sum_x + X[i]
        sum_y = sum_y + Y[i]

    mean_x = sum_x / len(X)
    mean_y = sum_y / len(Y)

    print("Mean_X is : ",mean_x)
    print("Mean_Y is : ",mean_y)

    n = len(X)  #5

    numerator = 0
    denomerator = 0

    # m = sum(x - xbar) * (y - ybar) / sum( x - xbar) ** 2

     #calculate slope i.e m
    for i in range(n):

        numerator = numerator + ((X[i] - mean_x) * (Y[i] - mean_y))    
        denomerator = denomerator + ((X[i] - mean_x) ** 2)

    m = numerator / denomerator

    print("Slope of line i.e. m is : ",m)

    # y = mx + c
    # c = y - mx
    # c = ymean - m * xmean
    
    c = mean_y - (m * mean_x)

    print("Y intercept i.e. c is : ", c)

    x = np.linspace(1, 6, n)        #np.linspace(start, end, number_of_values)
    y = (m * x) + c

    plt.plot(x, y, color = 'g', label = "Regression line")  #Draw regression line : Green line = regression line
                                                            #plt.plot() → used to draw a line.
    plt.scatter(X, Y, color = 'r', label = "Scatter plot")  #Draw actual data points : red dots = actual data
                                                            #plt.scatter() → used to draw individual points/dots.
    plt.xlabel("X : Independent variables")
    plt.ylabel("Y : Dependent variables")

    plt.legend()
    plt.show()

def main():
    MarvellousPredictor()

if __name__ == "__main__":
    main()