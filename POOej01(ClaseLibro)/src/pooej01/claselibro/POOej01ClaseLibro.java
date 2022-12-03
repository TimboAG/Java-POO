package pooej01.claselibro;

import entidad.Libro;
import servicioLibro.ServicioLibro;

public class POOej01ClaseLibro {

    public static void main(String[] args) {
        System.out.println("------- INGRESO DE DATOS --------");
        ServicioLibro LibroServ = new ServicioLibro();
        Libro crear = LibroServ.crearLibro();
        System.out.println("------- MOSTRAR DATOS --------");
        LibroServ.mostrarLibro(crear);
    }
}