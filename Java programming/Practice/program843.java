//Arraylist - contains array and linked list
//maintain sequence, allows duplicate
//project start

                                //convert it into web application

import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;


//class StudyLog extends Object
class StudyLog
{
    public LocalDate Date;
    public String Subject;
    public double Duration;
    public String Description;

    public StudyLog(LocalDate a, String b, double c, String d)
    {
        this.Date = a;
        this.Subject = b;
        this.Duration = c;
        this.Description = d;
    }

    public String toString()
    {
        return Date + " | " + Subject + " | " + Duration + " | " + Description;
    }
}

class program843
{
    public static void main(String A[])
    {
        LocalDate lObj = LocalDate.now();
        
        StudyLog sObj1 = new StudyLog(lObj, "C Programming", 3.5, "Pointers in C");
        StudyLog sObj2 = new StudyLog(lObj, "Java Programming", 5.5, "Inheritance in java");
 
        System.out.println(sObj1);
        System.out.println(sObj2);
    }
}