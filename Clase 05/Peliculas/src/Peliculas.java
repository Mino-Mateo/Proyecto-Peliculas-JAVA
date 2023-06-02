
public class Peliculas {

    //Atributos
    String nombre;
    String genero;
    int anio;
    String director;
    String pais;

    //Setter y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //Metodos
    public Peliculas(String nombre, String genero, int anio, String director, String pais) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.director = director;
        this.pais = pais;
    }


}
