package piladinámica;

public class Console 
{
	public static void printPrompt(String prompt)
	{
		System.out.println();
	    System.out.print(prompt + " ");
		System.out.flush();
	}
	public static String readLine()
	{
		int ch;
		String r = "";
		boolean done = false;
		while (!done)
		{
			try
			{
				ch = System.in.read();
				if (ch < 0 || (char)ch == '\n')
					done = true;
				else if ((char)ch != '\r')
					r = r + (char) ch;
			}
			catch(java.io.IOException e)
			{
				done = true;
			}
		}
			return r;
	}
	public static String readLine(String prompt)
	{
		printPrompt(prompt);
		return readLine();
	}
	public static char readChar(String prompt)
	{
		while(true)
		{
			printPrompt(prompt);
			try
			{
				return readLine().trim().toCharArray()[0];
	 		}
			catch(NumberFormatException e)
			{
        		System.out.println("No es un entero. Intente de nuevo!");
			}
	   	}
	}
	public static int readInt(String prompt)
	{
		 while (true)
		 {
			printPrompt(prompt);
			try
			{
				return Integer.valueOf
               	(readLine().trim()).intValue();
			}
			catch(NumberFormatException e)
			{
				System.out.println("No es un entero. Intente de nuevo!");
			}
		}
	}
	public static double  readDouble(String prompt)
	{
		while (true)
		{
			printPrompt(prompt);
			try
			{
				return Double.parseDouble(readLine().trim());
			}
			catch(NumberFormatException e)
			{
				System.out.println("No es un double. Intente de nuevo!");
			}
		}
	}
}
