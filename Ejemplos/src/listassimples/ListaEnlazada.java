package listassimples;

public class ListaEnlazada <T> 
{
	public static Nodo primero = null;
	public ListaEnlazada()
	{
		listaVacia();
	}
	private void listaVacia()
	{
		Object primero = null;
	}
	public boolean estaVacia()
	{
		Object primero = null;
		return primero == null;
	}
	public void insertarPrimero(T t)
	{
		Nodo<T> nuevo = new Nodo<>(t);
		if (!estaVacia())
		{
			nuevo.setSiguiente(primero);
		}
		primero=nuevo;
	}
	public void insertarUltimo(T t)
	{
		Nodo<T> aux = new Nodo<>(t);
	    Nodo<T> rec_aux;
	    if (estaVacia()) 
	    {
	    		insertarPrimero(t);
	    }
	    else 
	    {
	    		Nodo<T> primero = null;
				rec_aux = primero;
	    		while(rec_aux.getSiguiente() != null)
	    		{
	    			rec_aux=rec_aux.getSiguiente();
	        }
	    		rec_aux.setSiguiente(aux);
	    }
	}
	public void quitarPrimero()
	{
		Nodo<T> aux;
	    if (!estaVacia())
	    {
	    		Nodo<T> primero = null;
	    		aux = primero;
	        primero = primero.getSiguiente();
	        aux=null;
	    }
	}
	public void quitarUltimo()
	{
		Nodo<T> primero = null;
		Nodo<T> aux=primero;
		if(aux.getSiguiente()==null)
		{
			listaVacia();
		}
		if(!estaVacia())
		{
			aux = primero;
			while(aux.getSiguiente().getSiguiente() != null)
			{
				aux=aux.getSiguiente();
	        }
			aux.setSiguiente(null);
		}
	}
	public T devolverUltimo()
	{
		T elemen = null;
	    Nodo<T> aux;
	    if (!estaVacia())
	    {
	    		aux = primero;
	        while(aux.getSiguiente() != null)
	        {
	        		aux = aux.getSiguiente();
	        }
	        elemen = aux.getDato();
	    }
	        return elemen;
	}
	public T devolverPrimero()
	{
		T elemen = null;
	    if (!estaVacia())
	    {
	    		elemen = (T) primero.getDato();
	    }
	    return  elemen;
	}
	public int cuantosElementos()
	{
		Nodo<T> aux;
	    int numElementos=0;
	    aux = primero;
	    while(aux != null)
	    {
	    		numElementos++;
	        aux = aux.getSiguiente();
	    }
	    return numElementos;
	}
	public T devolverDato(int pos)
	{
		Nodo<T> aux=primero;
	    int cont=0;
	    T dato=null;
	         
	    if(pos<0 || pos>=cuantosElementos())
	    {
	    		System.out.println("La posicion insertada no es correcta");
	    }
	    else
	    {
	    		while(aux!=null)
	    		{
	    			if (pos == cont)
	    			{
	    				dato=aux.getDato();
	    			}
	    			aux=aux.getSiguiente();
	    			cont++;
	                 
	        }
	    }
	    return dato;
	         
	}
	public Nodo<T> devolverNodo(int pos)
	{
		Nodo<T> aux=primero;
	    int cont=0;
	    if(pos<0 || pos>=cuantosElementos())
	    {
	            System.out.println("La posición insertada no es correcta");
	    }
	    else
	    {
	    		while(aux!=null)
	    		{
	    			if (pos == cont)
	    			{
	    				return aux; 
	            }
	    			aux=aux.getSiguiente();
	            cont++;
	                 
	        }
	    }
	    return aux;
	         
	}
	public void introducirDato(int pos, T dato)
	{
		Nodo<T> aux=primero;
	    Nodo<T> auxDato=null;
	    Nodo<T> anterior=primero;
	    int contador=0;
	    if(pos<0 || pos>cuantosElementos())
	    {
	            System.out.println("La posición insertada no es correcta");
	    }
	    else
	    {
	    		if(pos==0)
	    		{
	    			insertarPrimero(dato);
	        }
	    		else if(pos==cuantosElementos())
	    		{
	    			insertarUltimo(dato);
	        }
	    		else
	    		{
	    			while(aux!=null)
	    			{
	    				if (pos == contador)
	    				{
	    					auxDato=new Nodo<>(dato, aux);
	    					anterior.setSiguiente(auxDato);
	                }
	    				anterior=aux;
	    				contador++;
	    				aux=aux.getSiguiente();
	    			}
	    		}
	    }
	}
	public void modificarDato(int pos, T dato)
	{
		Nodo<T> aux=primero;
	    int cont=0;
	    if(pos<0 || pos>=cuantosElementos())
	    {
	    		System.out.println("La posicion insertada no es correcta");
	    }
	    else
	    {
	    		while(aux!=null)
	    		{
	    			if (pos == cont)
	    			{
	    				aux.setDato(dato); 
	            }
	    			cont++;
	    			aux=aux.getSiguiente();
	    		}
	    }
	        
	}
	public void borraPosicion(int pos)
	{
		Nodo<T> aux=primero;
	    Nodo<T> anterior=null;
	    int contador=0;
	    if(pos<0 || pos>=cuantosElementos())
	    {
	    		System.out.println("La posición insertada no es correcta");
	    }
	    else
	    {
	    		while(aux!=null)
	    		{
	    			if (pos == contador)
	    			{
	    				if (anterior==null)
	    				{
	    					primero = primero.getSiguiente();
	                 }
	    				else 
	    				{
	    					anterior.setSiguiente(aux.getSiguiente());
	                 }
	    				aux=null;
	    			}
	    			else
	    			{
	    				anterior=aux;
	    				aux=aux.getSiguiente();
	    				contador++;
	            }
	    		}
	    }
	}
	 
	    /**
	     * Devuelve el primer el elemento y lo borra de la lista
	     * @return Primer elemento
	     */
	    public T devolverYBorrarPrimero(){
	 
	        T dato=devolverPrimero();
	        quitarPrimero();
	        return dato;
	    }
	    public int indexOf (T t)
	    {
	    		Nodo<T> aux=primero;
	    		if (estaVacia())
	    		{
	    			return -1;
	    		}
	    		else
	    		{
	    			int contador=0;
	    			boolean encontrado=false;
	    			while(aux!=null && !encontrado)
	    			{
	    				if(t.equals(aux.getDato()))
	    				{
	    					encontrado=true;
	    				}
	    				else
	    				{
	    					contador++;
	    					aux=aux.getSiguiente(); 
	    				}
	    			}
	    			if(encontrado)
	    			{
	    				return contador;
	    			}
	    			else
	    			{
	    				return -1;
	    			}
	    		}
	    }
	    public int indexOf (T t, int pos)
	    {
	    		Nodo<T> aux;
	    		if (estaVacia())
	    		{
	    			return -1;
	    		}
	    		else
	    		{
	    			int contador=pos;
	    			boolean encontrado=false;
	    			aux=devolverNodo(pos);
	    			while(aux!=null && !encontrado)
	    			{
	    				if(t.equals(aux.getDato()))
	    				{
	    					encontrado=true;
	    				}
	    				else
	    				{
	    					contador++;
	    					aux=aux.getSiguiente();
	    				}
	            }
	            if(encontrado){
	                return contador;
	            }else{
	                return -1;
	            }
	       }
	    }
	 
	    /**
	     * Indica si un dato existe en la lista
	     * @param t Dato a comprobar
	     * @return Si el dato existe, devuelve true
	     */
	    public boolean datoExistente(T t){
	 
	        boolean existe=false;
	 
	        Nodo<T> aux=primero;
	 
	        while(aux!=null && !existe){
	 
	            if(aux.getDato().equals(t)){
	                existe=true;
	            }
	             
	            //Actualizamos
	            aux=aux.getSiguiente();
	        }
	 
	        return existe;
	    }
	     
	    /**
	     * Muestra el contenido de la lista
	     */
	    public void mostrar(){
	        System.out.println("Contenido de la lista");
	        System.out.println("---------------------");
	         
	        Nodo<T> aux=primero;
	         
	        while(aux!=null){
	            System.out.println(aux.getDato());//mostramos el dato
	            aux=aux.getSiguiente();
	        }
	         
	    }
	     
	    /**
	     * Devuelve el contenido de la lista en un String
	     * @return contenido de la lista
	     */
	    @Override
	    public String toString(){
	         
	        String contenido="";
	        Nodo<T> aux=primero;
	         
	        while(aux!=null){
	            contenido+=aux.getDato()+"\n"; //guardamos el dato
	            aux=aux.getSiguiente();
	        }
	         
	        return contenido;
	    }
}
