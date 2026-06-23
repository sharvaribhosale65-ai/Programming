/*
ALGORITHM : 
    START
        Accept a string as str
        Count capital characters from it
        Display result
    STOP     
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   countCapital
// Input    :           String
// Output   :           int
// Description  :       Count capital characters from it
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public int countCapital(String str)
    {
        int i = 0;
        int iCount = 0; 

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 65 && Arr[i] <= 90)
            {
                iCount++;
            }
        }
        return iCount;
    } 
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Count capital characters from it of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass31_1
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        int iRet = 0;

        iRet = strObj.countCapital(data);

        System.out.println("Count of capital characters of string are : "+iRet);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   Marvellous Multi OS
//OUTPUT    :   4
//
//INPUT     :   Sharvari BHOSALE
//OUTPUT    :   8
//
/////////////////////////////////////////////////////////////////////////////////////////////