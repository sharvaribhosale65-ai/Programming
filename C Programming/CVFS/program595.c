#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

#define BUFFER_SIZE 1024

int main()
{
    write(1,"Jay ganesh...",13);  //fd - 1

    return 0;
}

/*
0 - stdin(keyboard)
1 - stdout(console)
2 - stderr(error)
*/