/*
ALGORITHM : 
    START
        Accept a string as str
        Count small characters from it
        Display result
    STOP     
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   countSmall
// Input    :           String
// Output   :           int
// Description  :       Count small characters from it
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public int countSmall(String str)
    {
        int i = 0;
        int iCount = 0; 

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 97 && Arr[i] <= 122)
            {
                iCount++;
            }
        }
        return iCount;
    } 
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to count small characters from it of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass31_2
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        int iRet = 0;

        iRet = strObj.countSmall(data);

        System.out.println("Count of small characters of string are : "+iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   Marvellous
//OUTPUT    :   9
//
//INPUT     :   India is My country
//OUTPUT    :   14
//
/////////////////////////////////////////////////////////////////////////////////////////////