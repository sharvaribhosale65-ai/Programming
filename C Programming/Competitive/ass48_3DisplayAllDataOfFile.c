// Write a program which accepts filename from user and 
// read all data from that file and display contents on screen.

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
//  Function name : DisplayData
//  Input         : char
//  Output        : int
//  Description   : To read all data and display contents on screen  
//  Date          : 27/07/2026
//  Author        : Aishwarya Mohan Jadhav
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void DisplayData(
                    char Filename[]                 // Parameter to take first input
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
        write(1, Buffer, iRet);
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to read all data and display contents on screen  
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    DisplayData(Fname);                             // Function call

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input   :   Demo.txt
//  Output  :   Hello guyzzzz....
//
/////////////////////////////////////////////////////////////////////////////////////////////////