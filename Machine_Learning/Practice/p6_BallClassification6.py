from sklearn import tree

def main():
    print("Ball classification case study\n")

    Independent = [[35,1], [47,1], [90,0], 
                [48,1], [90,0], [35,1], 
                [92,0], [35,1], [35,1], 
                [35,1], [96,0], [43,1], 
                [110,0]]

    #Testing features =  [35,1], [95,0]

    Dependent = [1, 1, 2, 
                1, 2, 1, 
                2, 1, 1, 
                1, 2, 1, 
                2]

    #Testing labels = 1, 2

    Model = tree.DecisionTreeClassifier()

    Model = Model.fit(Independent, Dependent)

    Result = Model.predict([[35,1], [95,0]])

    print("Predicted result of model is : ", Result)

if __name__ == "__main__":
    main()