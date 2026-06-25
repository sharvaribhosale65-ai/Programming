/*
Algorithm :
    START
        Accept a string as *str
        Accept a character as ch
        Display the count of character   
        Display result
    STOP
*/

///////////////////////////////////////////////////////////////////////////////////////////
//
//Include required header files
//
///////////////////////////////////////////////////////////////////////////////////////////
#include<stdio.h>

///////////////////////////////////////////////////////////////////////////////////////////
//
//Function name :   displayCount
//Input         :   char, char
//Output        :   int
//Description   :   Display the count of character
//Date          :   24/06/2026
//Author        :   Sharvari Gorakhnath Bhosale
//
///////////////////////////////////////////////////////////////////////////////////////////

int displayCount(char *str, char ch)
{
    int iCount = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            iCount++;
        }
        str++;
    }
    return iCount;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Application to display the count of character of 2 char values
//
///////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char cValue = '\0';
    int iRet = 0;

    char Arr[50] = {'\0'};

    printf("Enter string : \n");
    scanf("%[^'\n']s",Arr);

    printf("Enter a charcater : \n");
    scanf(" %c",&cValue);

    iRet = displayCount(Arr, cValue);

    printf("Frequecy of charcater is : %d",iRet);
    
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   Marvellous Multi Os
//              M
//Output    :   2
//
//Input     :   Marvellous Multi Os  
//              w
//Output    :   0     
//
///////////////////////////////////////////////////////////////////////////////////////////
