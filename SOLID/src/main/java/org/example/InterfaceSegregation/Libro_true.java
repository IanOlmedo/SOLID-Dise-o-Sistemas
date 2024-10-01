package org.example.InterfaceSegregation;


public class Libro_true {
    private String titulo;
    private String autor;
    private int cantidad;

    public Libro_true(String titulo, String autor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidad = cantidad;
    }

    public boolean verificarDisponibilidad() {
        // Lógica para verificar disponibilidad
        return cantidad > 0;
    }

    public void prestarLibro() {
        // Lógica para prestar libro
        cantidad--;
    }

    public String getTitulo() {
        return titulo;
    }
}

