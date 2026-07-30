/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Include required header files
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  User-Defined Macros
//
/////////////////////////////////////////////////////////////////////////////////////////////////

#define BUFFER_SIZE 1024

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name : DisplayN
//  Input         : char
//  Output        : int
//  Description   : To print number of characters of from starting position  
//  Date          : 27/07/2026
//  Author        : Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void DisplayN(
                    char Filename[],                // Parameter to take first input
                    int iSize                       // Parameter to take secound input
             )
{
    char Buffer[BUFFER_SIZE] = {'\0'};              // Array to store data from file
    int fd = 0;                                     // File Descriptor
    int iCnt = 0;                                   // Loop counter
    int iRet = 0;                                   // Variable to store return value

    fd = open(Filename, O_RDONLY);                  // Open file in read mode

    if(fd == -1)
    {
        return;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            printf("%c", Buffer[iCnt]);
        }
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to display print number of characters of from starting position 
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    int iValue = 0;                                 // Variable to store count / size
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    printf("Enter the number of characters to read : ");
    scanf("%d", &iValue);

    DisplayN(Fname, iValue);                                // Function call

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :    Marvellous Infosystems
//                12
//  Output :    Marvellous I
//
/////////////////////////////////////////////////////////////////////////////////////////////////