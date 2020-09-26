import java.util.*;

public class Lista 
{
	public static void main(String[] args)
	{
		Set<String> nombres = new HashSet<String>();
		nombres.add("Mayté");
		nombres.add("Pánfila");
		nombres.add("Pancrasia");
		nombres.add("Juanita");
		
		Iterator iter = nombres.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		nombres.clear();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		nombres.clear();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		nombres.clear();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		nombres.clear();
		System.out.println("...");
	}
}
