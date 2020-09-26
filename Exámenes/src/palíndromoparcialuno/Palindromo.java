package palíndromoparcialuno;

import java.io.*;

public class Palindromo 
{
	public static void main(String args[])throws IOException
	{
		Pila pilaChar;
		char ch;
		boolean esPal = true;
		String pal;
		BufferedReader entrada=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			pilaChar=new Pila();
			System.out.println("Por favor ingresa la palabra o números"+" para verificar si es palíndromo: ");
			System.out.flush();
			pal=entrada.readLine();
			pilaChar=new Pila();
			for(int i=0; i<pal.length();)
			{
				pilaChar.insertar(pal.charAt(i++));
				esPal=true;
				for(int j=0;esPal&& !pilaChar.pilaVacia();)
				{
					esPal=pal.charAt(j++)==pilaChar.quitar();
				}
			}
			pilaChar.limpiarPila();
			if(esPal)
			{
				System.out.println("La palabra o número "+pal+" es un palíndromo \n");
			}
			else
			{
				System.out.println("La palabra o número "+pal+" no es un palíndromo \n");
			}
		}
		catch(Exception er)
		{
			System.out.println("Exception;"+er);
		}
	}
}