package factorial_programs;

import javax.swing.JOptionPane;

public class Factorial_Iterativo 
{
	public static int n,factorial;
	public static void main(String[] args)
	{
		n = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:\n"));	
		factorial = 1;
		Factorial_Iterativo.hacerFactorial();
		System.out.println("El factorial de: " +n+" = "+factorial);
	}
	public static void hacerFactorial()
	{
		for(int i = n ; i > 0; i--)
		{
			factorial = factorial * i;
		}
	}
}
