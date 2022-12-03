package servicio;

import entidad.Cancion;
import java.util.Scanner;

public class CancionServicio {

    public Cancion crearCancion() {
        Cancion miCancion = new Cancion();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una cancion");
        miCancion.setTitulo(leer.next());
        System.out.println("Ingrese el autor");
        miCancion.setAutor(leer.next());
        return miCancion;
    }

    public void mostrar(Cancion c) {
        System.out.println("***************** ");
        System.out.println("La cancion ingresada es: " + c.getTitulo() + " de " + c.getAutor());
    }

}