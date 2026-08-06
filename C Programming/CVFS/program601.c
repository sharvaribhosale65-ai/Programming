#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>
#include<sys/stat.h>  //to calculate size of file

#define BUFFER_SIZE 1024

int CalculateFileSize(char FileName[])
{
    struct stat sObj;               //object of stat structure
                                    //stat - filename parameter. fstat - file descriptor parameter
    stat(FileName, &sObj);

    return sObj.st_size;
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