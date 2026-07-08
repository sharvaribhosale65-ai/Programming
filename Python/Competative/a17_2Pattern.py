def DisplayPattern(No):

    for i in range(1, No+1, 1):
        for j in range(1, No+1, 1):
            print("*",end="\t")
        print("\n")

def main():

    Value = int(input("Enter the number : "))

    DisplayPattern(Value)

if __name__ == "__main__":
    main()

"""
Input   :   4  
Output  :   *       *       *       *

            *       *       *       *

            *       *       *       *

            *       *       *       *
"""