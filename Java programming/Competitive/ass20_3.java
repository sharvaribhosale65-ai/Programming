/*
Algorithm:

    START
        Accept number as iNo
        Perform to check whether number is perfect number or not
        Display the result
    STOP
*/

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   checkPerfect
// Input    :           int
// Output   :           void
// Description  :       Perform to check whether number is perfect number or not
// Date :               09/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPerfect   (
                            int iNo                                 //variable to store input
                        )
    {
        int iCnt = 0;                                               //initialize the counter
        int iSum = 0;                                               //variable to store result

        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        if(iSum == iNo)
        {
            System.out.println("It is perfect number");
        }
        else
        {
            System.out.println("It is imperfect number");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to check whether number is perfect number or not of int value
//
////////////////////////////////////////////////////////////////////////////////////////////////

public class ass20_3 
{
    public static void main(String[] args) 
    {
        Logic obj = new Logic();
        obj.checkPerfect(6);                                    //display result  
    }    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   6
//Output    :   It is perfect number
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////
