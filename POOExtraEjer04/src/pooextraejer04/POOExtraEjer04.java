package pooextraejer04;

import entidad.NIF;
import servicio.NIFServicio;

public class POOExtraEjer04 {

    public static void main(String[] args) {
        NIFServicio miServicio = new NIFServicio();
        NIF miNIF = miServicio.crearNif();
        miServicio.letra(miNIF);
        miServicio.mostrar(miNIF);
    }
}