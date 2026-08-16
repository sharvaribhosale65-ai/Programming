/////////////////////////////////////////
// Progressive Income Tax
/////////////////////////////////////////

import java.util.*;

class ass53_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iIncome = 0;
        double dTax = 0.0;

        System.out.println("Enter Annual Income:");
        iIncome = sobj.nextInt();

        // Validation
        if(iIncome < 0)
        {
            System.out.println("Invalid Income");
            return;
        }

        // Tax calculation
        if(iIncome <= 250000)
        {
            dTax = 0;
        }
        else if(iIncome <= 500000)
        {
            dTax = (iIncome - 250000) * 0.05;
        }
        else if(iIncome <= 1000000)
        {
            dTax = (250000 * 0.05) +
                   (iIncome - 500000) * 0.20;
        }
        else
        {
            dTax = (250000 * 0.05) +
                   (500000 * 0.20) +
                   (iIncome - 1000000) * 0.30;
        }

        System.out.println("Annual Income: Rs." + iIncome);
        System.out.println("Total Tax Payable: Rs." + dTax);

        sobj.close();
    }
}