import java.io.*;
import java.util.*;

class ass52_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int daysKept = 0;
        int fineAmount = 0;

        System.out.println("Enter number of days book was kept : ");
        daysKept = sobj.nextInt();

        if(daysKept < 0)
        {
            System.out.println("Invalid input");
        }
        else if(daysKept <= 7)
        {
            System.out.println("Returned on time. No fine applicable.");
        }
        else if(daysKept <= 12)
        {
            fineAmount = (daysKept - 7) * 5;

            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }
        else
        {
            fineAmount = 5 * 5;
            fineAmount = fineAmount + ((daysKept - 12) * 10);

            System.out.println("Total fine to be paid: ₹" + fineAmount);
        }
    }
}