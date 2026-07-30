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
//  Function name : CreateFile
//  Input         : char
//  Output        : int
//  Description   : To create a file
//  Date          : 27/07/2026
//  Author        : Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void CreateFile(
                    char Filename[]                 // Parameter to take first input
               )
{
    int fd = 0;                                     // File Descriptor

    fd = creat(Filename, O_RDONLY);                  // Open file in read mode

    if(fd == -1)
    {
        return;
    }
    else
    {
        printf("File created successfully."); 
    }

    close(fd);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to create a file.
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    CreateFile(Fname);                                // Function call

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :    Demo.txt
//  Output :    File created successfully
//
/////////////////////////////////////////////////////////////////////////////////////////////////