#include <stdio.h>
#include <stdlib.h>

struct número
{
  int número;
  struct número *next;
};

struct número *first, *last;
void mostrar_menu()
{
  printf("\nMenú\n");
  printf("1.- Añadir elementos\n");
  printf("2.- Mostrar lista\n");
  printf("3.- Contar los nodos\n");
  printf("4.- Eliminar nodos\n");
  printf("5.- Buscar nodos\n");
  printf("6.- Salir\n\n");
  printf("Escoge una opción: ");fflush(stdout);
}

void añadir_elemento()
{
  struct número *new;
  new = (struct número *) malloc(sizeof(struct número));
  printf("Nuevo elemento:\n");
  printf("Dame un número:\n"); fflush(stdout);
  scanf("%d", &new->número);
  new->next = NULL;
  if(first == NULL)
  {
    printf("Primer elemento\n");
    first = new;
    last = new;
  }
  else
  {
    last->next = NULL;
    first = new;
  }
}
void mostrar_lista()
{
  struct número *auxiliar;
  int control;
  control = 0;
  auxiliar = first;
  printf("\nTe muestro la lista completa:\n");
  do
  {
    printf("\nNúmero: %d",
    auxiliar->número);
    auxiliar = auxiliar->next;
    control++;
  }while(auxiliar->next == last);
  if(control == 0)
  {
    printf("\nEsta lista está vacía\n");
  }
}

void contar_nodos()
{
  struct número *auxiliar;
  int control;
  control = 0;
  auxiliar = first;
  printf("\nTe muestro la lista completa:\n");
  while(auxiliar != NULL)
  {
    auxiliar = auxiliar->next;
    control++;
  }
  if(control == 0)
  {
    printf("\nEl número de nodos es: %d\n",control);
  }
  else
  {
    printf("\nEl número de nodos es: %d\n",control);
  }
}
void eliminar_nodos()
{
  struct número *auxiliar;
    struct número *auxiar2;
  int control,buscar = 0;
  control = 0;
  int search = 0;
  auxiliar = first;
  printf("\nElemento que desea eliminar: \n");
  scanf("%d",&buscar);
  while(auxiliar != NULL)
  {
    if(auxiliar->número==buscar)
    {
      search = 1;
      printf( "\nse encuentra en el nodo :%d\n",control);
      printf("La lista es:\n");
      printf("\nNúmero: %d",
      auxiliar->número);
      if(control == 0)
      {
        printf("\nEsta lista está vacía\n");
      } 
    }
    auxiliar = auxiliar->next;
    if(search == 0)
    {
      printf( "\nNo se encuentra!!\n" );
    }
    control++;
  } 
}
void buscar_nodos()
{
  struct número *auxiliar;
  int control,buscar = 0;
  control = 0;
  int search = 0;
  auxiliar = first;
  printf("\nElemento que desea buscar:\n");
  scanf("%d",&buscar);
  while(auxiliar != NULL)
  {
    control++;
    if(auxiliar->número==buscar)
    {
      search=1;
      printf( "\nse encuentra en el nodo :%d",control);
    }
    auxiliar = auxiliar->next;
    if(search == 0)
    {
      printf( "\nNo se encuentra!!\n" );
    }
  } 
}
int main()
{
  int option;
  first = (struct número *) NULL;
  last = (struct número *) NULL;
  while(option != '5')
  {
    mostrar_menu();
    printf("¿Qué quieres hacer?:\n");
    scanf("%d",&option);
    switch(option)
    {
      case 1:
        añadir_elemento();
        break;
      case 2:
        mostrar_lista();
        break;
      case 3:
        contar_nodos();
        break;
      case 4:
        eliminar_nodos();
        break;
      case 5:
        buscar_nodos();
        break;
      case 6:
        exit(1);
        break;
      default:
        printf("Opción no válida");
        break;
    }
  }
}
