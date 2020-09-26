package palíndromoparcialuno;
import java.io.*;

public class Pila 
{
	public static final int TAMPILA = 10000;
	public int cima;
	public char []listaPila;
	public Pila()
	{
		cima=-1;
		listaPila=new char[TAMPILA];
	}
	public void insertar(char elemento) throws Exception
	{
		if(pilaLlena())
		{
			throw new Exception("Desbordamiento de pila");
		}
		cima++;
		listaPila[cima]=elemento;
	}
	public char quitar()throws Exception
	{
		char aux;
		if(pilaVacia())
		{
			throw new Exception("pila vacia, no se puede exceder");
		}
		aux=listaPila[cima];
		cima--;
		return aux;
	}
	public boolean pilaVacia()
	{
		return cima == -1;
	}
	public boolean pilaLlena()
	{
		return cima==TAMPILA-1;
	}
	public void limpiarPila()
	{
		cima=-1;
	}
}
