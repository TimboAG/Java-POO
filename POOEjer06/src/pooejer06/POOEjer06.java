package pooejer06;

import entidad.Cafetera;
import servicio.ServicioCafetera;
import java.util.Scanner;

public class POOEjer06 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ServicioCafetera miServicio = new ServicioCafetera();
        Cafetera miCafetera = miServicio.llenarCafetera();
        int opc;
        opc = 0;
        do {
            System.out.println("------------ MENU ------------");
            System.out.println("1- servirTaza");
            System.out.println("2- vaciarCafetera");
            System.out.println("3- agregarCafe");
            System.out.println("4- Ver cantidad de cafe en la cafetera");
            System.out.println("5- Salir");
            System.out.println("Elija una opcion: ");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    miServicio.servirTaza(miCafetera);
                    break;
                case 2:
                    miServicio.vaciarCafetera(miCafetera);
                    break;
                case 3:
                    miServicio.agregarCafe(miCafetera);
                    break;
                case 4:
                    miServicio.cantidadDeCafe(miCafetera);
                    break;
                default:
                    System.out.println("Elijio la opcion Salir o ingreso un numero no valido");
            }
        } while (opc != 5);
    }

}