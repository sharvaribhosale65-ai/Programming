from sklearn.datasets import load_iris

def main():

    Border = "-"*30
    print(Border)
    print("Iris Classification Case Study")
    print(Border)

    Dataset = load_iris()

    #metadata of the dataset
    print("Independent variables are : ")
    print(Dataset.feature_names)

    print("Dependent variables are: ")
    print(Dataset.target_names)

if __name__ == "__main__":
    main()