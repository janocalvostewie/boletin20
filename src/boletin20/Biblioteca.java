package boletin20;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Jano
 */
public class Biblioteca {

    ArrayList<Libro> coleccion = new ArrayList<Libro>();

    //AÑADIR LIBRO A LA COLECCION
    public void insertar() {
        coleccion.add(new Libro());
    }

    //ELIMINAR LIBRO DE LA COLECCIÓN (VENDER)
    public void vender(int k) {
        coleccion.remove(k);
    }

    //Listar todos los libros de la coleccion
    public void listar() {
        Collections.sort(coleccion);
        for (int i = 0; i < coleccion.size(); i++) {
            String resumen = (coleccion.get(i).toString());
            JOptionPane.showMessageDialog(null, resumen);
        }
    }

    //MOSTRAR LIBROS ORDENADOS POR EL CAMPO TÍTULO
    public void consultarTitulo(String titulo) {
        boolean titAfirmative = true;
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                String resumen = (coleccion.get(i).toString());
                JOptionPane.showMessageDialog(null, resumen);
            }
            titAfirmative = false;

        }
        if (titAfirmative == true) {
            JOptionPane.showMessageDialog(null, "El título buscado no esta en la lista");
        }
    }

    //Para dar de baja libros
    public void darBaja() {
        for (int i = 0; i < coleccion.size(); i++) {
            if (coleccion.get(i).getUnidades() == 0) {
                String resumen = ("Se ha dado de baja: \n" + coleccion.get(i).getTitulo() + "\npor falta de ejemplares");
                JOptionPane.showMessageDialog(null, resumen);
                coleccion.remove(i);
            }

        }
    }
//        //Ordenar el listado
//    public void ordenar() {
//        Collections.sort(coleccion);
//    }

    //CREACIón DEL MENÚ
    public void menu() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Qué deseas hacer?\n1. Añadir un libro\n2.Vender un libro\n3.Consultar los libros\n4.Buscar un libro\n5.dar de baja libros agotados"));
        switch (opcion) {
            case 1:
                insertar();
                break;
            case 2:
                vender(Integer.parseInt(JOptionPane.showInputDialog("¿Qué libro deseas vender?\nIntroduce su ID(posición)")));
                break;
            case 3:
                listar();
                break;
            case 4:
                consultarTitulo(JOptionPane.showInputDialog("Introduzca el título"));
                break;
            case 5:
                darBaja();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Eso no es una opción");
                break;

        }
    }
}
