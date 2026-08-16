import java.util.*;

class ass54_2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iMarks = 0;
        int iAttendance = 0;
        int iIncome = 0;

        System.out.println("Enter marks percentage : ");
        iMarks = sobj.nextInt();

        System.out.println("Enter attendance percentage : ");
        iAttendance = sobj.nextInt();

        System.out.println("Enter family income : ");
        iIncome = sobj.nextInt();

        if(iMarks >= 80 && iAttendance >= 75 && iIncome <= 300000)
        {
            System.out.println("Student is eligible for scholarship");
        }
        else
        {
            System.out.println("Student is not eligible for scholarship");
        }
    }
}