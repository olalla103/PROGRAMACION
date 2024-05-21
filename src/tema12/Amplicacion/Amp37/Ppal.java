package tema12.Amplicacion.Amp37;

import java.util.*;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Jugador> plantilla = new TreeMap<>();
        int dorsal, op;
        do {
            System.out.println("1.Alta\n2.Baja\n3.Listar\n4.Listar por posición"
                    + "\n5.Editar\n6.Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduzca el dorsal:");
                    dorsal = sc.nextInt();
                    altaJugador(plantilla, dorsal);
                    break;

                case 2:
                    System.out.println("Introduzca el dorsal:");
                    dorsal = sc.nextInt();
                    eliminaJugador(plantilla, dorsal);
                    break;
                case 3:
                    mostrar(plantilla);
                    break;

                case 4:
                    System.out.println("Introduzca la posición:");
                    String pos = sc.next().toUpperCase();
                    Posiciones posiciones = Posiciones.valueOf(pos);
                    muestraPos(plantilla, posiciones);
                    break;

                case 5:
                    System.out.println("Introduzca el dorsal:");
                    dorsal = sc.nextInt();
                    editarJugador(plantilla, dorsal);
                    break;
            }
        } while (op != 6);


    }

    public static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        if (!esta(plantilla, dorsal)) {
            Scanner sc = new Scanner(System.in); // clave del mapa
            String dni, nombre, pos;
            Posiciones posicion;
            double estatura;
            System.out.println("Introduzca el dni:");
            dni = sc.next();
            System.out.println("Introduzca el nombre");
            nombre = sc.next();
            System.out.println("Introduzca la posición:");
            pos = sc.next().toUpperCase();
            posicion = Posiciones.valueOf(pos);
            System.out.println("Introduzca la estatura:");
            estatura = sc.nextDouble();
            plantilla.put(dorsal, new Jugador(dorsal, dni, nombre, estatura, posicion));
        } else {
            System.out.println("Ese dorsal ya se encuentra en la plantilla.");
        }
    }

    public static void eliminaJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        Jugador jugadorEl = plantilla.get(dorsal);
        plantilla.remove(dorsal);
        System.out.println("El jugador eliminado: " + jugadorEl.toString());
    }

    public static void mostrar(Map<Integer, Jugador> plantilla) {
        System.out.println(plantilla);
    }

    public static void muestraPos(Map<Integer, Jugador> plantilla, Posiciones posicion) {
        for (Map.Entry<Integer, Jugador> entry : plantilla.entrySet()) {
            if (entry.getValue().getPosicion().equals(posicion)) {
                System.out.println(entry + " ");
            }
        }
    }

    public static void editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {
        // modifica los datos de un jugador excepto su dorsal y su dni
        // devuelve true si el dorsal exsite y false si no
        if (esta(plantilla, dorsal)) {
            String dni = plantilla.get(dorsal).getDni();
            Scanner sc = new Scanner(System.in); // clave del mapa
            String nombre, pos;
            Posiciones posiciones;
            double estatura;
            System.out.println("Introduzca el nombre");
            nombre = sc.next();
            System.out.println("Introduzca la posición:");
            pos = sc.next().toUpperCase();
            posiciones = Posiciones.valueOf(pos);
            System.out.println("Introduzca la estatura:");
            estatura = sc.nextDouble();
            plantilla.put(dorsal, new Jugador(dorsal, dni, nombre, estatura, posiciones));
        } else {
            System.out.println("Ese dorsal no existe");
        }
    }

    public static boolean esta(Map<Integer, Jugador> plantilla, Integer dorsal) {
        return plantilla.containsKey(dorsal);
    }
}
