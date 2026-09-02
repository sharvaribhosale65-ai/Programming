//project start

                                //convert it into web application

                                //Add = load from CSV to database

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

        System.out.println("Log report of Marvellous Study Tracker");
        System.out.println("-----------------------------------------------------");

        for(StudyLog s : Database)
        {
            System.out.println(s);
        }

        System.out.println("-----------------------------------------------------");
    }

    public void ExportToCSV()
    {
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the name that you want to create for CSV file");
        String FileName = sObj.nextLine();

        System.out.println("-----------------------------------------------------");
        
        if(Database.isEmpty())
        {
            System.out.println("Nothing to export - database is empty");
            System.out.println("-----------------------------------------------------");
            return;
        }

        try(FileWriter fwObj = new FileWriter(FileName))
        {
            fwObj.write("Date,Subject,Duration of study,Description of study\n");

            for(StudyLog s : Database)
            {
                fwObj.write(s.getDate()+","+
                            s.getSubject()+","+
                            s.getDuration()+","+
                            s.getDescription()+"\n");
            }

            System.out.println("Data gets exported to CSV successfully");
            System.out.println("-----------------------------------------------------");
        }

        catch(IOException iObj)
        {
            System.out.println(iObj);
        }
        
        catch(Exception eObj)
        {
            System.out.println(eObj);
        }
    }

    public void SummaryByDate()
    {
        System.out.println("-----------------------------------------------------");
        System.out.println("Summary by Date from study tracker");
        System.out.println("-----------------------------------------------------");

        TreeMap <LocalDate, Double> tObj = new TreeMap<LocalDate, Double>();

        LocalDate lObj = null;
        double d = 0.0;

        double old = 0.0;

        for(StudyLog s : Database)
        {
            lObj = s.getDate();
            d = s.getDuration();

            if(tObj.containsKey(lObj))
            {
                old = tObj.get(lObj);
                tObj.put(lObj, d+old);
            }
            else
            {
                tObj.put(lObj, d);
            }
        }

        //Display the details as per date : total study hrs
        for(LocalDate l : tObj.keySet())
        {
            System.out.println("Date : " +l+ " Total study duration is : "+tObj.get(l));
        }

        System.out.println("-----------------------------------------------------");


    }

    public void SummaryBySubject()
    {

    }
}


//Shell to interact with end-user
class program867
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