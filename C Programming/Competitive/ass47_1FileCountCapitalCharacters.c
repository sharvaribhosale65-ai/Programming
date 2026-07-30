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
//  Function name : CountCapital
//  Input         : char
//  Output        : int
//  Description   : To count capital characters from file  
//  Date          : 27/07/2026
//  Author        : Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int CountCapital(
                    char Filename[]                 // Parameter to take input
                )
{
    char Buffer[BUFFER_SIZE] = {'\0'};              // Array to store data from file
    int fd = 0;                                     // File Descriptor
    int iCount = 0;                                 // Variable to store Count of Capital characters
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
            if(Buffer[iCnt] >= 'A' && Buffer[iCnt] <= 'Z')
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
//  Application to display count of capital characters from file
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    iRet = CountCapital(Fname);                     // Function call
    printf("Number of capital characters are : %d\n", iRet);

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :    ABCDEFGHIJKLMNOPQRSTUVWXYZ
//              abcd
//  Output :    26
//
/////////////////////////////////////////////////////////////////////////////////////////////////