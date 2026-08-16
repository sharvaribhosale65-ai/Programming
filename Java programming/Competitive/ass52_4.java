import java.io.*;
import java.util.*;

class ass52_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0;
        int billAmount = 0;

        System.out.println("Enter units consumed : ");
        units = sobj.nextInt();

        if(units < 0)
        {
            System.out.println("Invalid input");
        }
        else if(units <= 100)
        {
            billAmount = units * 5;

            System.out.println("Total Electricity Bill: ₹" + billAmount);
        }
        else if(units <= 200)
        {
            billAmount = (100 * 5) + ((units - 100) * 7);

            System.out.println("Total Electricity Bill: ₹" + billAmount);
        }
        else
        {
            billAmount = (100 * 5) + (100 * 7) + ((units - 200) * 10);

            System.out.println("Total Electricity Bill: ₹" + billAmount);
        }
    }
}