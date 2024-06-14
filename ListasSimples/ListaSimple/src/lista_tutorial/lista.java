/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tutorial;

/**
 *
 * @author DANIEL FELIPE
 */
public class lista {
    int longitud;
    Nodo inicio, fin;//puntoros para saber donde esta el inicio y el final

    public lista() {
        inicio = null;
        fin = null;
    }

    //metodo para saber si la lista esta vacia
    public boolean EstaVacia() {
        if (inicio == null) {
            return true;
        }
        return false;
    }

    //metodo para agregar un nodo al inicio de la lista
    public void AgregarAlInicio(int elemento) {
        //creando al nodo
        inicio = new Nodo(elemento, inicio);
        if (fin == null) {
            fin = inicio;
        }
    }

    //metodo para agregar un nodo al inicio de la lista
    public void AgregarAlFinal(int elemento) {
        if (!EstaVacia()) {
            fin.siguinte = new Nodo(elemento);
            fin = fin.siguinte;
        } else {
            inicio = fin = new Nodo(elemento);
        }
    }
    
    

    //metodo para eliminar un nodo del inicio
    public int EliminarAlinicio() {

        int elemento = inicio.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            inicio = inicio.siguinte;
        }
        return elemento;
    }

    //metodo para elimar al final
    public int EliminarAlFinal() {
        int elemento = fin.dato;
        if (inicio == fin) {
            inicio = fin = null;
        } else {
            Nodo temporal = inicio;
            while (temporal.siguinte != fin) {
                temporal = temporal.siguinte;
            }
            fin = temporal;
            fin.siguinte = null;
        }
        return elemento;
    }

    //metodo para mostrar los datos
    public void MostrarLista() {
        Nodo recorrer = inicio;
        while (recorrer != null) {
            System.out.print("[" + recorrer.dato + "]->");
            recorrer = recorrer.siguinte;
        }
        System.out.println("\n");
    }
}
