/*
Algorithm -
        START
            Accept character as ch
            If ch is A or a
                print Your exam at 7 AM
            Else if ch is B or b
                print Your exam at 8.30 AM   
            Else if ch is C or c
                print Your exam at 9.20 AM 
            Else if ch is D or d
                print Your exam at 10.30 AM          
            Display result
        STOP        
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   DisplaySchedule
// Input    :           String
// Output   :           boolean
// Description  :       Perform to display schedule
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public boolean DisplaySchedule(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == 'A' || Arr[i] == 'a')
            {
                System.out.println("Your exam at 7 am");
                return true;
            }
            else if(Arr[i] == 'B' || Arr[i] == 'b')
            {
                System.out.println("Your exam at 8.30 am");
                return true;
            }
            else if(Arr[i] == 'C' || Arr[i] == 'c')
            {
                System.out.println("Your exam at 9.20 am");
                return true;
            }
            else if(Arr[i] == 'D' || Arr[i] == 'd')
            {
                System.out.println("Your exam at 10.30 am");
                return true;
            }
        }
        return false;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to perform to display schedule of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass29_5
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        boolean bRet = false;

        bRet = strObj.DisplaySchedule(data);

        if(bRet == false)
        {
            System.out.println("Invalid division");
        }

        sObj.close();

    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//INPUT     :   a
//OUTPUT    :   Your exam at 7 AM
//
//INPUT     :   D
//OUTPUT    :   Your exam at 10.30 AM
//
//INPUT     :   j
//OUTPUT    :   Invalid division
//
///////////////////////////////////////////////////////////////////////////////////////////////////////////