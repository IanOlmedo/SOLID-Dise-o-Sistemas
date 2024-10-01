package org.example.SingleResposibility;


import org.example.InterfaceSegregation.Libro_true;

public class GestionPrestamos {
    public void prestarLibro(String titulo, String usuario, org.example.SingleResposibility.Biblioteca_true biblioteca) {
        for (Libro_true libro : biblioteca.getLibros()) {
            if (libro.getTitulo().equals(titulo) && libro.verificarDisponibilidad()) {
                libro.prestarLibro();
                System.out.println("Libro prestado a " + usuario);
                return;
            }
        }
        System.out.println("El libro no está disponible");
    }
}