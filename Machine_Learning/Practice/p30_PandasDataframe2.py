import pandas as pd

def main():

    Data = {
        "Name" : ["Sagar", "Amit", "Pooja"],
        "Age" : [27, 28, 25],
        "City" : ["Pune", "Kolhapur","Satara"]
    }

    dObj = pd.DataFrame(Data)
    print(dObj)

    #print(dObj[0])      #not allowed error

    print(dObj["Age"])

if __name__ == "__main__":
    main()