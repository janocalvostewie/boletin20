package boletin20;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Boletin20 {

    public static void main(String[] args) {

        Biblioteca b1 = new Biblioteca();

        int contador = 1;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Acceder al menú?\n******************************\n1. Sí\n2.No"));
            if (opcion == 1) {
                b1.menu();
            } else if (opcion == 2) {
                contador = -5;
            } else {
                JOptionPane.showMessageDialog(null, "Eso no es una opción");

            }
        } while (contador > 0);

    }

}
