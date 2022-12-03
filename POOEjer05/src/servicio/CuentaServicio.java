package servicio;

import entidad.Cuenta;
import java.util.Scanner;

public class CuentaServicio {

    private final Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        Cuenta miCuenta = new Cuenta();
        System.out.println("Ingrese su dni");
        miCuenta.setDni(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta");
        miCuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su Saldo Actual");
        miCuenta.setSaldoActual(leer.nextInt());
        return miCuenta;
    }

    public double ingresar(Cuenta ing) {
        double suma, ingreso;
        System.out.println("----------INGRESO---------- ");
        System.out.println("Ingrese cantidad de dinero ");
        ingreso = leer.nextDouble();
        suma = ingreso + ing.getSaldoActual();
        System.out.println("Su total queda en: " + suma);
        ing.setSaldoActual((int) suma);
        return suma;
    }

    public double retirar(Cuenta ret) {
        double resta, retiro;
        System.out.println("----------RETIRO---------- ");
        System.out.println("Ingrese cantidad de dinero a retirar ");
        retiro = leer.nextDouble();
        resta = 0;
        if (retiro < ret.getSaldoActual()) {
            resta = retiro - ret.getSaldoActual();
        } else {
            resta = retiro - ret.getSaldoActual();
            ret.setSaldoActual(0);
            System.out.println("La cantidad que quiere retirar es mayor a la actual, se retiro: " + ret.getSaldoActual());
        }
        return resta;
    }

    public double extraccionRapida(Cuenta ext) {
        double porcentaje, resta;
        porcentaje = (ext.getSaldoActual() * 20) / 100;
        resta = ext.getSaldoActual() - porcentaje;
        ext.setSaldoActual((int) resta);
        System.out.println("---------- EXTRACCION RAPIDA ---------- ");
        ext.setSaldoActual((int) resta);
        System.out.println("Se extrajo: " + porcentaje);
        System.out.println("Su saldo actual es: " + ext.getSaldoActual());
        return resta;
    }

}