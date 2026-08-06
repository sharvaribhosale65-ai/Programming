#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int main()
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    char fName[30] = {'\0'};

    int fd = 0, iRet = 0;

    printf("Enter the file name : ");
    scanf("%[^'\n']s",fName);              //for filename space

    fd = open(fName,O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        write(1, Buffer, iRet);
        memset(Buffer,'\0',sizeof(Buffer));
    }
    close(fd);

    return 0;
}