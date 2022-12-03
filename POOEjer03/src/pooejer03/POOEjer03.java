package pooejer03;

import entidad.Operacion;
import servicio.ServicioOperacion;

public class POOEjer03 {

    public static void main(String[] args) {
        ServicioOperacion crearO = new ServicioOperacion();
        Operacion crearOpe = crearO.crearOperacion();
        crearO.sumar(crearOpe);
        crearO.restar(crearOpe);
        crearO.multiplicar(crearOpe);
        crearO.dividir(crearOpe);
    }
}