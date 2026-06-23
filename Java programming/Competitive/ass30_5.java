/*
ALGORITHM:
    START
        Accept character as str
        Display its ASCII value in decimal, octal and hexadecimal
        Display result 
    STOP
*/

import java.util.*;

////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   displayASCII
// Input    :           String
// Output   :           void
// Description  :       Display its ASCII value in decimal, octal and hexadecimal
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////


class StringX
{
    public void displayASCII(String str)
    {
        int i = 0;

        char Arr[] = str.toCharArray();

        System.out.println("Character\tDecimal\tOctal\tHexadecimal\n");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.printf("%c\t\t%d\t%o\t%X\n",Arr[i],(int)Arr[i],(int)Arr[i],(int)Arr[i]);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to display its ASCII value in decimal, octal and hexadecimal of string value
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass30_5
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        StringX strObj = new StringX();

        String data = null;

        System.out.println("Enter string : ");
        data = sObj.nextLine();

        strObj.displayASCII(data);

        sObj.close();
    }
}

///////////////////////////////////////////////////////////////////////////////////////
//INPUT     :   A
//OUTPUT    :   Character       Decimal   Octal   Hexadecimal
//                  A               65      101     41
//
//INPUT     :   B
//OUTPUT    :   Character       Decimal   Octal   Hexadecimal
//                  B               66      102     42
//
///////////////////////////////////////////////////////////////////////////////////////
