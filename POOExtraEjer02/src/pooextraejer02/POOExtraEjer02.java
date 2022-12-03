package pooextraejer02;

import entidad.Punto;
import servicio.PuntoServicio;

public class POOExtraEjer02 {

    public static void main(String[] args) {
        PuntoServicio miServicio = new PuntoServicio();
        Punto miPunto = miServicio.crearPuntos();
        miServicio.calcularDistancia(miPunto);
        miServicio.mostrar(miPunto);
    }

}