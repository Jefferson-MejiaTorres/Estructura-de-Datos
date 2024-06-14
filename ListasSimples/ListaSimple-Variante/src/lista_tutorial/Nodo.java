/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_tutorial;

/**
 *
 * @author jm
 */
public class Nodo {
    public int dato;
    public Nodo siguinte;
    //constructor para insetar a final
    public Nodo(int d){
            this.dato=d;
            this.siguinte=null;
            }
    //constructor para insertar al inicio
    public Nodo(int d, Nodo n){
        dato=d;
        siguinte=n;
    }
}
