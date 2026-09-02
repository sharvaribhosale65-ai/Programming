//Arraylist - contains array and linked list
//maintain sequence, allows duplicate
//project start
//csv

                                //convert it into web application

import java.io.*;
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

    @Override
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

class program852
{
    public static void main(String A[]) throws Exception
    {
        LocalDate lObj = LocalDate.now();

        StudyLog s1 = new StudyLog(lObj, "C Programming", 4.5, "Revision of pointers");
        StudyLog s2 = new StudyLog(lObj, "C++ Programming", 4.5, "Revision of pointers");
        StudyLog s3 = new StudyLog(lObj, "Java Programming", 4.5, "Revision of pointers");
        StudyLog s4 = new StudyLog(lObj, "Python Programming", 4.5, "Revision of pointers");
        
        ArrayList<StudyLog> Database = new ArrayList<StudyLog>();       //Arraylist of studylog datatype userdefined

        Database.add(s1);
        Database.add(s2);
        Database.add(s3);
        Database.add(s4);

        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        String FileName = "MarvellousStudyLog.csv";         

        FileWriter fwObj = new FileWriter(FileName);        //create file

        fwObj.write("Date,Subject,Duration,Description\n");

        for(StudyLog s : Database)
        {
            fwObj.write(s.getDate()+","+s.getSubject()+","+s.getDuration()+","+s.getDescription()+"\n");
        }

        fwObj.close();
        
        Database.clear();
        Database = null;         //reference count will be 0
        System.gc();            //memory deallocation
    }
}