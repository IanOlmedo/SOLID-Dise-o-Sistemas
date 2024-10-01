package org.example.SingleResposibility;


import org.example.InterfaceSegregation.Libro_true;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca_true {
    private String nombre;
    private String direccion;
    private List<Libro_true> libros;

    public Biblioteca_true(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor, int cantidad) {
        Libro_true libro = new Libro_true(titulo, autor, cantidad);
        libros.add(libro);
    }
}