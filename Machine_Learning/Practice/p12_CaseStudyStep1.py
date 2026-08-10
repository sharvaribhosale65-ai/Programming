import pandas as pd

Border = "-"*30
##################################################
# Step 1 : Load the data set
##################################################

print(Border)
print("Step 1 : Load the data set")
print(Border)

Datapath = "iris.csv"       

df = pd.read_csv(Datapath)      #df - data frame 

print("Dataset loaded sucessfully\n")
print("Initial entries from dataset are : \n")
print(df.head())

def main():
    pass
    
if __name__ == "__main__":
    main()

