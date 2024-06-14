package listadoblemente;


public class NodoDoble {
    public int dato;
    NodoDoble siguiente, anterior;
    
    //Constructor para cuando ya hay nodos
    public NodoDoble(int el, NodoDoble s, NodoDoble a){
        dato = el;
        siguiente = s;
        anterior = a;
    }
    
    //Constructor para cuando aun no hay nodos
    public NodoDoble(int el){
        this(el, null, null);
    }
    
}
