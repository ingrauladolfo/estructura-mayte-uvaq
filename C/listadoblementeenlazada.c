#include <stdio.h>
#include <stdlib.h>

struct número
{
  int número;
  struct número *next;
  struct número *last;
};

struct número *first, *last;
void mostrar_menu()
{
  printf("\nMenú\n");
  printf("1.- Añadir elementos\n");
  printf("2.- Mostrar lista\n");
  printf("3.- Contar los nodos\n");
  printf("4.- Eliminar nodos\n");
  printf("5.- Salir\n\n");
  printf("Escoge una opción: ");fflush(stdout);
}

int añadir_elemento()
{
  struct número *new;
  struct número *next;
  new = (struct número *) malloc(sizeof(struct número));
  printf("Nuevo elemento:\n");
  printf("Dame un número:\n"); fflush(stdout);
  scanf("%d", &new->número);
  new -> next = NULL;

  if(first == NULL)
  {
    printf("Primer elemento\n");
    return first = last = new;
  }
  else
  {
    first->next = new;
    last->next = new;
    first = new;
    next = new;
    last = new;
  }


  if(first == NULL)
  {
    printf("Primer elemento\n");
    first = new;
    next = new;
    last = new;
  }
  else
  {
    first->next = new;
    last->next = new;
    last = new;
    next = new;
  }
}
int mostrar_listarecursiva()
{
  struct número *auxiliar;
  int control = 0;
  auxiliar = first;
  printf("\nTe muestro la lista completa:\n");
  while(auxiliar != NULL)
  {
    printf("\nNúmero: %d",
      auxiliar->número);
    if(auxiliar == 0)
    {
      return 0;
    }
    else
    {
      auxiliar = auxiliar->next;
      auxiliar = auxiliar->last;
    }
    control++;
  }
  if(control == 0)
  {
    printf("\nEsta lista está vacía\n");
  }
  return mostrar_listarecursiva(auxiliar - 1);
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
  int control;
  control = 0;
  auxiliar = first;
  printf("\nTe muestro la lista completa:\n");
  while(auxiliar != NULL)
  {
    printf("\nNúmero: %d",
    auxiliar->número);
    auxiliar = auxiliar->next;
    control++;
  }
  control = control - 1;
  
  if(control == 0)
  {
    printf("\nEl número de nodos es: %d\n",control);
  }
  else
  {
    printf("\nEl número de nodos es: %d\n",control);
  }
}

int main()
{
  int option;
  first = (struct número *) NULL;
  last = (struct número *) NULL;
  while(option != '3')
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
        mostrar_listarecursiva();
        break;
      case 3:
        contar_nodos();
        break;
      case 4:
        eliminar_nodos();
        break;
      case 5:
        exit(1);
        break;
      default:
        printf("Opción no válida");
        break;
    }
  }
}
