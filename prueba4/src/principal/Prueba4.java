package principal;

import servicio.SumaServicio;
import entidad.Suma;
import java.util.Scanner;

public class Prueba4 {

    public static void main(String[] args) {
        SumaServicio miServicio = new SumaServicio();
        Suma miSuma = miServicio.crearSuma();
        Scanner leer = new Scanner(System.in);
        //  Suma miSuma = new Suma();
        System.out.println("Ingrese un numero");
        int numero3 = leer.nextInt();
        // miServicio.crearSuma();
        miServicio.mostrar(numero3, miSuma);
    }

}