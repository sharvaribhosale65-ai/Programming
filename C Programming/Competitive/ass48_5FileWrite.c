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
//  Function name : AppendFile
//  Input         : char
//  Output        : int
//  Description   : To write string at the end of file  
//  Date          : 27/07/2026
//  Author        : Sharvari Gorakhnath Bhosale
//
/////////////////////////////////////////////////////////////////////////////////////////////////

void AppendFile(
                    char Filename[],                // Parameter to take first input
                    char String[]                   // Parameter to take second input
               )
{
    char Buffer[BUFFER_SIZE] = {'\0'};              // Array to store data from file
    int fd = 0;                                     // File Descriptor
    int iCnt = 0;                                   // Loop counter
    int iRet = 0;                                   // Variable to store return value

    fd = open(Filename, O_RDWR | O_APPEND);         // Open file in read, write, append mode

    if(fd == -1)
    {
        return;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        write(fd, String, strlen(String));
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Application to write string at the end of file    
//
/////////////////////////////////////////////////////////////////////////////////////////////////

int main()
{
    char Fname[30] = {'\0'};                        // Array to store filename
    char string[50] = {'\0'};                       // Array to store string
    int iRet = 0;                                   // Variable to store return value of function

    printf("Enter Filename : ");
    scanf("%s", Fname);

    printf("Enter the string : ");
    scanf("%s", string);

    AppendFile(Fname, string);                      // Function call

    return 0;
}

/////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input  :    Demo.txt
//              Hello
//  Output :    ABCDEFGHIJKLMNOPQRSTVUWXYZ Hello
//
/////////////////////////////////////////////////////////////////////////////////////////////////