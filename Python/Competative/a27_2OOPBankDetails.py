"""
Algorithm   :
        START
            Create a class BankAccount.
            Accept account holder name and initial balance.
            Display account details.
            Deposit amount into the account.
            Withdraw amount from the account.
            Calculate and display the interest.
        STOP
"""

"""
Function name   :   __init__
Input           :   string, int
Output          :   None
Description     :   Initialize the account holder name and account balance.
Author          :   Sharvari Gorakhnath Bhosale
Date            :   10.07.2026
"""
class BankAccount:

    ROI = 10.5

    def __init__(self, name, amount):
        self.Name = name
        self.Amount = amount


    """
    Function name   :   Display
    Input           :   None
    Output          :   None
    Description     :   Display the account holder name and current balance.
    """

    def Display(self):
        print("Account holder name : ", self.Name)
        print("Current balance : ", self.Amount)

    """
    Function name   :   Deposite
    Input           :   int
    Output          :   None
    Description     :   Deposit the specified amount into the account.
    """

    def Deposite(self):
        self.amt = int(input("Enter amount to deposite : "))
        self.Amount = self.Amount + self.amt
        print("Amount after deposite : ", self.Amount)


    """
    Function name   :   Withdraw
    Input           :   int
    Output          :   None
    Description     :   Withdraw the specified amount if sufficient balance is available.
    """

    def Withdraw(self):
        self.amnt = int(input("Enter amount to withdraw : "))

        if(self.Amount < self.amnt):
            print("Insuffcient balance\n")
            return

        self.Amount = self.Amount - self.amnt
        print("Balance after withdraw : ", self.Amount)


    """
    Function name   :   CalculateInterest
    Input           :   None
    Output          :   None
    Description     :   Calculate and display the interest on the current balance.
    """

    def CalculateInterest(self):
        self.interest = (self.Amount * BankAccount.ROI) / 100
        print("Interest : ", self.interest)
        print()
        

"""
Application to perform banking operations such as deposit, withdrawal, and interest calculation.
"""

bObj1 = BankAccount("Sharvari Bhosale", 190000)
bObj1.Display()
bObj1.Deposite()
bObj1.Withdraw()
bObj1.CalculateInterest()

bObj2 = BankAccount("Karan Sharma", 123906)
bObj2.Display()
bObj2.Deposite()
bObj2.Withdraw()
bObj2.CalculateInterest()

"""
Output  :

            Account holder name : Sharvari Bhosale
            Current balance : 190000
            Enter amount to deposite : 200
            Amount after deposite : 190200
            Enter amount to withdraw : 100
            Balance after withdraw : 190100
            Interest : 19960.5

            Account holder name : Karan Sharma
            Current balance : 123906
            Enter amount to deposite : 1000
            Amount after deposite : 124906
            Enter amount to withdraw : 2000
            Balance after withdraw : 122906
            Interest : 12905.13
"""