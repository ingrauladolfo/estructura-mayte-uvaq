#include <stdlib.h>
#include <stdio.h>

struct ingrediente
{
	int cantidad;
	char *ingrediente;
	char *medida;
	struct postre *next_postre;
	struct postre *first_postre;
	struct postre *last_postre;
}

struct postre
{
	char *nombre;
	struct ingrediente *next_ingrediente;
	struct ingrediente *first_ingrediente;
	struct ingrediente *last_ingrediente;
}
struct postre *postres;
void mostrar_menú()
{
	printf("\nMenú\n");
	printf("1.- Imprimir la lista de todos los ingredientes, a partir del nombre del postre\n");
	printf("2.- Insertar nuevos ingredientes dado el nombre del postre\n");
	printf("3.- Eliminar ingredientes dado el nombre del postre\n");
	printf("4.- Insertar un postre con todos sus ingredientes\n");
	printf("5.- Eliminar un postre con todos sus ingredientes\n");
	printf("6.- Salir\n\n");
	printf("Escoge una opción: ");fflush(stdout);
}
void añadir_postre()
{
	struct postre *new_postre;
	new = (struct postre *) malloc(sizeof(struct postre));
	printf("Nuevo elemento:\n");
	printf("Dame un postre:\n");fflush(stdout);
	scanf("%d", &new_postre->postre);
	new ->next_postre = NULL;
	if(first_postre == NULL)
	{
		printf("Primer elemento\n");
		first_postre = new_postre;
		last_postre = new_postre;
	}
	else
	{
		last_postre -> next_postre = new_postre;
		last_postre = new_postre;
	}
	postres -> new_postre;
}
int main()
{
	
}