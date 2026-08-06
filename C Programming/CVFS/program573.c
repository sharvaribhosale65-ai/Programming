#include <stdio.h>
#include <fcntl.h>      //file control
#include <unistd.h>

int main()
{
    int fd = 0;     //file descriptor

    fd = open("Marvellous.txt", O_CREAT | O_WRONLY, 0777);      //0777 - permission(owner, group, other)

    if(fd == -1)
    {
        printf("Unable to create file\n");
    }
    else
    {
        printf("File gets successfully created with fd : %d\n",fd);     //3. Because 0,1,2 are reserved for stnd i/p, o/p, error
        close(fd);
    }

    return 0;
}