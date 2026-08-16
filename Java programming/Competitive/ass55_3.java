import java.util.*;

class ass55_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int mins = 0;
        int sms = 0;
        float gb = 0.0f;

        float costA = 0.0f;
        float costB = 0.0f;
        float costC = 0.0f;
        float costD = 0.0f;

        float extra = 0.0f;

        System.out.println("Enter call usage in minutes");
        mins = sobj.nextInt();

        System.out.println("Enter data usage in GB");
        gb = sobj.nextFloat();

        System.out.println("Enter SMS count");
        sms = sobj.nextInt();

        if(mins < 0 || gb < 0 || sms < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        // PLAN A
        costA = 199;

        if(mins > 100)
        {
            extra = mins - 100;
            costA = costA + (extra * 1);
        }

        if(gb > 2)
        {
            extra = gb - 2;
            costA = costA + (extra * 20);
        }

        if(sms > 100)
        {
            extra = sms - 100;
            costA = costA + (extra * 1);
        }

        // PLAN B
        costB = 299;

        if(mins > 300)
        {
            extra = mins - 300;
            costB = costB + (extra * 0.75f);
        }

        if(gb > 5)
        {
            extra = gb - 5;
            costB = costB + (extra * 15);
        }

        if(sms > 300)
        {
            extra = sms - 300;
            costB = costB + (extra * 0.75f);
        }

        // PLAN C
        costC = 399;

        if(mins > 500)
        {
            extra = mins - 500;
            costC = costC + (extra * 0.50f);
        }

        if(gb > 10)
        {
            extra = gb - 10;
            costC = costC + (extra * 10);
        }

        if(sms > 500)
        {
            extra = sms - 500;
            costC = costC + (extra * 0.50f);
        }

        // PLAN D
        costD = 599;

        if(mins > 1000)
        {
            extra = mins - 1000;
            costD = costD + (extra * 0.25f);
        }

        if(gb > 20)
        {
            extra = gb - 20;
            costD = costD + (extra * 5);
        }

        if(sms > 1000)
        {
            extra = sms - 1000;
            costD = costD + (extra * 0.25f);
        }

        // Find cheapest plan
        if(costA <= costB && costA <= costC && costA <= costD)
        {
            System.out.println("Recommended Plan = Plan A");
            System.out.println("Total Cost = " + costA);
        }
        else if(costB <= costA && costB <= costC && costB <= costD)
        {
            System.out.println("Recommended Plan = Plan B");
            System.out.println("Total Cost = " + costB);
        }
        else if(costC <= costA && costC <= costB && costC <= costD)
        {
            System.out.println("Recommended Plan = Plan C");
            System.out.println("Total Cost = " + costC);
        }
        else
        {
            System.out.println("Recommended Plan = Plan D");
            System.out.println("Total Cost = " + costD);
        }
    }
}