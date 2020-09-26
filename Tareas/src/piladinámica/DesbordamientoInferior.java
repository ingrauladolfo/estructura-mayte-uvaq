package piladinámica;

public class DesbordamientoInferior extends Exception
{
	public DesbordamientoInferior()
	 {
	 	super("Ha ocurrido un Desbordamiento Inferior.");
	 }
	 public DesbordamientoInferior(String a)
	 {
	 	super(a);
	 }
}
