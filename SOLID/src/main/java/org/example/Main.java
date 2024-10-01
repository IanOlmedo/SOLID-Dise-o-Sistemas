package org.example;

import org.example.InterfaceSegregation.*;
import org.example.InterfaceSegregation.Prestamo_true;
import org.example.SingleResposibility.Biblioteca_false;
import org.example.SingleResposibility.Biblioteca_true;
import org.example.SingleResposibility.GestionPrestamos;



public class Main {
    public static void main(String[] args) {
        /*Este es el caso sin el principio Single Responsibility, donde la clase "Biblioteca_false"
        tiene 2 responsabilidades: Libros y préstamos
         */
        Biblioteca_false bf1 = new Biblioteca_false("Biblioteca Central", "Calle Principal 123");
        bf1.agregarLibro("Cien años de soledad", "Gabriel García Márquez", 10);
        bf1.prestarLibro("Cien años de soledad", "Juan Pérez");

        /*Aquí tenemos el mismo ejemplo, pero siguiendo el principio de Single Responsibility
        siendo que: "Biblioteca_true" solo se encarga de los libros y "GestionPrestamos" de los préstamos"
         */
        Biblioteca_true bt1 = new Biblioteca_true("Biblioteca Central", "Calle Principal 123");
        bt1.agregarLibro("Cien años de soledad", "Gabriel García Márquez", 10);
        GestionPrestamos gp1 = new GestionPrestamos();
        gp1.prestarLibro("Cien años de soledad", "Juan Pérez", bt1);

        /*-----------------------------------------------------------------------------------*/

        /* El primer caso es donde no se aplica el principio de Interface Segregation haciendo que
        una interfaz general para varías clases. Con esto consigo que "Prestamo_false" tenga un método que no utiliza
         */
        Prestamo_false pf1 = new Prestamo_false("Cien años de soledad", "Juan Pérez", "01/01/2022");
        pf1.verificarDisponibilidad();
        pf1.devolverLibro();
        pf1.renovarPrestamo();

        /* Y ahora es un caso que sí aplicamos el principio, dividiendo la interfaz en 2, de esta forma
        no tenemos métodos innecesarios en ninguna clase
         */
        Prestamo_true pt1 = new Prestamo_true("Cien años de soledad", "Juan Pérez", "01/01/2022");
        pt1.verificarDisponibilidad();
        pt1.devolverLibro();

        /*-----------------------------------------------------------------------------------*/

        /* También podemos tener una clase "Libro_false" que no aplica el principio de Interface Segregation,
        ya que tiene un método que no utiliza
         */
        Libro_false lf1 = new Libro_false("Cien años de soledad", "Gabriel García Márquez", 10);
        lf1.verificarDisponibilidad();
        lf1.prestarLibro();

        /* Y aquí tenemos la misma clase "Libro_true" que sí aplica el principio de Interface Segregation,
        ya que solo tiene el método necesario
         */
        Libro_true lt1 = new Libro_true("Cien años de soledad", "Gabriel García Márquez", 10);
        lt1.verificarDisponibilidad();
    }
}


