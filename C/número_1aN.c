#include <stdio.h>
#include <stdlib.h>

int suma1N(int num);
int main()
{
	int num;
	printf("Dame un número:\n");
	scanf("%d",&num);
	printf("La suma desde 1 hasta %d = %d\n",num,suma1N(num));
}
int suma1N(int num)
{
	if(num == 1)
	{
		return 1;
	}
	else
	{ 
		printf("%d\n",num);
		printf("%d\n",num-1);
		return num + suma1N(num-1);
	}
}