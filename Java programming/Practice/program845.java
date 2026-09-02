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
    //abstraction
    private LocalDate Date;
    private String Subject;
    private double Duration;
    private String Description;

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

    public LocalDate getDate()
    {
        return this.Date;
    }

    public String getSubject()
    {
        return this.Subject;
    }

    public double getDuration()
    {
        return this.Duration;
    }

    public String getDescription()
    {
        return this.Description;
    }
}

class program845
{
    public static void main(String A[])
    {
        LocalDate lObj = LocalDate.now();
        
        StudyLog sObj1 = new StudyLog(lObj, "C Programming", 3.5, "Pointers in C");
 
        System.out.println(sObj1.Duration);     //error

        System.out.println(sObj1.getDate());
        System.out.println(sObj1.getSubject());
        System.out.println(sObj1.getDuration());
        System.out.println(sObj1.getDescription());
    }
}