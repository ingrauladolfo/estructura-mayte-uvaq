/*Raúl Adolfo Torres Vargas*/
package palíndromo_parcial_uno;
import java.io.*;
class Cola
{
	char Cola[];
	int Frente;
	int Final;
	int Nulo;
	int max_cola = 50;
	public void Colita()
	{
		Cola = new char[max_cola+1];
		max_cola = max_cola-1;
		Nulo = -1;
		Frente = Nulo;
		Final = Nulo;
	}

	
	public void Meter(char Elemento)
	{
		if((Frente == 0 && Final == max_cola)||(Frente == (Final + 1)))
		{
			System.out.println("Desbordamiento de memoria");
			return;
		}
		else
		{
			if(Frente == Nulo)
			{
				Frente = 0;
				Final = 0;
			}
			else if(Final == max_cola)
			{
				Final = 0;
			}
			else
			{
				Final += 1;
			}
			Cola[Final]=Elemento;
		}
	}

	public char Sacar(char ch)
	{
		char aux;
		if(Frente == Nulo)
		{
			System.out.println("Cola Vacia");
			return 0;
		}else
		{
			aux = Cola[Frente];
			if(Frente == Final)
			{
				Frente = Nulo;
				Final= Nulo;
			}
			else if(Frente == max_cola)
			{
				Frente = 0;
			}
			else
			{
				Frente += 1;
			}
	return aux;
		}
	}
}

class Pila
{
	private static final int TAMPILA = 10000;
	private int cima;
	private char []listaPila;
	public Pila()
	{
		cima = -1;
		listaPila= new char[TAMPILA];
	}

	public void insertar(char elemento) throws Exception
	{
		if (pilaLlena())
		{
			throw new Exception("Desbordamiento pila");
		}
		cima++;
		listaPila[cima] = elemento;
	}

	public char quitar(char ch) throws Exception
	{
		char aux;
		if (pilaVacia())
		{
			throw new Exception ("La pila está vacía, no se puede extraer");
		}
		aux = listaPila[cima];
		cima--;
		return aux;
	}

	public boolean pilaVacia()
	{
		return cima == -1;
	}

	public boolean pilaLlena()
	{
		return cima == TAMPILA-1;
	}

}


class Palindromo
{
	public static void main(String [] ramms)
	{
		Pila pilaChar;
		Cola colaChar;
		char ch,cha,chacha;
		boolean esPal   = false;
		String pal;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try
		{
			pilaChar = new Pila();
			colaChar = new Cola();
			System.out.print("Teclea la palabra o número a verificar si es palíndromo:  ");
			System.out.flush();
			pal = entrada.readLine();
			for (int i = 0; i< pal.length();)
			{
				ch = pal.charAt(i++);
				pilaChar.insertar(ch);
				colaChar.Meter(ch);
				if(pilaChar.quitar(ch)==colaChar.Sacar(ch))
				{
					esPal= true;
					break; 
				} 
				else
				{
					esPal = false;
					break;
				}
			}
			if(esPal)
			{
				System.out.println("La palabra o número " + pal + " es un palíndromo \n");
			}
			else
			{
				System.out.println("La palabra o número " + pal + " no es un palíndromo \n");
			}
		}
		catch (Exception er) 
		{
			System.err.println("Exception: " + er);
		}
	}
}
