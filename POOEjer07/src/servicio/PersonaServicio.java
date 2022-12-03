package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private final Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {
        Persona unaPersona = new Persona();
        String sexo;
        System.out.println("Ingrese su nombre");
        unaPersona.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        unaPersona.setEdad(leer.nextInt());
        System.out.println("Ingrese su Sexo: H (hombre), M (Mujer), O (otro) Elija la letra que le corresponda");
        sexo = leer.next();
        switch (sexo.toUpperCase()) {
            case "H":
                unaPersona.setSexo("H");
                break;           
            case "M":
                unaPersona.setSexo("M");
                break;           
            case "O":
                unaPersona.setSexo("O");
                break;           
            default:
                System.out.println("Sexo ingresado no valido, se le colocara como predefinido O (otro)");
                unaPersona.setSexo("O");
                break;
        }
        System.out.println("Ingrese su peso");
        unaPersona.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura (separando los metros por coma ej: 1,90)");
        unaPersona.setAltura(leer.nextDouble());
        return unaPersona;
    }

    public double calcularIMC(Persona p) {
        double ideal;
        double valor;
        ideal = (p.getPeso() / (Math.pow(p.getAltura(), 2)));
        valor = 0;
        if (ideal < 20) {
            valor = -1;
            System.out.println("Usted esta por debajo de su valor ideal:  " + valor);
        } else if (ideal >= 20 && ideal <= 25) {
            valor = 0;
            System.out.println("Usted esta en su valor ideal: " + valor);

        } else if (ideal > 25) {
            valor = 1;
            System.out.println("Usted esta por arriba de su valor ideal: " + valor);
        }
        return valor;
    }

    public boolean esMayorDeEdad(Persona p) {
        boolean esOno = true;
        if (p.getEdad() > 18) {
            System.out.println("Es mayor de edad: " + esOno);
            esOno = true;
        } else {
            System.out.println("Es menor de edad: " + esOno);
            esOno = false;
        }
        return esOno;
    }

    public void informacion(Persona p) {
        System.out.println("Su nombre es: " + p.getNombre());
        System.out.println("Su edad es: " + p.getEdad());
        System.out.println("Su sexo es: " + p.getSexo());
        System.out.println("Su altura es: " + p.getAltura());
        System.out.println("Su peso es: " + p.getPeso());
    }

}