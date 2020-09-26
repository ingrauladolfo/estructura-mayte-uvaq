package piladinámica;

public interface Pila
{
	void apilar(Object x );
	void desapilar() throws DesbordamientoInferior;
	Object cima()	throws DesbordamientoInferior;
	Object cimaYDesapilar() throws DesbordamientoInferior;
	boolean esVacia();
	void vaciar();
}
