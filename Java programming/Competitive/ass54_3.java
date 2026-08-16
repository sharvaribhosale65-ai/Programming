import java.util.*;

class ass54_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iWeight = 0;
        int iCharge = 0;

        System.out.println("Enter parcel weight in kg : ");
        iWeight = sobj.nextInt();

        if(iWeight <= 0)
        {
            System.out.println("Invalid Weight");
            return;
        }

        if(iWeight <= 1)
        {
            iCharge = 50;
        }
        else if(iWeight <= 5)
        {
            iCharge = 50 + ((iWeight - 1) * 20);
        }
        else
        {
            iCharge = 150 + ((iWeight - 5) * 30);
        }

        System.out.println("Parcel Weight : " + iWeight + " kg");
        System.out.println("Courier Charge : Rs." + iCharge);
    }
}