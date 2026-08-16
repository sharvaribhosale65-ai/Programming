///////////////////////////////////////////////////////////////
// Personal Loan Eligibility
///////////////////////////////////////////////////////////////

import java.util.*;

class ass53_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;
        int Income = 0;
        int CreditScore = 0;
        String Loan = null;

        System.out.println("Enter Age : ");
        Age = sobj.nextInt();

        System.out.println("Enter Monthly Income : ");
        Income = sobj.nextInt();

        System.out.println("Enter Credit Score : ");
        CreditScore = sobj.nextInt();

        System.out.println("Do you have existing unpaid loan (Yes/No) : ");
        Loan = sobj.next();

        // Validation
        if(Age < 0 || Income < 0 || CreditScore < 0)
        {
            System.out.println("Invalid Input");
            return;
        }

        if(!Loan.equalsIgnoreCase("Yes") && !Loan.equalsIgnoreCase("No"))
        {
            System.out.println("Invalid Yes/No input");
            return;
        }

        // Eligibility checking
        if(Age < 21 || Age > 60)
        {
            System.out.println("Loan Rejected: Age must be between 21 and 60");
        }
        else if(Income < 25000)
        {
            System.out.println("Loan Rejected: Monthly income must be at least Rs.25000");
        }
        else if(CreditScore < 700)
        {
            System.out.println("Loan Rejected: Credit score must be at least 700");
        }
        else if(Loan.equalsIgnoreCase("Yes"))
        {
            System.out.println("Loan Rejected: Existing unpaid loan");
        }
        else
        {
            System.out.println("Loan Approved");
        }

        sobj.close();
    }
}