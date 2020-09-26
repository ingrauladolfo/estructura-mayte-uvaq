package piladinámica;

public class NodoLista 
{
	private Object dato;
	private NodoLista siguiente;
	NodoLista ()
	{
		dato = null;
		siguiente = null;
	}
	NodoLista(Object dato)
	{
		this.dato = dato;
		siguiente = null;
	}
	NodoLista (Object dato, NodoLista sig)
	{
		this.dato = dato;
		siguiente = sig;
	}
	void setDato(Object dato)
	{
		this.dato = dato;
	}
	Object getDato()
	{
		return dato;
	}
	void setSiguiente (NodoLista sig)
	{
		siguiente = sig;
	}
	NodoLista getSiguiente()
	{
		return siguiente;
	}
	public String toString()
    {
        return "Nodo de una estructura enlazada ->" + super.toString();
    }
}
