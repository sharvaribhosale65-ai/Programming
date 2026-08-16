import java.io.*;
import java.util.*;

class ass52_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int balance = 0;
        int withdrawalAmount = 0;
        int remainingBalance = 0;

        System.out.println("Enter current balance : ");
        balance = sobj.nextInt();

        System.out.println("Enter withdrawal amount : ");
        withdrawalAmount = sobj.nextInt();

        if(withdrawalAmount % 100 != 0)
        {
            System.out.println("Withdrawal rejected: Amount must be a multiple of ₹100");
        }
        else if(withdrawalAmount > 25000)
        {
            System.out.println("Withdrawal rejected: Maximum withdrawal limit is ₹25,000");
        }
        else
        {
            remainingBalance = balance - withdrawalAmount;

            if(remainingBalance < 1000)
            {
                System.out.println("Withdrawal rejected: Minimum balance of ₹1,000 must be maintained");
            }
            else
            {
                balance = remainingBalance;

                System.out.println("Withdrawal successful");
                System.out.println("Remaining balance: ₹" + balance);
            }
        }
    }
}