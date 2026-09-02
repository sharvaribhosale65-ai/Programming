//project start

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

class StudyTracker
{
    public ArrayList<StudyLog> Database;    //characteristic

    public StudyTracker()                   //constructor
    {
        Database = new ArrayList<StudyLog>();
    }

    public void InsertLog()
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("Enter the deatils of your study");
                    System.out.println("-----------------------------------------------------");

        LocalDate lObj = LocalDate.now();

        System.out.println("Ypu are entering the date as : "+lObj);

        System.out.println("Enter the name of subject : ");
        String sub = sObj.nextLine();

        System.out.println("Enter the time period of you study :");
        double dur = sObj.nextDouble();

        sObj.nextLine();        //issue resolved

        System.out.println("Please provide the description of your study : ");      
        String desc = sObj.nextLine();

        StudyLog studyObj = new StudyLog(lObj, sub, dur, desc);

        Database.add(studyObj);

        System.out.println("Study log inserted successfully...");
        System.out.println("-----------------------------------------------------");

    }

    public void DisplayLog()
    {
        System.out.println("-----------------------------------------------------");
        
        if(Database.isEmpty())
        {
            System.out.println("Nothing to display - database is empty");
            System.out.println("-----------------------------------------------------");
            return;
        }
    }

    public void ExportToCSV()
    {

    }

    public void SummaryByDate()
    {

    }

    public void SummaryBySubject()
    {

    }
}


//Shell to interact with end-user
class program860
{
    public static void main(String A[])
    {
        int iChoice = 0;
        StudyTracker stObj = new StudyTracker();

        Scanner sObj = new Scanner(System.in);

        System.out.println("-----------------------------------------------------");
        System.out.println("--- Welcome to Marvellous Study Tracker ---");
        System.out.println("-----------------------------------------------------");

        do
        {
            System.out.println("-----------------------------------------------------");
            System.out.println("Please select appropriate option : ");
            System.out.println("-----------------------------------------------------");

            System.out.println("1 : Insert new study log");
            System.out.println("2 : View all study logs");
            System.out.println("3 : Export study logs to CSV");
            System.out.println("4 : Summary of study log by date");
            System.out.println("5 : Summary of study log by subject");
            System.out.println("6 : Exit the application");

            System.out.println("-----------------------------------------------------");

            iChoice = sObj.nextInt();

            switch(iChoice)
            {
                case 1 :        //Insert new log
                    stObj.InsertLog();
                    break;

                case 2 :        //View all study logs
                    stObj.DisplayLog();
                    break;

                case 3 :        //Export to CSV
                    stObj.ExportToCSV();
                    break;

                case 4 :        //Summary by date
                    stObj.SummaryByDate();
                    break;

                case 5 :        //Summary by subject
                    stObj.SummaryBySubject();
                    break;

                case 6 :        //Terminate the project
                    break;

                default:
                    System.out.println("Please enter valid option");
                    break;
            }

        } while(iChoice != 6);






        System.out.println("-----------------------------------------------------");
        System.out.println("--- Thank You for using Marvellous Study Tracker ---");
        System.out.println("-----------------------------------------------------");

    }  //End of main
} //End of class