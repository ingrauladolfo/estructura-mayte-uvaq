package árbol_binario;

public class Árbol_binario
{
	public class nodoArbol
	{
		public Árbol_binario hd;
        public Árbol_binario hi;
        public int dato;
        public void nodoArbol()
        {
        		hd = null;
        		hi = null;
        		dato = 0;
        	}
    }
 
    public nodoArbol raiz;
 
    public void abb()
    {
    		nodoArbol raiz = new nodoArbol();
    }
    public boolean esVacio()
    {
    		return (raiz == null);
    }
    public void insertar(int a)
    {
    		if (esVacio())
    		{
    			nodoArbol nuevo = new nodoArbol();
    			nuevo.dato = a;
    			nuevo.hd = new Árbol_binario();
    			nuevo.hi = new Árbol_binario();
    			raiz = nuevo;
        }
        else {
            if (a > raiz.dato) {
                (raiz.hd).insertar(a);
            }
            if (a < raiz.dato){
                (raiz.hi).insertar(a);
            }
        }
    }
 
    public void preOrder(nodoArbol raiz2){
        if (!esVacio()) {
            System.out.println("El orden en preOrden es: "+raiz.dato);
            raiz.hi.preOrder(raiz2);
            raiz.hd.preOrder(raiz2);
        }
    }
 
    public void inOrder(nodoArbol raiz2){
        if (!esVacio()) {
            raiz.hi.inOrder(raiz2);
            System.out.println("El orden en inOrden es: "+raiz.dato);
            raiz.hd.inOrder(raiz2);
        }
    }
 
    public void posOrder(nodoArbol raiz2){
        if (!esVacio()) {
            raiz.hd.posOrder(raiz2);
            raiz.hi.posOrder(raiz2);
            System.out.println("El orden en postOrden es: "+raiz.dato);
 
        }
    }
 
    public Árbol_binario buscar(int a){
        Árbol_binario arbolito = null;
        if (!esVacio()) {
            if (a == raiz.dato) {
            return this;
            }
            else {
                if (a < raiz.dato) {
                    arbolito = raiz.hi.buscar(a);
                }
                else {
                    arbolito = raiz.hd.buscar(a);
                }
            }
        }
        return arbolito;
    }
 
    public boolean existe(int a){
    if (!esVacio()) {
            if (a == raiz.dato) {
            return true;
            }
            else {
                if (a < raiz.dato) {
                    raiz.hi.existe(a);
                }
                else {
                    raiz.hd.existe(a);
                }
            }
        }
        return false;
    }
 
    public int cantidad(){
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + raiz.hd.cantidad() + raiz.hi.cantidad());
        }
    }
 
    public int altura() {
        if (esVacio()) {
            return 0;
        }
        else {
            return (1 + Math.max(((raiz.hi).altura()), ((raiz.hd).altura())));
        }
    }
 
    public int buscarMin() {
        Árbol_binario arbolActual = this;
        while( !arbolActual.raiz.hi.esVacio() ) {
            arbolActual = arbolActual.raiz.hi;
        }
        int devuelvo= arbolActual.raiz.dato;
        arbolActual.raiz=null;
        return devuelvo;
    }
 
    public int buscarMan(int dato) {
        Árbol_binario arbolActual = this;
        while( !arbolActual.raiz.hd.esVacio() ) {
            arbolActual = arbolActual.raiz.hd;
        }
        int devuelvo= arbolActual.raiz.dato;
            arbolActual.raiz=null;
        return devuelvo;
    }
 
    public boolean esHoja() {
        boolean hoja = false;
        if( (raiz.hi).esVacio() && (raiz.hd).esVacio() ) {
            hoja = true;
        }
        return hoja;
    }
 
    public boolean eliminar(int dato) {
        Árbol_binario paraEliminar = buscar(dato);
        if (!paraEliminar.esVacio()) {
            if (paraEliminar.esHoja()) {
               paraEliminar.raiz = null;
            }
            else {
                if (!paraEliminar.raiz.hi.esVacio() && !paraEliminar.raiz.hd.esVacio()) {
                    paraEliminar.raiz.dato = paraEliminar.raiz.hd.buscarMin();
                }
                else {
                    if (paraEliminar.raiz.hi.esVacio()) {
                        paraEliminar.raiz = paraEliminar.raiz.hd.raiz;
                    }else{
                        paraEliminar.raiz = paraEliminar.raiz.hi.raiz;
                    }
                }
            }
        }
        return true;
    }
}