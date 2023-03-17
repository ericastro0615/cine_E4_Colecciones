package comparators;

import entidad.PeliculaClass;

import java.util.Comparator;

public class ComparatorClass {
   public static Comparator <PeliculaClass> pelisDuracionAsc = new Comparator<PeliculaClass> () {
        @Override
        public int compare(PeliculaClass o1, PeliculaClass o2) {

            return Double.compare ( o1.getDuracion (),o2.getDuracion () );
        }
    };

   public static Comparator <PeliculaClass> pelisDuracionDesc = new Comparator<PeliculaClass> () {
       @Override
       public int compare(PeliculaClass o2, PeliculaClass o1) {
           return Double.compare ( o1.getDuracion (),o2.getDuracion () );
       }
   };

   public static Comparator <PeliculaClass> pelisTitulosAlf = new Comparator<PeliculaClass> () {
       @Override
       public int compare(PeliculaClass o1, PeliculaClass o2) {
           return (o1.getTitulo ().compareToIgnoreCase ( o2.getTitulo () ));
       }
   };



    public static Comparator <PeliculaClass> pelisDirectorAlfAsc = new Comparator<PeliculaClass> () {
        @Override
        public int compare(PeliculaClass o1, PeliculaClass o2) {
            return (o1.getDirector ().compareToIgnoreCase (o2.getDirector ()  ) );
        }
    };





}
