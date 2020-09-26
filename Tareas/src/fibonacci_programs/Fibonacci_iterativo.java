package fibonacci_programs;

import javax.swing.JOptionPane;

public class Fibonacci_iterativo 
{
	public static int n = 0,num = 1,x, aux;
	public static void main(String[] args) 
	{
		x = Integer.parseInt(JOptionPane.showInputDialog("Dame un número:\n"));
		
		System.out.println(n);
		System.out.println(num);
		while (n+num <= x)
		{
			Fibonacci_iterativo.hacerFibonacci();
		}
    }
	public static void hacerFibonacci()
	{
			aux = n;
			n = num;
			num = aux + n;
			System.out.println(num);
	}
}
