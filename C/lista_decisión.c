#include <stdio.h>
#include <stdlib.h>

struct número
{
  int número;
  struct número *siguiente;
  struct número *anterior;
};
struct número *auxiliar;
struct número *first, *last;
void mostrar_menu()
{
  printf("\nMenú\n");
  printf("1.- Añadir elementos\n");
  printf("2.- Mostrar elementos de izquierda a derecha\n");
  printf("3.- Mostrar elementos de derecha a izquierda\n");
  printf("4.- Mostrar elementos de ambos lados\n");
  printf("5.- Salir\n\n");
  printf("Escoge una opción: ");fflush(stdout);
}
void añadir_elemento()
{
	struct número *new;
	struct número *first;
	new = (struct número *) malloc(sizeof(struct número));
	printf("Nuevo elemento:\n");
	printf("Dame un número:\n"); fflush(stdout);
	scanf("%d", &new->número);
	new -> siguiente = NULL;
	if(first == NULL)
  	{
  		printf("Primer elemento\n");
  		first = new;
  		last = new;
  	}
  	else
  	{
  		last->anterior = new;
  		last->siguiente = new;
  		last = new;
	}
}
void recorre_izqder(struct número *vaca)
{
	if(vaca != NULL)
	{
		printf("Número: %d",vaca->número);
		recorre_izqder(vaca->siguiente);
	}
}

void recorre_derizq(struct número *vaca)
{
	if(vaca != NULL)
	{
		printf("%d",vaca->número);
		recorre_derizq(vaca->anterior);
	}
}
void recorre_ambas(struct número *vaca,struct número *auxiliar)
{
	if(vaca != NULL)
	{
		printf("%d",vaca->número);
		recorre_ambas(vaca->siguiente,auxiliar);
	}
	else
	{
		if(auxiliar!=NULL)
		{
			printf("%d",auxiliar->número);
			recorre_ambas(vaca,auxiliar->anterior);
		}
	}
}
int main()
{
	int option;
	first = (struct número *) NULL;
	last = (struct número *) NULL;
	while(option != '1')
	{
		mostrar_menu();
		printf("¿Qué quieres hacer?:\n");
		switch(option)
		{
			case 1:

				añadir_elemento();
				break;
			case 2:
				recorre_izqder(first);
				break;
			case 3:
				recorre_derizq(last);
				break;
			case 4:
				recorre_ambas(first,last);
				break;
			case 5:


      default:
        printf("Opción no válida");
        break;
    }
	}
}
