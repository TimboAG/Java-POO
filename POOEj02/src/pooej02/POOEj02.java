package pooej02;

import entidad.Circunferencia;
import servicio2.CircunferenciaServicio;

public class POOEj02 {

    public static void main(String[] args) {
        CircunferenciaServicio circServicio = new CircunferenciaServicio();
        Circunferencia circ = circServicio.crearCirscunferencia();        
        circServicio.perimetro(circ);
        circServicio.area(circ);
    }
}
