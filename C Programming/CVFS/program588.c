#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>      //only linux based os
#include<string.h>

#define BUFFER_SIZE 100

int main()
{
    int fd = 0;         //file descriptor
    int iRet = 0;
    char Data[BUFFER_SIZE] = {'\0'};

    fd = open("Marvellous.txt",O_RDONLY);       

    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        lseek(fd, 5, 0);                    //0 - start       
        iRet = read(fd, Data, 10);
        printf("%d bytes gets succesfully read\n",iRet);
        printf("Data from file is : %s\n\n",Data);

        ///////////////////////////////////////////////////

        memset(Data, '\0', sizeof(Data));
        lseek(fd, 5, 1);                    //1 - current                
        iRet = read(fd, Data, 10);
        printf("%d bytes gets succesfully read\n",iRet);
        printf("Data from file is : %s\n\n",Data);

        close(fd);
    }

    return 0;
}