package listadoblemente;

public class ListaDoble {
    private NodoDoble inicio, fin;
    private int longitud;
    
    public ListaDoble(){
        inicio = fin = null;
        this.longitud = 0;
    }
    
    //Metodo para saber cuando la lista esta vacia
    public boolean estVacia(){
        return inicio == null;
    }
    //Metodo para agregar nodos al final
    public void agragarAlFinal(int el){
        if(!estVacia()){
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguiente = fin;
        }else{
            inicio = fin = new NodoDoble(el); 
        }
        longitud++;
    }
    
    //Metodo para agregar al inicio
    public void agragarAlInicio(int el){
        if(!estVacia()){
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguiente.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(el); 
        }
        longitud++;
    }
    
    //Metodo para mostrar la Lista de inicio a fin
    public void mostrarListaInicioFin(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = inicio;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.siguiente;
            }
            System.out.println("" + datos);
        }
    }
    
    //Metodo para mostrar la lista de fin a inicio
    public void mostrarListaFinInicio(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble auxiliar = fin;
            while(auxiliar != null){
                datos = datos + "[" + auxiliar.dato + "]<=>";
                auxiliar = auxiliar.anterior;
            }
            System.out.println("" + datos);
        }
    } 
    
    //Metodo para eliminar del inico
    public int eliminarDelInico(){
        int elemento = inicio.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            inicio = inicio.siguiente;
            inicio.anterior = null;
        }
        longitud--;
        return elemento;
    }
    
    //Metodo para eliminar del final
    public int eliminarDelfinal(){
        int elemento = fin.dato;
        if(inicio == fin){
            inicio = fin = null;
        }else{
            fin = fin.anterior;
            fin.siguiente = null;
        }
        longitud--;
        return elemento;
    }
    
    // Obtener la longitud de la lista
    public int obtenerLongitud() {
        return longitud;
    }
       
}
