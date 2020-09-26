
public class DatosEstructurados 
{
	enum enumerados{SILLA,MESA};
	enum otros{CASA,EDIFICIO};
	public static void main(String[] args) 
	{
		enumerados variable_enumerados;
		variable_enumerados = enumerados.SILLA;
		enumerados var2 = enumerados.MESA;
		
		otros var_otros = otros.CASA;
		System.out.println(variable_enumerados.ordinal() == 0);
		System.out.println(variable_enumerados.name());
		System.out.println(variable_enumerados.toString());
		
		for(enumerados i: enumerados.values())
		{
			System.out.println("Elemento: "+i.toString());
		}
	}

}
