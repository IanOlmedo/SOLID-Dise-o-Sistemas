package org.example.InterfaceSegregation;

public class Libro_false {
    private String titulo;
    private String autor;
    private int cantidad;

    public Libro_false(String titulo, String autor, int cantidad) {
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

