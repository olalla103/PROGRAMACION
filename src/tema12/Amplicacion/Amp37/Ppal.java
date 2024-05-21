package tema12.Amplicacion.Amp37;

import java.util.Map;
import java.util.Scanner;

public class Ppal {
    public static void main(String[] args) {

    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Scanner sc = new Scanner(System.in); // clave del mapa
        String dni, nombre;
        Posiciones posicion;
        Double estatura;
        System.out.println("Introduzca el dni:");
        System.out.println("Introduzca el nombre");
        System.out.println("Introduzca la posición:");
        System.out.println("Introduzca la estatura:");
        // añade una entrada al mapa y el jugador se crea dentro del método
    }

    public static boolean eliminaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        // HE CAMBIADO DE JUGADOR A BOOLEAN PARA QUE NO ME DE ERROR
        // elimina un jugador dependiendo de el dorsal que se pase, el método devuelve el jugador eliminado
        return false;
    }

    public static void mostrar(Map<Integer, Jugador> plantilla) {
        // muestra el mapa
    }

    public static void muestraPos(Map<Integer, Jugador> plantilla, String posicion) {
        // muestra una lista de aquellos jugadores que comparten la misma posición
    }

    public static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        // modifica los datos de un jugador excepto su dorsal y su dni
        // devuelve true si el dorsal exsite y false si no
        return true;
    }
}
