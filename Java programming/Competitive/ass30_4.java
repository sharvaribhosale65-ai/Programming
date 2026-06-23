/*
ALGORITHM :
    START
        Accept a character as str
        Check it is special symbol or not
        Display result
    STOP 
*/
import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   chkSpecial
// Input    :           String
// Output   :           boolean
// Description  :       Perform to Check it is special symbol or not
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public boolean chkSpecial(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if( (Arr[i] >= 33 && Arr[i] <= 47) || 
                (Arr[i] >= 58 && Arr[i] <= 64) ||   
                (Arr[i] >= 91 && Arr[i] <= 96) || 
                (Arr[i] >= 123 && Arr[i] <= 127))
            {
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to Check it is special symbol or not of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass30_4
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        boolean bRet = false;

        bRet = strObj.chkSpecial(data);

        if(bRet == true)
        {
            System.out.println("It is a special symbol");
        }
        else
        {
            System.out.println("It is not a special symbol");
        }
        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   %
//OUTPUT    :   It is a special symbol
//
//INPUT     :   G
//OUTPUT    :   It is not a special symbol
//
//////////////////////////////////////////////////////////////////////////////////////////////