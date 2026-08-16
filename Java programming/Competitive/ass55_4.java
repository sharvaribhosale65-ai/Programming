import java.util.*;

class ass55_4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int units = 0;
        int weeksLate = 0;

        float billAmount = 0.0f;
        float meterCharge = 50.0f;
        float penalty = 0.0f;

        System.out.println("Enter water units");
        units = sobj.nextInt();

        System.out.println("Enter number of weeks late");
        weeksLate = sobj.nextInt();

        if(units < 0 || weeksLate < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        // Progressive slab calculation

        if(units <= 100)
        {
            billAmount = units * 5;
        }
        else if(units <= 200)
        {
            billAmount = (100 * 5) +
                         ((units - 100) * 8);
        }
        else if(units <= 500)
        {
            billAmount = (100 * 5) +
                         (100 * 8) +
                         ((units - 200) * 12);
        }
        else
        {
            billAmount = (100 * 5) +
                         (100 * 8) +
                         (300 * 12) +
                         ((units - 500) * 15);
        }

        // Add fixed meter charge
        billAmount = billAmount + meterCharge;

        // Late fee
        if(weeksLate > 0)
        {
            penalty = weeksLate * 2;

            // Maximum penalty = 10%
            if(penalty > 10)
            {
                penalty = 10;
            }

            billAmount = billAmount +
                         (billAmount * penalty / 100);
        }

        System.out.println("Bill Amount = " + billAmount);
    }
}