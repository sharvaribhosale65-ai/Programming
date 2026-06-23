/*
Algorithm -
        START
            Accept character as ch
            Check it is digit or not 
            if TRUE
                print it is digit
            else
                print it is not a digit
        STOP        
*/



import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkDigit
// Input    :           String
// Output   :           boolean
// Description  :       Perform to Check it is digit or not
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public boolean chkDigit(String str)
    {
       int i = 0;
       
       char Arr[] = str.toCharArray();

       for(i = 0; i < Arr.length; i++)
       {
            if(Arr[i] >= 48 && Arr[i] <= 57)
            {
                return true;
            }
       }
       return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to Check it is digit or not value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass29_3
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        boolean bRet = false;

        String data = null;

        System.out.println("Enter string: ");
        data = sObj.nextLine();

        bRet = strObj.chkDigit(data);

        if(bRet == true)
        {
            System.out.println("It is a digit");
        }
        else
        {
            System.out.println("It is not a digit");
        }    
        sObj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   5
//OUTPUT    :   It is a digit
//
//INPUT     :   g
//OUTPUT    :   It is not a digit
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////