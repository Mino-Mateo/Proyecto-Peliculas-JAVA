
public class Peliculas {

    //Atributos
    String tipo;
    int anio;
    String artista;
    String pais;

    public Peliculas(String tipo, String ritmo, int anio, String artista, String pais) {
        //Metodos
        this.tipo = tipo;
        this.anio = anio;
        this.artista = artista;
        this.pais = pais;
    }



    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
