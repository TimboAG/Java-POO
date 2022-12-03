package pooejer09;

import java.util.Scanner;
import entidad.Matematica;
import servicio.MatematicaServicio;

public class POOEjer09 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        MatematicaServicio miNum = new MatematicaServicio();
        Matematica miNumeros = new Matematica();
        System.out.println("Ingrese un numero");
        miNumeros.setNum1(leer.nextDouble());
        System.out.println("Ingrese otro numero");
        miNumeros.setNum2(leer.nextDouble());
        System.out.println("--------------------------------");
        miNum.devolverMayor(miNumeros, miNumeros);
        System.out.println("--------------------------------");
        miNum.calcularPotencia(miNumeros, miNumeros);
        System.out.println("--------------------------------");
        miNum.calculaRaiz(miNumeros, miNumeros);
    }

}