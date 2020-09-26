#include <stdlib.h>
#include <stdio.h>

long sumar_dig(long n)
{
	if(n == 0)
	{
		return n;
	}
	else
	{
		return sumar_dig(n/10)+(n%10);
	}
}

int main()
{
	long n;
	printf("Dame una serie de números:\n");
	scanf("%ld",&n);
	printf("El resultado es: %ld\n",sumar_dig(n));
}