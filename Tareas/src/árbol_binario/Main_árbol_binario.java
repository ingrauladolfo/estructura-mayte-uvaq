package árbol_binario;
import javax.swing.*;

public class Main_árbol_binario
{
	public static Árbol_binario arbolito = new Árbol_binario();
	public static int selección,dato;
	public static void main(String[] args)
	{
		do
		{
			selección = Integer.parseInt(JOptionPane.showInputDialog("¿Qué quieres hacer?:\n"+"1.- Agregar\n"+"2.-Recorrer Inorden\n"+"3.- Recorrido PreOrden\n"+"4.- Recorrido PostOrden\n"+"5.- Buscar un nodo\n"+"6.- Eliminar un nodo\n"+"7.- Salir\n"));
			switch(selección)
			{
				case 1:
					dato = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:\n"));
					arbolito.insertar(dato);
					break;
				case 2:
					if(!arbolito.esVacio())
					{
						arbolito.inOrder(arbolito.raiz);
					}
					else
					{
						System.out.println("El árbol está vacío");
					}
					break;
				case 3:
					if(!arbolito.esVacio())
					{
						arbolito.preOrder(arbolito.raiz);
					}
					else
					{
						System.out.println("El árbol está vacío");
					}
					break;
				case 4:
					if(!arbolito.esVacio())
					{
						arbolito.posOrder(arbolito.raiz);
					}
					else
					{
						System.out.println("El árbol está vacío");
					}
					break;
				case 5:
					if(!arbolito.esVacio())
					{
						dato = Integer.parseInt(JOptionPane.showInputDialog("Dame un número para buscar:\n"));
						if(arbolito.buscar(dato) == null)
						{
							System.out.println("El nodo que estabas buscando no fue encontrado, el número fue: "+dato);
						}
						else
						{
							System.out.println("El nodo encontrado fue: "+dato);
						}
					}
					else
					{
						System.out.println("El árbol está vacío");
					}
					break;
				case 6:
					if(!arbolito.esVacio())
					{
						dato = Integer.parseInt(JOptionPane.showInputDialog("Dame un número para eliminar:\n"));
						if(arbolito.eliminar(dato) == false)
						{
							System.out.println("El nodo "+ dato +" no se encuentra");
						}
						else
						{
							System.out.println("El nodo borrado fue: "+dato);
						}
					}
					else
					{
						System.out.println("El árbol está vacío");
					}
					break;
				case 7:
					System.exit(0);
					break;
			}
		}
		while(true);
	}

}
