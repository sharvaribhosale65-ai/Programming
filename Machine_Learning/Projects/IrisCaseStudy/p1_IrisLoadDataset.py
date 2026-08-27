
import pandas as pd

def IrisCaseStudy():


    ############################################################
    #   Step 1  :   Load the dataset
    ############################################################
    
    df = pd.read_csv("iris.csv")

    print("Some few data from iris : ")
    print(df.head(10))

def main():
    IrisCaseStudy()


if __name__ == "__main__":
    main()