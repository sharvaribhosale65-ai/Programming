import java.util.*;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iHours = 0;
        int iFee = 0;

        System.out.println("Enter total parking hours : ");
        iHours = sobj.nextInt();

        // Validation
        if(iHours < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        // First 2 hours = Rs.20 flat
        if(iHours <= 2)
        {
            iFee = 20;
        }
        else
        {
            // First 2 hours
            iFee = 20;

            // Extra hours = Rs.10 per hour
            iFee = iFee + ((iHours - 2) * 10);
        }

        // Penalty if hours > 10
        if(iHours > 10)
        {
            iFee = iFee + 50;
        }

        System.out.println("Total Parking Duration : " + iHours + " hours");
        System.out.println("Total Parking Fee : Rs." + iFee);

        sobj.close();
    }
}