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

//Librerias
import java.util.Scanner;

//clase publica menu principal//
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Peliculas
        Peliculas Interestellar = new Peliculas(
                "Interestellar",
                "Accion ",
                2014,
                "Christopher Nolan ",
                "Estados Unidos");

        Peliculas Contratiempo = new Peliculas(
                "Contratiempo",
                "Suspenso",
                2016,
                "Oriol Paulo",
                "España");

        Peliculas Batman = new Peliculas(
                "Batman",
                "Accion",
                2005,
                "Christopher Nolan ",
                "Estados Unidos");

        Peliculas Spiderman = new Peliculas(
                "Spiderman",
                "Accion",
                2002,
                "Sam Raimi",
                "Estados Unidos");

        /*###############################################################################################*/

        Peliculas ElTiempoContigo = new Peliculas(
                "El tiempo contigo",
                "Animacion",
                2019,
                "Makoto Shinkai",
                "Japon");

        Peliculas YourName = new Peliculas(
                "Your Name",
                "Romance",
                2016,
                "Makoto Shinkai",
                "Japon");

        Peliculas ElCodigoDaVinici = new Peliculas(
                "El Codigo Da Vinci",
                "Suspenso",
                2006,
                "Ron Howard",
                "Francia");

        Peliculas DragonBallSuperBroly = new Peliculas(
                "Dragon Ball Super: Broly",
                "Animacion",
                2018,
                "Tatsuya Nagamine",
                "Japon");

        /*###############################################################################################*/

        Peliculas ElExorcista = new Peliculas(
                "El Exorcista",
                "Terror",
                1973,
                "William Peter Blatty",
                "Estados Unidos");

        Peliculas Terrifier2 = new Peliculas(
                "Terrifier 2",
                "Horror",
                2022,
                "Damien Leone",
                "Estados Unidos");

        Peliculas Elpayasodelmal = new Peliculas(
                "El payaso del mal",
                "Horror",
                2014,
                "Jon Watts",
                "Estados Unidos");

        Peliculas It = new Peliculas(
                "It (Eso)",
                "Horror",
                2017,
                "Andrés Muschietti",
                "Estados Unidos");

        /*###############################################################################################*/

        /*###############################################################################################*/

        System.out.println("\n BASE DE DATOS DE PELICULAS");
        System.out.println("\n Seleccion de Peliculas\n");
        System.out.println("\n 1) Interestellar");
        System.out.println("\n 2) Contratiempo");
        System.out.println("\n 3) Batman");
        System.out.println("\n 4) Spiderman");
        System.out.println("\n 5) El tiempo contigo");
        System.out.println("\n 6) Your Name");
        System.out.println("\n 7) El Codigo Da Vinci");
        System.out.println("\n 8) Dragon Ball Super: Broly");
        System.out.println("\n 9) El Exorcista");
        System.out.println("\n 10) Terrifier 2");
        System.out.println("\n 11) El payaso del mal");
        System.out.println("\n 12) It (Eso)");


        Scanner Entrada = new Scanner(System.in);

        System.out.print("Ingrese un número del 1 al 12: ");
        int numero = scanner.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Opción 1 seleccionada.");
                System.out.println(Interestellar.getNombre());
                System.out.println(Interestellar.getAnio());
                System.out.println(Interestellar.getDirector());
                System.out.println(Interestellar.getPais());
                break;
            case 2:
                System.out.println("Opción 2 seleccionada.");
                System.out.println(Contratiempo.getNombre());
                System.out.println(Contratiempo.getAnio());
                System.out.println(Contratiempo.getDirector());
                System.out.println(Contratiempo.getPais());
                break;
            case 3:
                System.out.println("Opción 3 seleccionada.");
                System.out.println(Batman.getNombre());
                System.out.println(Batman.getAnio());
                System.out.println(Batman.getDirector());
                System.out.println(Batman.getPais());

                break;
            case 4:
                System.out.println("Opción 4 seleccionada.");
                System.out.println(Spiderman.getNombre());
                System.out.println(Spiderman.getAnio());
                System.out.println(Spiderman.getDirector());
                System.out.println(Spiderman.getPais());
                break;
            case 5:
                System.out.println("Opción 5 seleccionada.");
                System.out.println(ElTiempoContigo.getNombre());
                System.out.println(ElTiempoContigo.getAnio());
                System.out.println(ElTiempoContigo.getDirector());
                System.out.println(ElTiempoContigo.getPais());
                break;
            case 6:
                System.out.println("Opción 6 seleccionada.");
                System.out.println(YourName.getNombre());
                System.out.println(YourName.getAnio());
                System.out.println(YourName.getDirector());
                System.out.println(YourName.getPais());
                break;
            case 7:
                System.out.println("Opción 7 seleccionada.");
                System.out.println(ElCodigoDaVinici.getNombre());
                System.out.println(ElCodigoDaVinici.getAnio());
                System.out.println(ElCodigoDaVinici.getDirector());
                System.out.println(ElCodigoDaVinici.getPais());
                break;
            case 8:
                System.out.println("Opción 8 seleccionada.");
                System.out.println(DragonBallSuperBroly.getNombre());
                System.out.println(DragonBallSuperBroly.getAnio());
                System.out.println(DragonBallSuperBroly.getDirector());
                System.out.println(DragonBallSuperBroly.getPais());
                break;
            case 9:
                System.out.println("Opción 9 seleccionada.");
                System.out.println(ElExorcista.getNombre());
                System.out.println(ElExorcista.getAnio());
                System.out.println(ElExorcista.getDirector());
                System.out.println(ElExorcista.getPais());
                break;
            case 10:
                System.out.println("Opción 10 seleccionada.");
                System.out.println(Terrifier2.getNombre());
                System.out.println(Terrifier2.getAnio());
                System.out.println(Terrifier2.getDirector());
                System.out.println(Terrifier2.getPais());
                break;
            case 11:
                System.out.println("Opción 11 seleccionada.");
                System.out.println(Elpayasodelmal.getNombre());
                System.out.println(Elpayasodelmal.getAnio());
                System.out.println(Elpayasodelmal.getDirector());
                System.out.println(Elpayasodelmal.getPais());
                break;
            case 12:
                System.out.println("Opción 12 seleccionada.");
                System.out.println(It.getNombre());
                System.out.println(It.getAnio());
                System.out.println(It.getDirector());
                System.out.println(It.getPais());
                break;
            default:
                System.out.println("Número inválido. Debe ingresar un número del 1 al 12.");
                break;
        }


        // Sistema Finalizado 
    }

}


