//Arraylist - contains array and linked list
//maintain sequence, allows duplicate
//project start

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

class StudyLog
{
    public String Subject;
    public double Duration;

    public StudyLog(String a, double d)
    {
        this.Subject = a;
        this.Duration = d;
    }
}

class program840
{
    public static void main(String A[])
    {
        StudyLog sObj1 = new StudyLog("C", 2.5);
        StudyLog sObj2 = new StudyLog("Java", 4.5);

        System.out.println(sObj1);      //display hashcode
        System.out.println(sObj2);

        LocalDate lObj = LocalDate.now();
        System.out.println(lObj);

    }
}