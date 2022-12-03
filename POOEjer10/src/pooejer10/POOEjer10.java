package pooejer10;

import entidad.Arreglo;
import servicio.ArregloServicio;

public class POOEjer10 {

    public static void main(String[] args) {
        ArregloServicio miServicio = new ArregloServicio();
        Arreglo miArreglo2 = miServicio.crearArregloA();
        miServicio.crearArregloA();
        miServicio.ordenar(miArreglo2);
        miServicio.crearArregloB(miArreglo2);
    }

}