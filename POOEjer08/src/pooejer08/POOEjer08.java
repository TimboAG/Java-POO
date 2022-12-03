package pooejer08;

import entidad.Cadena;
import servicio.CadenaServicio;
import java.util.Scanner;

public class POOEjer08 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter(("\n"));
        CadenaServicio miFraseServ = new CadenaServicio();
        Cadena miFrase = new Cadena();
        System.out.println("Ingrese una frase");
        miFrase.setFrase(leer.next());
        int longitud1;
        longitud1 = miFrase.getFrase().length();
        miFrase.setLongitud(longitud1);
        miFraseServ.invertirFrase(miFrase);
        miFraseServ.mostrarVocales(miFrase);
        System.out.println("******************************");
        String letra;
        System.out.println("Ingrese una letra a buscar en la frase");
        letra = leer.next();
        miFraseServ.vecesRepetido(letra, miFrase);
        System.out.println("******************************");
        String frase2;
        System.out.println("Ingrese otra frase ");
        frase2 = leer.next();
        miFraseServ.compararLongitud(frase2, longitud1);
        System.out.println("******************************");
        miFraseServ.unirFrases(frase2, miFrase);
        System.out.println("******************************");
        String letra2;
        System.out.println("Ingrese la letra que quiere reemplazar la letra A en las frases ");
        letra2 = leer.next();
        miFraseServ.reemplazar(letra2, frase2, miFrase);
    }

}