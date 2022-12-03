package pooejer04;

import entidad.Rectangulo;
import servicio.ServicioRectangulo;

public class POOEjer04 {

    public static void main(String[] args) {

        ServicioRectangulo rectangulo1 = new ServicioRectangulo();
        Rectangulo unRectangulo = rectangulo1.crearRectangulo();
        rectangulo1.perimetro(unRectangulo);
        rectangulo1.superficie(unRectangulo);
        rectangulo1.asteriscos(unRectangulo);

    }

}