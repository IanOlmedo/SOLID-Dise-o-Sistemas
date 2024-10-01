package org.example.InterfaceSegregation;

public class Prestamo_true {
    private String titulo;
    private String usuario;
    private String fechaPrestamo;

    public Prestamo_true(String titulo, String usuario, String fechaPrestamo) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
    }

    public void verificarDisponibilidad() {
        // Lógica para verificar disponibilidad
    }

    public void devolverLibro() {
        // Lógica para devolver libro
    }
}
