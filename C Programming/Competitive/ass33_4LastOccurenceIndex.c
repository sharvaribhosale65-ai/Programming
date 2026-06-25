/*
Algorithm :
    START
        Accept a string as *str
        Accept a character as ch
        Return index of last occurence of character  
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
//Function name :   lastOccurence
//Input         :   char, char
//Output        :   int
//Description   :   Display the index of last occurence of character 
//Date          :   24/06/2026
//Author        :   Sharvari Gorakhnath Bhosale
//
///////////////////////////////////////////////////////////////////////////////////////////

int lastOccurence(char *str, char ch)
{
    int iCnt = 0;
    int iIndex = -1;

    while(*str != '\0')
    {
        if(ch == *str)
        {
            iIndex = iCnt;
        }
        iCnt++;
        str++;
    }
    return iIndex;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Application to display the index of last occurence of character of 2 char values
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

    iRet = lastOccurence(Arr, cValue);

    printf("Current location is : %d",iRet);
    
    return 0;
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//Input     :   Marvellous Multi Os
//              M
//Output    :   11
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
