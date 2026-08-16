/////////////////////////////////////////
// Traffic Police Fine
/////////////////////////////////////////

import java.util.*;

class ass53_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String Helmet = null;
        String License = null;
        String Overspeeding = null;

        int iFine = 0;

        System.out.println("Enter Helmet worn (Yes/No):");
        Helmet = sobj.nextLine();

        System.out.println("Enter License available (Yes/No):");
        License = sobj.nextLine();

        System.out.println("Enter Overspeeding (Yes/No):");
        Overspeeding = sobj.nextLine();

        // Validation
        if((!Helmet.equals("Yes")) && (!Helmet.equals("No")))
        {
            System.out.println("Invalid Input");
            return;
        }

        if((!License.equals("Yes")) && (!License.equals("No")))
        {
            System.out.println("Invalid Input");
            return;
        }

        if((!Overspeeding.equals("Yes")) && (!Overspeeding.equals("No")))
        {
            System.out.println("Invalid Input");
            return;
        }

        // Fine calculation
        if(Helmet.equals("No"))
        {
            iFine = iFine + 500;
        }

        if(License.equals("No"))
        {
            iFine = iFine + 1000;
        }

        if(Overspeeding.equals("Yes"))
        {
            iFine = iFine + 1500;
        }

        System.out.println("Total Fine: Rs." + iFine);

        sobj.close();
    }
}