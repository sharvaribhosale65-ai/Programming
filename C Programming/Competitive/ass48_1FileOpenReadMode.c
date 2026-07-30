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
//  Function name : ReadFile
//  Input         : char
//  Output        : int
//  Description   : To open file in read mode 
//  Date          : 27/07/2026
//  Author        : Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void ReadFile(
                    char Filename[]                 // Parameter to take first input
             )
{
    int fd = 0;                                     // File Descriptor

    fd = open(Filename, O_RDONLY);                  // Open file in read mode

    if(fd == -1)
    {
        return;
    }
    else
    {
        printf("File opeaned successfully."); 
    }

    close(fd);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to open file in read mode.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    ReadFile(Fname);                                // Function call

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :    Demo.txt
//  Output :    File opeaned successfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////