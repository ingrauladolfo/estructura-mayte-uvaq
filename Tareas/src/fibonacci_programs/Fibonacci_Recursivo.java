package fibonacci_programs;

import javax.swing.JOptionPane;

public class Fibonacci_Recursivo 
{
	public static int n;
	public static void main(String[] args)
	{
		n = Integer.parseInt(JOptionPane.showInputDialog("Dame un número: "));
		for(int i = 0; i <= n;i++)
		{
			System.out.println(Fibonacci(i)+" ");
		}
	}
	public static int Fibonacci(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else
		{
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}
