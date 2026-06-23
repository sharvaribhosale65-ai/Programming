////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// Function name    :   DisplayASCII
// Description  :       Display ASCII value from 0 - 255
// Date :               23/06/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////

class StringX
{
    public void DisplayASCII()
    {
        int i = 0;

        System.out.println("Symbol\tDecimal\tHexadecimal\tOctal");

        for(i = 0; i <= 255; i++)
        {
            System.out.printf("%c\t%d\t%X\t%o\n",(char)i, (int)i,(int)i, (int)i);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////
//
// Application to Display ASCII value from 0 - 255
//
////////////////////////////////////////////////////////////////////////////////////////////////


class ass30_1
{
    public static void main(String A[])
    {
        StringX strObj = new StringX();
        strObj.DisplayASCII();
    }
}
