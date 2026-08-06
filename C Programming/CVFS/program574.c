#include<stdio.h>
#include<fcntl.h>

int main()
{
    int fd = 0;         //file descriptor

    fd = open("Marvellous.txt",O_RDONLY);       //Macro

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File gets successfully opened with fd : %d\n",fd);
    }

    return 0;
}