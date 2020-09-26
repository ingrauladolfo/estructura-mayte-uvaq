#include <stdio.h>
#include <stdlib.h>
//#include <malloc.h>

int main(){

int n;
char* puntcadena;
printf("Ingrese el numero de caracteres de la cadena: ");
//scanf("%d",&n);
n = 20;
puntcadena=(char*)malloc(n*sizeof(char));
printf("Se ha reservado espacio de memoria para %d caracteres", n);
printf("\nEl numero de bytes es %d", sizeof(int));
printf("\nIngrese la cadena: ");
gets(puntcadena);
printf("El valor almacenado en la variable de la cadena es: %s\n", &*puntcadena);

return 0;
}