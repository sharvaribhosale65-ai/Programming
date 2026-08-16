import java.util.*;

class ass57_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iDays = 0;
        int iBill = 0;
        double dDiscount = 0.0;
        double dFinalBill = 0.0;

        System.out.print("Enter number of days stayed: ");
        iDays = sobj.nextInt();

        if(iDays < 0)
        {
            System.out.println("Invalid number of days");
            return;
        }

        iBill = iDays * 3000;

        if(iDays > 7)
        {
            dDiscount = iBill * 0.05;
        }

        dFinalBill = iBill - dDiscount;

        System.out.println("Total Stay Duration: " + iDays + " days");
        System.out.println("Final Bill Amount: ₹" + dFinalBill);
    }
}