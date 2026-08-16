///////////////////////////////////////////////////////////////
// Warehouse Stock Management
///////////////////////////////////////////////////////////////

import java.util.*;

class ass53_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Stock = 0;
        int Quantity = 0;
        int Remaining = 0;

        System.out.println("Enter Current Stock : ");
        Stock = sobj.nextInt();

        System.out.println("Enter Requested Quantity : ");
        Quantity = sobj.nextInt();

        // Validation
        if(Stock < 0 || Quantity < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        // Check stock
        if(Quantity > Stock)
        {
            System.out.println("Order Failed: Insufficient Stock");
        }
        else
        {
            Remaining = Stock - Quantity;

            System.out.println("Order Fulfilled");
            System.out.println("Remaining Stock : " + Remaining);

            if(Remaining < 5)
            {
                System.out.println("Low Stock Alert");
            }
        }

        sobj.close();
    }
}