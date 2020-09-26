import java.util.*;


public class CalcularModa 
{
	public static void main(String[] args)
	{
		Integer n [] = {1,2,3,4,5,6,4,5,4,3,2,1,2,3,4,5,6,3,2,3,4,5,1,2,3,4};
		Set <Integer> conjunto = new HashSet<Integer>();
		Set <Integer> moda = new HashSet<Integer>();
		for(int e: n)
		{
			if(!conjunto.add(e))
			{
				moda.add(e);
			}
		}
		System.out.println(moda);
	}
}
