/*
Algorithm:

    START
        Accept number as iNo
        Print multiplication table of number
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   PrintTable
// Input    :           int
// Output   :           void
// Description  :       Print multiplication table of number
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void PrintTable (
                        int iNo                         //variable to store input
                    )
    {
        int iCnt = 0;                                   //initialize counter
        int iTable = 0;                                 //variable to display result

        for(iCnt = 1; iCnt <= 10; iCnt++)               //perform loop
        {
            iTable = iNo * iCnt;
            System.out.println(iTable);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to print multiplication table of number of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

class ass17_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();

        obj.PrintTable(5);                          //display result
    }
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   5
//Output    :   5
//              10
//              15
//              20
//              25
//              30    
//              35
//              40
//              45
//              50            
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
