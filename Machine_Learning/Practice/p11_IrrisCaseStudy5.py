from sklearn.datasets import load_iris

def main():

    Border = "-"*30
    print(Border)
    print("Iris Classification Case Study")
    print(Border)

    Dataset = load_iris()

    for i in range(len(Dataset.target)):

        print("ID %d, features %s, label %s" %(i, Dataset.data[i], Dataset.target[i]))

if __name__ == "__main__":
    main()