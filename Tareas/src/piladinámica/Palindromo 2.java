package piladinámica;

public class Palindromo 
{
	static PilaLi pilaPalindromo;
	public static void main(String[] args) 
	{
		new Palindromo();
	}
	public Palindromo()
	{
		String texto;
		texto = Console.readLine("Ingrese una palabra o una serie de números cualquiera:");
		cargarPalabraPila(texto);
		try
		{
			if(verificarPalindromo(texto))
				System.out.println("\nLa palabra o serie de números: " + texto + " es un palíndromo.");
			else
				System.out.println("\nLa palabra o serie de números: " + texto + " no es un palíndromo.");	
		}		
		catch(DesbordamientoInferior e)
		{
			System.out.println(e);
		}
		System.out.print("\nLa cantidad de letras de la palabra o serie de números es: \"" + texto + "\" es: "+ texto.length()+" letras o números");
		pilaPalindromo.vaciar();
		cargarPalabraPila(texto);
		System.out.println("\nTe muestro la pila que ingresaste: ");
		try
		{
			pilaPalindromo.imprimirPila();	
		}
		catch(DesbordamientoInferior e)
		{
			System.out.println(e);
		}
	}
	public static boolean verificarPalindromo(String cadena) throws DesbordamientoInferior
	{
		Object auxiliar;
		for(int i = 0; i < cadena.length(); i++)
		{
			auxiliar = new Character(cadena.charAt(i));
			if(auxiliar.equals(pilaPalindromo.cima()))
				pilaPalindromo.desapilar();
			else
				return false;		
		}
		return true;
	}
	public static void cargarPalabraPila(String cadena)
	{
		pilaPalindromo = new PilaLi();
		Object auxiliar;
		
		for(int i = 0; i < cadena.length(); i++)
		{
			auxiliar = new Character(cadena.charAt(i)); 
			pilaPalindromo.apilar(auxiliar);
		}
	}
}
