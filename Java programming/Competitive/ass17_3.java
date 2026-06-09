/*
Algorithm:

    START
        Accept first number as a
        Accept first number as b
        Perform maximum of two numbers
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   FindMax
// Input    :           int, int
// Output   :           void
// Description  :       Perform maximum of two numbers
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void FindMax(
                    int a,                                          //variable to store first input
                    int b                                           //variable to store second input
                )
    {
        if(a > b)
        {
            System.out.println("Maximum number is : "+a);
        }
        else
        {
            System.out.println("Maximum number is : "+b);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform maximum of two numbers of 2 int values
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass17_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.FindMax(20, 15);                                    //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   20  15
//Output    :   Maximum number is : 20
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
