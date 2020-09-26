import java.util.*;

public class Conjuntos2 
{
	public static void main(String[] args)
	{
		Set<String> nombres = new HashSet<String>();
		nombres.add("Mayté");
		nombres.add("María");
		nombres.add("Teresa");
		
		Iterator iter = nombres.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		nombres.add("Mayté");
		nombres.add("María");
		nombres.add("Teresa");
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
