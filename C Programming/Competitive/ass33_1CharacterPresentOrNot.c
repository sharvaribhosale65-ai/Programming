/*
Algorithm :
    START
        Accept a string as *str
        Accept a character as ch
        Check whether the charcter is present or not
        If yes
            Character is present
        else
            Character is not present   
        Display result
    STOP
*/

///////////////////////////////////////////////////////////////////////////////////////////
//
//Include required header files
//
///////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

#define TRUE 1
#define FALSE 0

typedef int BOOL;

///////////////////////////////////////////////////////////////////////////////////////////
//
//Function name :   chkCharacter
//Input         :   char, char
//Output        :   BOOL
//Description   :   Check whether the charcter is present or not
//Date          :   24/06/2026
//Author        :   Sharvari Gorakhnath Bhosale
//
///////////////////////////////////////////////////////////////////////////////////////////

BOOL chkCharacter(char *str, char ch)
{

    while(*str != '\0')
    {
        if(*str == ch)
        {
            return TRUE;
        }
        str++;
    }
    return FALSE;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Application to check whether the charcter is present or not of 2 char values
//
///////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char cValue = '\0';
    BOOL bRet = FALSE;

    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter a charcater : \n");
    scanf(" %c",&cValue);

    bRet = chkCharacter(Arr, cValue);

    if(bRet == TRUE)
    {
        printf("Character is present");
    }
    else
    {
        printf("Character is not present");
    }
    
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   Hello world 
//              w 
//Output    :   Character is present
//
//Input     :   Hello   
//              s
//Output    :   Character is not present     
//
///////////////////////////////////////////////////////////////////////////////////////////
