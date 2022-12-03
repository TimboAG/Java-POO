package pooextraejer03;

import entidad.Raiz;
import servicio.RaizServicio;

public class POOExtraEjer03 {

    public static void main(String[] args) {
        RaizServicio miServicio = new RaizServicio();
        Raiz miRaiz = miServicio.crear();
        miServicio.calcular(miRaiz);
    }
}