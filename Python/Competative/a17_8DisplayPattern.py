def DisplayPattern(No):

    for i in range(1, No+1):
        for j in range(1, No+1):
            if(i == j or i > j):
                print(j,end="\t")
        print("\n")

def main():

    Value = int(input("Enter the number : "))
    DisplayPattern(Value)
    
if __name__ == "__main__":
    main()

"""
Input   :   5   
Output  :   1

            1       2

            1       2       3

            1       2       3       4

            1       2       3       4       5
"""