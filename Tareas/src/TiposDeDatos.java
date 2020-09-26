import javax.swing.*;

public class TiposDeDatos 
{
	public static int n,np,np1;
	public static byte n1,sn1,ssn1;
	public static short n2, np2, npp;
	public static long n3;
	public static float n4;
	public static double n5;
	public static char chara;
	public static boolean boo,boo1;
	public static void main(String[] args)
	{
		n = 2147483647;
		np = 128;
		np1 = 120;
		n1 = (byte) -129;
		sn1 = (byte) 128;
		ssn1 = (byte) 120;
		n2 =  6;
		n3 = (long)Integer.parseInt(JOptionPane.showInputDialog("Dame un número: "));
		n4 = Float.parseFloat(JOptionPane.showInputDialog("Dame un número: "));
		n5 = Float.parseFloat(JOptionPane.showInputDialog("Dame un número: "));
		chara = (char) Float.parseFloat(JOptionPane.showInputDialog("Dame un caracter: "));
		boo = false;
		boo1 = true;
		System.out.println(n);
		System.out.println(np);
		System.out.println(np1);
		System.out.println(n1);
		System.out.println(sn1);
		System.out.println(ssn1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		System.out.println(chara);
	}
}
