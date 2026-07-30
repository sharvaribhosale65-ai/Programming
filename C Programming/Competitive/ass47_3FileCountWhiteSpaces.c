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
//  Function name : CountWhite
//  Input         : char
//  Output        : int
//  Description   : To count white spaces from file  
//  Date          : 27/07/2026
//  Author        : Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int CountWhite(
                    char Filename[]                 // Parameter to take input
              )
{
    char Buffer[BUFFER_SIZE] = {'\0'};              // Array to store data from file
    int fd = 0;                                     // File Descriptor
    int iCount = 0;                                 // Variable to store Count of white spaces
    int iCnt = 0;                                   // Loop counter
    int iRet = 0;                                   // Variable to store return value

    fd = open(Filename, O_RDONLY);                  // Open file in read mode

    if(fd == -1)
    {
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        for(iCnt = 0; iCnt < iRet; iCnt++)
        {
            if(Buffer[iCnt] == ' ')
            {
                iCount++;
            }
        }
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
    return iCount;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to display count of white spaces from file
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    iRet = CountWhite(Fname);                       // Function call
    printf("Number of white spaces are : %d\n", iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :    A BC D
//  Output :    2
//
/////////////////////////////////////////////////////////////////////////////////////////////////