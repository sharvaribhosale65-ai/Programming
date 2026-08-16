import java.util.*;

class ass57_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iMinutes = 0;
        int iCharge = 0;

        System.out.print("Enter call duration in minutes: ");
        iMinutes = sobj.nextInt();

        if(iMinutes < 0)
        {
            System.out.println("Invalid Call Duration");
            return;
        }

        if(iMinutes <= 5)
        {
            iCharge = 0;
        }
        else if(iMinutes <= 15)
        {
            iCharge = (iMinutes - 5) * 1;
        }
        else
        {
            iCharge = (10 * 1) + ((iMinutes - 15) * 2);
        }

        System.out.println("Call Duration: " + iMinutes + " minutes");
        System.out.println("Total Call Charge: ₹" + iCharge);
        
    }
}