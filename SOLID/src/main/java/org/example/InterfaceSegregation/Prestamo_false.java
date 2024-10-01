package org.example.InterfaceSegregation;

public class Prestamo_false {
    private String titulo;
    private String usuario;
    private String fechaPrestamo;

    public Prestamo_false(String titulo, String usuario, String fechaPrestamo) {
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

    public void renovarPrestamo() {
        // Lógica para renovar préstamo
    }
}
