package servicio2;

import java.util.Scanner;
import entidad.Circunferencia;

public class CircunferenciaServicio {

    private final Scanner leer = new Scanner(System.in);

    public Circunferencia crearCirscunferencia() {
        Circunferencia nuevaCirc = new Circunferencia();
        System.out.println("Ingrese el radio");
        nuevaCirc.setRadio(leer.nextDouble());
        return nuevaCirc;
    }

    public double area(Circunferencia a) {
        double area;
        area = Math.PI * Math.pow(a.getRadio(), 2);
        System.out.println("El area es: " + area);
        return area;
    }

    public double perimetro(Circunferencia r) {
        double perimetro;
        perimetro = 2 * Math.PI * r.getRadio();
        System.out.println("El primetro es: " + perimetro);
        return perimetro;
    }

}
