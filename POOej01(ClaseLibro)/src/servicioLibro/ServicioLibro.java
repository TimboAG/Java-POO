package servicioLibro;

import entidad.Libro;
import java.util.Scanner;

public class ServicioLibro {

    public Libro crearLibro() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro datosL1 = new Libro();
        System.out.println("Ingrese el ISBN del libro");
        datosL1.setISBN(leer.next());
        System.out.println("Ingrese el titulo del libro");
        datosL1.setTitulo(leer.next());
        System.out.println("Ingrese el autor del libro");
        datosL1.setAutor(leer.next());
        System.out.println("Ingrese la cantidad de paginas del libro");
        datosL1.setNumPags(leer.nextInt());
        return datosL1;
    }

    public void mostrarLibro(Libro libro) {
        System.out.print(libro);
    }
}