/*
Algorithm :
    START
        Accept a string as *str
        Accept a character as ch
        Return index of first occurence of character  
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
//Function name :   displayIndex
//Input         :   char, char
//Output        :   int
//Description   :   Display the index of first occurence of character 
//Date          :   24/06/2026
//Author        :   Sharvari Gorakhnath Bhosale
//
///////////////////////////////////////////////////////////////////////////////////////////

int displayIndex(char *str, char ch)
{
    int iCnt = 0;

    while(*str != '\0')
    {
        if(*str == ch)
        {
            return iCnt;
        }
        iCnt++;
        str++;
    }
    return -1;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Application to display the index of first occurence of character of 2 char values
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

    iRet = displayIndex(Arr, cValue);

    printf("Current location is : %d",iRet);
    
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   Marvellous Multi Os
//              M
//Output    :   0
//
//Input     :   Marvellous Multi Os  
//              w
//Output    :   -1     
//
//Input     :   Marvellous Multi Os
//              e
//Output    :   4
//
///////////////////////////////////////////////////////////////////////////////////////////
