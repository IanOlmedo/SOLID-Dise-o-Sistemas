package org.example.SingleResposibility;

import org.example.InterfaceSegregation.Libro_false;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca_false {
    private String nombre;
    private String direccion;
    private List<Libro_false> libros;

    public Biblioteca_false() {
    }

    public Biblioteca_false(String nombre, String direccion, List<Libro_false> libros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = libros;
    }

    public Biblioteca_false(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor, int cantidad) {
        Libro_false libro = new Libro_false(titulo, autor, cantidad);
        libros.add(libro);
    }

    public void prestarLibro(String titulo, String usuario) {
        for (Libro_false libro : libros) {
            if (libro.getTitulo().equals(titulo) && libro.verificarDisponibilidad()) {
                libro.prestarLibro();
                System.out.println("Libro prestado a " + usuario);
                return;
            }
        }
        System.out.println("El libro no está disponible");
    }
}