def DisplayPattern(No):

    for i in range(No,0,-1):
        for j in range(1, i+1):
            print("*",end="\t")
        print(" ")

def main():

    Value = int(input("Enter the number : "))
    DisplayPattern(Value)
    

if __name__ == "__main__":
    main()

"""
Input   :   5   
Output  :   *       *       *       *       *
            *       *       *       *
            *       *       *
            *       *
            *  
"""