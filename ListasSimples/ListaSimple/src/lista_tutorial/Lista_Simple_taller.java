/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista_tutorial;

import java.util.Scanner;

/**
 *

 */
public class Lista_Simple_taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        lista listas = new lista();
        lista listas2 = new lista();
        lista listas3 = new lista();
        int longitud = 0;
        int op, el;
        System.out.println("\t\tMENU");
        System.out.println("1. agregar a la lista 1");
        System.out.println("2. agregar a la lista 2");

        System.out.println("3. mostrar los datos de la lista");

        System.out.println("4. salir");
        do {
            System.out.println("------------------------------------");
            System.out.print("Ingrese la opcion:");
            op = tec.nextInt();
            System.out.println("------------------------------------");
            switch (op) {
                case 1 -> {

                    System.out.println("-INGRESE EL ELEMENTO  A LA LISTA 1: ");
                    System.out.print(" :");
                    el = tec.nextInt();
                    listas.AgregarAlFinal(el);
                    longitud++;
                }
                case 2 -> {
                    System.out.println("-INGRESE EL ELEMENTO A LA LISTA  2: ");
                    System.out.print(" :");
                    el = tec.nextInt();
                    listas2.AgregarAlFinal(el);
                    longitud++;
                }

                case 3 -> {
                    System.out.println("-MOSTARNDO LISTA 1");
                    listas.MostrarLista();
                    System.out.println("-MOSTARNDO LISTA 2");
                    listas2.MostrarLista();

                    Nodo actual1 = listas.inicio;
                    Nodo actual2 = listas2.inicio;

                    while (actual1 != null || actual2 != null) {
                        if (actual1 != null && (actual2 == null || actual1.dato < actual2.dato)) {
                            listas3.AgregarAlFinal(actual1.dato);
                            actual1 = actual1.siguinte;
                        } else if (actual2 != null) {
                            listas3.AgregarAlFinal(actual2.dato);
                            actual2 = actual2.siguinte;
                        }
                    }

                    System.out.println("-MOSTRADO LISTA 3 (ORDENADA)");
                    listas3.MostrarLista();
                }

            }

        } while (op != 4);
        System.out.println("fin del programa");
    }

}
