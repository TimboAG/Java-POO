package pruebaa;

import java.util.Scanner;

public class Pruebaa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        int i;
        String asterisco;
        System.out.println("Ingrese el primer valor");
        num1 = leer.nextInt();
        for (i = 1; i <= num1; i++) {
            System.out.print(i);
        }
        System.out.println("");
        for (i = 0; i < num1; i++) {
            asterisco = "*";
            System.out.print(asterisco);
        }

    }

}