import java.util.*;

class ass54_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iDistance = 0;
        char cPeak = '\0';
        double dFare = 0.0;

        System.out.println("Enter distance in km : ");
        iDistance = sobj.nextInt();

        if(iDistance < 0)
        {
            System.out.println("Invalid Distance");
            return;
        }

        System.out.println("Is it peak hour? (Y/N) : ");
        cPeak = sobj.next().charAt(0);

        dFare = 50;

        if(iDistance <= 10)
        {
            dFare = dFare + (iDistance * 12);
        }
        else
        {
            dFare = dFare + (10 * 12);
            dFare = dFare + ((iDistance - 10) * 15);
        }

        if(cPeak == 'Y' || cPeak == 'y')
        {
            dFare = dFare + (dFare * 20 / 100);
        }

        System.out.println("Distance : " + iDistance + " km");
        System.out.println("Peak Hour : " + cPeak);
        System.out.println("Total Fare : Rs." + dFare);
    }
}