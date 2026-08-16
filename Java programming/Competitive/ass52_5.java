import java.io.*;
import java.util.*;

class ass52_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int amount = 0;
        double discount = 0.0;
        double finalAmount = 0.0;
        String membership = null;

        System.out.println("Enter purchase amount : ");
        amount = sobj.nextInt();

        System.out.println("Enter membership type (Premium/Regular) : ");
        membership = sobj.next();

        if(amount <= 0)
        {
            System.out.println("Invalid amount");
            return;
        }

        if(!membership.equalsIgnoreCase("Premium") &&
           !membership.equalsIgnoreCase("Regular"))
        {
            System.out.println("Invalid membership type");
            return;
        }

        if(amount > 5000)
        {
            discount = amount * 20 / 100.0;
        }
        else if(amount > 2000)
        {
            discount = amount * 10 / 100.0;
        }
        else
        {
            discount = 0;
        }

        if(membership.equalsIgnoreCase("Premium"))
        {
            discount = discount + ((amount - discount) * 5 / 100.0);
        }

        finalAmount = amount - discount;

        System.out.println("Original Amount: ₹" + amount);
        System.out.println("Total Discount: ₹" + discount);
        System.out.println("Final Payable Amount: ₹" + finalAmount);
    }
}