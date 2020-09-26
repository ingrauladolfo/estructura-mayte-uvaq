#include<stdio.h>
#include<stdlib.h>

int main()
{
    int a[4] ={5,7,9,11}, h= 81;
    int *p;
    p = a+3;
    printf("%d \n", *(p-3));
}