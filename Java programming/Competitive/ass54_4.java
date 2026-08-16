import java.util.*;

class ass54_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iBudget = 0;
        int iN = 0;
        int iPrice = 0;
        int iTotal = 0;
        int iCount = 0;
        int i = 0;

        System.out.println("Enter budget amount : ");
        iBudget = sobj.nextInt();

        if(iBudget < 0)
        {
            System.out.println("Invalid Budget");
            return;
        }

        System.out.println("Enter number of items : ");
        iN = sobj.nextInt();

        if(iN < 0)
        {
            System.out.println("Invalid Number of Items");
            return;
        }

        System.out.println("Enter item prices : ");

        for(i = 1; i <= iN; i++)
        {
            iPrice = sobj.nextInt();

            if(iPrice <= 0)
            {
                System.out.println("Invalid Price");
                return;
            }

            if(iTotal + iPrice <= iBudget)
            {
                iTotal = iTotal + iPrice;
                iCount++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Items Purchased : " + iCount);
        System.out.println("Total Amount : Rs." + iTotal);
        System.out.println("Remaining Budget : Rs." + (iBudget - iTotal));
    }
}