package boletin20;

import javax.swing.JOptionPane;

/**
 *
 * @author Jano
 */
public class Libro implements Comparable<Libro> {

    //ATRIBUTOS
    private String titulo;
    private String autor;
    private String isbn;
    private float precio;
    private int unidades;

    //CONSTRUCTORES
    public Libro() {
        this.titulo = JOptionPane.showInputDialog("Introduce título:");
        this.autor = JOptionPane.showInputDialog("Introduce autor:");
        this.isbn = JOptionPane.showInputDialog("Introduce isbn:");
        this.precio = Float.parseFloat(JOptionPane.showInputDialog("Introduce precio:"));
        this.unidades = Integer.parseInt(JOptionPane.showInputDialog("Introduce unidades:"));
    }

    //GETTERS Y SETTERS
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public float getPrecio() {
        return precio;
    }

    public int getUnidades() {
        return unidades;
    }

    //MÉTODOS
    @Override
    public String toString() {
        return "******************************\nTítulo: " + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nPrecio: " + precio + "\nUnidades: " + unidades;
    }

    public int compareTo(Libro l1) {
        Libro libraco = (Libro) l1;

        return this.titulo.compareToIgnoreCase(libraco.titulo);
    }

}
