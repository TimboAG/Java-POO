package pooextraejer01;

import entidad.Cancion;
import servicio.CancionServicio;

public class POOExtraEjer01 {

    public static void main(String[] args) {
        CancionServicio miServicio = new CancionServicio();
        Cancion miCancion = miServicio.crearCancion();
        miServicio.mostrar(miCancion);
    }

}