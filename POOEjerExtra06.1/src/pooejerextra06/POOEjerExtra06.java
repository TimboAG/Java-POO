package pooejerextra06;

import servicio.AhorcadoServicio;
import entidad.Ahorcado;
import java.util.Scanner;

public class POOEjerExtra06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AhorcadoServicio miServicio = new AhorcadoServicio();
        Ahorcado miAhorcado = miServicio.crearJuego();
        int cont = miServicio.intentos(miAhorcado);
        do {
            cont = miServicio.intentos(miAhorcado);
            System.out.println("------------------------------");
            String letra;
            System.out.println("Ingrese una letra");
            letra = leer.next();
            miServicio.juego(miAhorcado, letra);
            System.out.println("Hasta elmomento encontro: ");
            miServicio.mostrarPalabraEncontrada(miAhorcado);
        } while ((cont > 1) && (miAhorcado.getConLetras() != miServicio.longitud(miAhorcado)));
        if (miServicio.intentos(miAhorcado) == 0) {
            System.out.println("------------------------------");
            System.out.println("YA NO QUEDAN MAS OPORTUNIDADES!! =( ");
        }
        if (miAhorcado.getConLetras() == miServicio.longitud(miAhorcado)) {
            System.out.println("FELICIDADESS!! HA ENCONTRADO LA PALABRA!! es: ");
            miServicio.mostrarPalabraEncontrada(miAhorcado);
        }
    }
}