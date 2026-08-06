#include <stdio.h>
#include <fcntl.h>
#include <unistd.h>

int main()
{
    int fd = 0;     //file descriptor

    fd = open("Marvellous.txt", O_CREAT | O_WRONLY, 0666);

    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File created successfully\n");
        close(fd);
    }

    return 0;
}