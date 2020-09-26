#include <stdio.h>

int main(int argc, char **argv)
{
    int prev_1, prev_2, fib_num,n;
    
    prev_1 = 0;
    prev_2 = 1;
    
    printf("Dame un número:\n");
    scanf( "%d", &n);

    printf("%d, %d, ", prev_1, prev_2);
    fib_num = prev_1 + prev_2;
    
    do
    {
        prev_2 = prev_1;
        prev_1 = fib_num;
        fib_num = prev_1 + prev_2;
        printf("%d, ", fib_num);
    }
    while (fib_num < n);
    printf("\n");
}