#include <stdio.h>
#include <stdlib.h>

int main()
{
    int *ptr, i , n1, n2;
    printf("Ingresa el tamaño del arreglo: ");
    scanf("%d", &n1);

    ptr = (int*) malloc(n1 * sizeof(int));

    printf("Dirección de memoria alojada: ");
    for(i = 0; i < n1; ++i)
    {
        printf("%u\t",ptr + i);
    }
    printf("\nIngresa el nuevo tamaño del arreglo: ");
    scanf("%d", &n2);
    ptr = realloc(ptr, n2);
    for(i = 0; i < n2; ++i)
    {
        printf("%u\t", ptr + i);
    }
    return 0;
 }