package servicio;

import entidad.Suma;
import java.util.Scanner;

/* LOS CODIGOS COMENTADOS SON PARA EXPLICACION */
public class SumaServicio {

    public Suma crearSuma() {
        Suma miSuma = new Suma();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1");
        // int numero1 = leer.nextInt();
        miSuma.setN1(leer.nextInt());
        System.out.println("Ingrese el numero 2");
        miSuma.setN2(leer.nextInt());
        return miSuma;
    }

    public int Sumar(Suma p) {
        int estaEsLaSuma = 0;
        //estaEsLaSuma= n1 + n2;
        estaEsLaSuma = p.getN1() + p.getN2();
        return estaEsLaSuma;
    }

    public int SumarCon3(int num3, Suma p) {
        int estaEsLaSuma = 0;
        //estaEsLaSuma= n1 + n2;
        estaEsLaSuma = p.getN1() + p.getN2() + num3;
        return estaEsLaSuma;
    }

    public void mostrar(int num3, Suma nombreCualquiera) {
        int miMetodo = Sumar(nombreCualquiera);
        System.out.println("Este es el resultado: " + miMetodo);
        System.out.println("Este es el resultado dde sumar con 3: " + SumarCon3(num3, nombreCualquiera));
    }

}