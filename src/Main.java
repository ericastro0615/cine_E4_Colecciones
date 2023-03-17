
import comparators.ComparatorClass;
import entidad.PeliculaClass;
import service.ServicePelicula;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ServicePelicula sp = new ServicePelicula ();

        ArrayList <PeliculaClass> listaDePelis = sp.crearFilmMetodoArray ();
        sp.mostrarPelis (  listaDePelis);
        sp.directorAlf ( listaDePelis );

    }
}