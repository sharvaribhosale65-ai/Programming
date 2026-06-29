"""
Algorithm   :
    Accept a character as No
    Check whether that No is vowel or not
    If yes
        Print it is a vowel
    Else
        Print it is a consonant
    Display result

Author  :   Sharvari Gorakhnath Bhosale
Date    :   28/06/2026    
"""

def chkVowel(No):

    if(No == "a" or No == "e" or No == "i" or No == "o" or No == "u" or 
       No == "A" or No == "E" or No == "I" or No == "O" or No == "U"):
        return True
    else:
        return False

def main():

    print("Enter the character : ")
    Value = input()

    Ret = chkVowel(Value)
    if(Ret == True):
        print("It is a vowel")
    else:
        print("It is a consonant")

if __name__ == "__main__":
    main()

"""
Input   :   a
Output  :   It is a vowel

Input   :   B
Output  :   It is a consonant
"""