
def Display(No):

    for i in range(1,No+1):
        print("*",end="\t")

def main():

    Value = int(input("Enter the number : "))
    Display(Value)

if __name__ == "__main__":
    main()

"""
Input   : 5
Output  : *       *       *       *       *

Input   : 10
Output  : *       *       *       *       *       *       *       *       *       *
"""