package lista_tutorial;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lista_Simple_taller_Grafica {

    public static void main(String[] args) {
        lista listas = new lista();
        lista listas2 = new lista();
        lista listas3 = new lista();

        JFrame frame = new JFrame("Lista Simple Taller");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        JButton button1 = new JButton("Agregar a la lista 1");
        JButton button2 = new JButton("Agregar a la lista 2");
        JButton button3 = new JButton("Mostrar los datos de la lista");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String el = JOptionPane.showInputDialog("Ingrese el elemento a la lista 1:");
                listas.AgregarAlFinal(Integer.parseInt(el));
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String el = JOptionPane.showInputDialog("Ingrese el elemento a la lista 2:");
                listas2.AgregarAlFinal(Integer.parseInt(el));
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listas3.MezclarListas(listas, listas2);
                JOptionPane.showMessageDialog(null, "Mostrando lista 1:\n" + listas.MostrarLista() +
                        "\nMostrando lista 2:\n" + listas2.MostrarLista() +
                        "\nMostrando lista 3 (mezclada):\n" + listas3.MostrarLista());
            }
        });

        JPanel panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        frame.add(panel);

        frame.setVisible(true);
    }
}
