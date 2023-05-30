/*
 * Dada la temática: Películas, implementar un proyecto con al menos 12
 * peliculas.
 * 
 * El proyecto debe ser implementado por máximo 3 personas.
 * 
 * Uno de los integrantes debe crear el proyecto y los demás deben clonar el
 * proyecto.
 * 
 * Cada uno debe crear 3 instancias de la clase Peliculas y deben hacer los push
 * respectivos para que se note su aporte.
 */
import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Peliculas rock = new Peliculas("rock",
                "120bpm",
                1990,
                "Three grace days",
                "Canada");

        Peliculas metal = new Peliculas("Metal",
                "120bpm",
                1990,
                "Marilyn Manson",
                "USA");

        Peliculas jazz = new Peliculas("Jazz",
                "70bpm",
                1950,
                "Eric",
                "USA");

        Peliculas pop = new Peliculas("Pop",
                "100bpm",
                1980,
                "Michael Jackson",
                "USA");



        System.out.println("Llena los datos de tu género favorito: ");
        System.out.println("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.println("Ritmo: ");
        String ritmo = scanner.nextLine();
        System.out.println("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el búfer
        System.out.println("País: ");
        String pais = scanner.nextLine();
        System.out.println("Artista: ");
        String artista = scanner.nextLine();

        Peliculas favorito = new Peliculas(tipo, ritmo, anio, artista, pais);

        System.out.println("Datos de tu género favorito:");
        System.out.println(favorito.tipo);
        System.out.println(favorito.getAnio());
        System.out.println(favorito.getPais());
        System.out.println(favorito.getArtista());
    }
}

