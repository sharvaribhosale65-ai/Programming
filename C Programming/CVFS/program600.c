#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CalculateFileSize(char FileName[])
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0, iRet = 0;
    int iSize = 0;

    fd = open(FileName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        iSize = iSize + iRet;
    }
    close(fd);
    return iSize;
}

int main()
{
    char fName[30] = {'\0'};
    int iRet = 0;

    printf("Enter the file name : ");
    scanf("%[^'\n']s",fName);              

    iRet = CalculateFileSize(fName);

    printf("Size of the file : %dbytes", iRet);
    return 0;
}