import java.util.*;

class ass57_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int iSteps = 0;
        int iGoalDays = 0;
        int iMax = 0;

        System.out.println("Enter steps for 7 days:");

        for(i = 1; i <= 7; i++)
        {
            iSteps = sobj.nextInt();

            if(iSteps < 0)
            {
                System.out.println("Invalid steps");
                return;
            }

            if(iSteps >= 10000)
            {
                iGoalDays++;
            }

            if(iSteps > iMax)
            {
                iMax = iSteps;
            }
        }

        System.out.println("Goal Achieved Days: " + iGoalDays);
        System.out.println("Maximum Steps in Week: " + iMax);
    }
}