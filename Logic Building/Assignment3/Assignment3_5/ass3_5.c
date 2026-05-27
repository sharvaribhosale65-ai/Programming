/////////////////////////////////////////////////////////////////////////////
//
// Include required header files
//
/////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

typedef int BOOL;

#define TRUE 1
#define FALSE 0

/////////////////////////////////////////////////////////////////////////////
//
// Function name    :   ChkVowel
// Input    :           char
// Output   :           char
// Description  :       Check whether that character is vowel or not
// Date :               26/05/2026 
// Author   :           Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////

BOOL ChkVowel   (
                    char CValue                                //input
                )
{
    if(CValue == 'a' || CValue == 'e' || CValue == 'i' || CValue == 'o' || CValue == 'u'
       || CValue == 'A' || CValue == 'E' ||CValue == 'I' ||CValue == 'O' ||CValue == 'U')
    {
        return TRUE;
    }
    else
    {
        return FALSE;
    }
}

/////////////////////////////////////////////////////////////////////////////////////////
//
// Application to check that character is vowel or not of char value
//
/////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char cValue = '\0';                                     //to store input
    BOOL bRet = FALSE;

    printf("Enter character : ");
    scanf("%c",&cValue);

    bRet = ChkVowel(cValue);

    if(bRet == TRUE)
    {
        printf("It is vowel");
    }
    else
    {
        printf("It is not a vowel");
    }

    return 0;
}        

///////////////////////////////////////////////////////////////////////////////////////
//
// Input :  a 
// Output : It is vowel
// Input :  t 
// Output : It is not a vowel
//
///////////////////////////////////////////////////////////////////////////////////////