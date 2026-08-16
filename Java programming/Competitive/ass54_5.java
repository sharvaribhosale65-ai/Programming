import java.util.*;

class ass54_5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iBattery = 0;

        System.out.println("Enter battery percentage : ");
        iBattery = sobj.nextInt();

        if(iBattery < 0 || iBattery > 100)
        {
            System.out.println("Invalid Battery Percentage");
            return;
        }

        System.out.println("Battery Percentage : " + iBattery + "%");

        if(iBattery <= 5)
        {
            System.out.println("Status : Critical");
        }
        else if(iBattery <= 15)
        {
            System.out.println("Status : Low");
        }
        else
        {
            System.out.println("Status : Normal");
        }
    }
}