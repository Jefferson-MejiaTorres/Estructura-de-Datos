package listadoblemente;

import java.util.Scanner;

public class ListaDoblemente {

    // Método para mostrar el menú
    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("***********************");
        System.out.println("1. AGG nodo al inicio");
        System.out.println("2. AGG nodo al final");
        System.out.println("3. Mostrar Lista inicio a fin");
        System.out.println("4. Mostrar Lista fin a inicio");
        System.out.println("5. Eliminar un nodo del inicio");
        System.out.println("6. Eliminar un nodo del final");
        System.out.println("7. Obtener longitud");
        System.out.println("8. Salir");
    }

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ListaDoble lista = new ListaDoble();
        int op, elemento, eliminado;
        do {
            mostrarMenu();
            op = tec.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Ingresa el elemento del Nodo, AGG nodo al inicio");
                    elemento = tec.nextInt();
                    lista.agragarAlInicio(elemento);
                    break;
                case 2:
                    System.out.println("Ingresa el elemento del Nodo, AGG Nodo al final");
                    elemento = tec.nextInt();
                    lista.agragarAlFinal(elemento);
                    break;
                case 3:
                    if (!lista.estVacia()) {
                        lista.mostrarListaInicioFin();
                    } else {
                        System.out.println("NO HAY NODOS, LISTA VACIA");
                    }
                    break;
                case 4:
                    if (!lista.estVacia()) {
                        lista.mostrarListaFinInicio();
                    } else {
                        System.out.println("NO HAY NODOS, LISTA VACIA");
                    }
                    break;
                case 5:
                    if (!lista.estVacia()) {
                        eliminado = lista.eliminarDelInico();
                        System.out.println("El elemento eliminado es: " + eliminado);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 6:
                    if (!lista.estVacia()) {
                        eliminado = lista.eliminarDelfinal();
                        System.out.println("El elemento eliminado es: " + eliminado);
                    } else {
                        System.out.println("La lista esta vacia");
                    }
                    break;
                case 7: 
                    System.out.println("La longitud de la lista es: " + lista.obtenerLongitud());
                    break;
                case 8:
                    System.out.println("PROGRAMA TERMINADO");
                    break;
                default:
                    System.out.println("LA OPCION NO ESTA EN EL MENU");
            }
        } while (op != 8);
    }

}
