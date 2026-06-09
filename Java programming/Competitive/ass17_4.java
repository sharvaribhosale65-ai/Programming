/*
Algorithm:

    START
        Accept first number as a
        Accept second number as b
        Accept third number as c
        Perform minimum of three numbers
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   FindMin 
// Input    :           int, int, int
// Output   :           void
// Description  :       Perform minimum of three numbers
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindMin(
                    int a,                                          //variable to store first input
                    int b,                                          //variable to store second input
                    int c                                           //variable to store third input
                )
    {
        if(a < b && a < c)
        {
            System.out.println("Minimum number is : "+a);
        }
        else if(b < a && b < c)
        {
            System.out.println("Minimum number is : "+b);
        }
        else
        {
            System.out.println("Minimum number is : "+c);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform minimum of three numbers of 3 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass17_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();

        obj.FindMin(3, 7, 2);                                //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   3   7   2
//Output    :   Minimum number is : 2
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
