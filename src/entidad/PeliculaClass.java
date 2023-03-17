package entidad;

public class PeliculaClass {
    private String titulo;
    private String director;
    private double duracion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
        do {
            if (duracion<0) {
                System.out.println ("reingrese nuevamente la duración");
            }
        }while (duracion<0);
    }

    @Override
    public String toString() {
        return "\n PELICULA  " +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", duracion=" + duracion + '\'' ;
    }
}
