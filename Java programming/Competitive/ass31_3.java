/*
ALGORITHM : 
    START
        Accept a string as str
        Display frequecy of small and capital characters
        Display result
    STOP     
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   countFrequency
// Input    :           String
// Output   :           int
// Description  :       Display frequecy of small and capital characters
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public int countFrequency(String str)
    {
        int i = 0, iCountCapital = 0, iCountSmall = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 65 && Arr[i] <= 90)
            {
                iCountCapital++;
            }
            else if(Arr[i] >= 97 && Arr[i] <= 122)
            {
                iCountSmall++;
            }
        }
        return iCountSmall - iCountCapital;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Display frequecy of small and capital characters of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass31_3
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        int iRet = 0;

        iRet = strObj.countFrequency(data);

        System.out.println("Frequecy is : "+iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   MarvellouS
//OUTPUT    :   6
//
//INPUT     :   HellO
//OUTPUT    :   1
//
/////////////////////////////////////////////////////////////////////////////////////////////