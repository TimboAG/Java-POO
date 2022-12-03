package servicio;

import entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    private final Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        Rectangulo unRectangulo = new Rectangulo();
        System.out.println("Ingrese la base:");
        unRectangulo.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura:");
        unRectangulo.setAltura(leer.nextDouble());
        return unRectangulo;
    }

    public double superficie(Rectangulo r) {
        double superficie;
        superficie = r.getAltura() * r.getBase();
        System.out.println("La superficie del resctangulo es: " + superficie);
        return superficie;
    }

    public double perimetro(Rectangulo p) {
        double perimetro;
        perimetro = (p.getBase() + p.getAltura()) * 2;
        System.out.println("El perimetro del resctangulo es: " + perimetro);
        return perimetro;
    }

    public void asteriscos(Rectangulo a) {
        for (int i = 0; i < a.getAltura(); i++) {
            for (int j = 0; j < a.getBase(); j++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }
}