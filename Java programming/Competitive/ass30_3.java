/*
ALGORITHM :
    START
        Accept character as str
        If character is capital
            print till Z
        Else if character is small
            print reverse till a
        Otherwise
            print as it is
    STOP                
*/


import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   Display
// Input    :           String
// Output   :           void
// Description  :       Perform to display conditions
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public void Display(String str)
    {
        int i = 0;
        char j = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 65 && Arr[i] <= 90)
            {
                for(j = Arr[i]; j <= 'Z'; j++)
                {
                    System.out.print(j+"\t");
                }
            }
            else if(Arr[i] >= 97 && Arr[i] <= 122)
            {
                for(j = Arr[i]; j >= 'a'; j--)
                {
                    System.out.print(j+"\t");
                }
            }
            else
            {
                System.out.println();
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Perform to display conditions of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass30_3
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        strObj.Display(data);

        sObj.close();
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   Q 
//OUTPUT    :   Q       R       S       T       U       V       W       X       Y       Z
// 
//INPUT     :   m
//OUTPUT    :   m       l       k       j       i       h       g       f       e       d       c       b       a
//
//INPUT     :   4  
//OUTPUT    :   
//
/////////////////////////////////////////////////////////////////////////////////////////////////////