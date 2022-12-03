package pooejer12;

import java.util.Scanner;
import entidad.Persona;
import servicio.PersonaServicio;

public class POOEjer12 {

    public static void main(String[] args) {
        PersonaServicio n = new PersonaServicio();
        Persona m = n.crearPersona();
        n.calcularEdad(m);
        Scanner leer = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("Ingrese una edad");
        int edad = leer.nextInt();
        n.menorQue(edad, m);
        n.mostrarPersona(edad, m);
    }

}