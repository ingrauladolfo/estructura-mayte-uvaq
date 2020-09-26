#include<stdio.h>
#include<stdlib.h>

int main()
{
    int vaca[5];
    int n;
    for (int  i = 0;i<5;i++)
    {
        printf("Dame un número: ");
        scanf("%d", &n);
        vaca = n;
        printf("%d \n",*vaca);
    }
}