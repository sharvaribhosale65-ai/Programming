import java.io.*;
import java.util.*;

class ass52_3
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int i = 0;
        int marks = 0;
        int total = 0;
        float average = 0.0f;
        boolean bFlag = false;

        System.out.println("Enter marks of 5 subjects : ");

        for(i = 1; i <= 5; i++)
        {
            marks = sobj.nextInt();

            if(marks < 0 || marks > 100)
            {
                System.out.println("Invalid marks");
                return;
            }

            if(marks < 35)
            {
                bFlag = true;
            }

            total = total + marks;
        }

        if(bFlag == true)
        {
            System.out.println("Result: Fail");
        }
        else
        {
            average = (float)total / 5;

            System.out.println("Average Marks: " + average);

            if(average >= 75)
            {
                System.out.println("Final Result: Distinction");
            }
            else if(average >= 60)
            {
                System.out.println("Final Result: First Class");
            }
            else if(average >= 50)
            {
                System.out.println("Final Result: Second Class");
            }
            else
            {
                System.out.println("Final Result: Pass");
            }
        }
    }
}