package piladinámica;

public class PilaLi implements Pila
{
	private NodoLista cimaDePila;
    private int cantElementos;
    
    public PilaLi()
    {
        cimaDePila = null;
        cantElementos = 0;
    }
    
    public boolean esVacia()
    {
        return cimaDePila == null;
    }
    
    public void vaciar()
    {
        cimaDePila = null;
        cantElementos = 0;
    }
    
    public void apilar(Object x)
    {
        cimaDePila = new NodoLista(x, cimaDePila);
        cantElementos++;
    }
    
    public void desapilar() throws DesbordamientoInferior
    {
        if(esVacia())
           throw new DesbordamientoInferior("Desapilar");
        cimaDePila = cimaDePila.getSiguiente();
        cantElementos--;
    }
    
    public Object cima() throws DesbordamientoInferior
    {
        if(esVacia())
          throw new DesbordamientoInferior("Cima");
        return cimaDePila.getDato();
    }
    
    public Object cimaYDesapilar() throws DesbordamientoInferior
    {
        if(esVacia())
            throw new DesbordamientoInferior("cimaYDesapiar");
        
        Object datoCima = cimaDePila.getDato();
        cimaDePila = cimaDePila.getSiguiente();
        cantElementos--;
        return datoCima;
    }
    
    public int cantidad()
    {
    		return cantElementos;	
    } 
    
    public void imprimirPila() throws DesbordamientoInferior
	{
    		while(!esVacia())
    			System.out.println(cimaYDesapilar());
	}
}
