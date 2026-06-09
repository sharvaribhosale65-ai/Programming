/*
Algorithm:

    START
        Accept number as marks
        Perform to display grade of a student based on marks
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   displayGrade
// Input    :           int
// Output   :           void
// Description  :       Perform to display grade of a student based on marks
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void displayGrade(
                        int marks                       //variable to store input
                     )
    {
        if(marks > 90 && marks <= 100)
        {
            System.out.println("A grade");
        }
        else if(marks > 80 && marks <=90)
        {
            System.out.println("B grade");
        }
        else if(marks > 70 && marks <= 80)
        {
            System.out.println("C grade");
        }
        else if(marks > 60 && marks <= 70)
        {
            System.out.println("D grade");
        }
        else
        {
            System.out.println("F grade");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display grade of a student based on marks of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass19_2 
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);                    //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   82
//Output    :   B grade
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
