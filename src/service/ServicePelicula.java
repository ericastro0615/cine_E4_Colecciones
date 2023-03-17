package service;

/*

Después de ese bucle realizaremos las siguientes acciones:22

• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */


import comparators.ComparatorClass;
import entidad.PeliculaClass;

import java.util.*;

public class ServicePelicula {
    Scanner sc = new Scanner ( System.in ).useDelimiter ( "\n" );

    //crear array para guardar los objetos
    public ArrayList<PeliculaClass> crearFilmMetodoArray () {
        //creo array
        ArrayList <PeliculaClass> listaDePelis = new ArrayList<> ();
        //inicializo
        PeliculaClass peliObj = new PeliculaClass ();
        do {
            System.out.println ("ingrese el nombre de la pelicula ");
            peliObj.setTitulo ( sc.next () );
            System.out.println ("Ingrese el nombre del director");
            peliObj.setDirector ( sc.next  () );
            System.out.println ("ingrese la duración de la pelicula (en hrs, utilizando comas , ) ");
            peliObj.setDuracion ( sc.nextDouble () );
            listaDePelis.add ( peliObj );
            System.out.println ("Desea agregar una nueva pelicula? si / no");

        } while (sc.next ().equalsIgnoreCase ( "si" )? true: false);

        mostrarPelis ( listaDePelis );
        System.out.printf ("el tamano es", listaDePelis.size ());
        return listaDePelis;

    }

    public void mostrarPelis (ArrayList<PeliculaClass> listaPelis) {
        for (PeliculaClass aux: listaPelis ) {
            System.out.print (aux);
        }

    }


    public void directorAlf (ArrayList <PeliculaClass> listaPelis) {
        Collections.sort (listaPelis, ComparatorClass.pelisDirectorAlfAsc);
        System.out.println ("\n\nLISTA DE PELICULAS ORDEN ALFABETICAMENTE - DIRECTOR");
        for (PeliculaClass aux: listaPelis ) {
            System.out.println (aux);
        }
    }

    public void titulosAlf (ArrayList <PeliculaClass> listaPelis ) {
        Collections.sort ( listaPelis,   ComparatorClass.pelisTitulosAlf );
        System.out.println ("\n\nLISTA DE PELICULAS ORDENADAS ALFABETICAMENTE - TITULO");
        for (PeliculaClass aux : listaPelis) {
            System.out.println (aux);
        }
    }

    public  void duracionPeli (ArrayList <PeliculaClass> listaPelis  ) {
        Collections.sort ( listaPelis, ComparatorClass.pelisDuracionAsc );
        System.out.println ("\n\n LISTA DE PELICULAS CON DURACION ASCENDENTE");
            mostrarPelis ( listaPelis );
        }

        /*

        public  String menuLista (ArrayList <PeliculaClass> listaPelis, ComparatorClass cp  ) {
        duracionPeli ( listaPelis, cp );
       titulosAlf ( listaPelis, cp );
       directorAlf ( listaPelis, cp );
       directorAlf ( listaPelis, cp );
        return menuLista ( listaPelis, cp ).toString ();
        }
         */



    }












