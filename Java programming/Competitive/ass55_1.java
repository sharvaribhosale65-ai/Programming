import java.util.*;

class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int days = 0;
        int wardType = 0;
        float medicineBill = 0.0f;
        float consultationFee = 0.0f;
        float totalBill = 0.0f;
        float insuranceCover = 0.0f;
        float finalPay = 0.0f;
        float roomCharge = 0.0f;

        System.out.println("Enter number of days");
        days = sobj.nextInt();

        System.out.println("Enter ward type");
        System.out.println("1 : Normal");
        System.out.println("2 : ICU");
        wardType = sobj.nextInt();

        System.out.println("Enter medicine bill");
        medicineBill = sobj.nextFloat();

        System.out.println("Enter consultation fee");
        consultationFee = sobj.nextFloat();

        // Validation
        if(days < 0 || medicineBill < 0 || consultationFee < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        // Room charges
        if(wardType == 1)
        {
            roomCharge = days * 2000;
        }
        else if(wardType == 2)
        {
            roomCharge = days * 5000;
        }
        else
        {
            System.out.println("Invalid ward type");
            return;
        }

        totalBill = medicineBill + consultationFee + roomCharge;

        // Insurance = lower of 70000 or 70% of bill
        insuranceCover = totalBill * 0.70f;

        if(insuranceCover > 50000)
        {
            insuranceCover = 50000;
        }

        finalPay = totalBill - insuranceCover;

        System.out.println("Total Bill = " + totalBill);
        System.out.println("Insurance Cover = " + insuranceCover);
        System.out.println("Final Pay = " + finalPay);
    }
}