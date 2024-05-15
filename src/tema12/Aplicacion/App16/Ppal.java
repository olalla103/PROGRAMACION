package tema12.Aplicacion.App16;

import java.util.*;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Socio2> tablaSocios = new TreeSet<>();
        Socio2 socio;
        String dni, nombre, fechAlta;
        int op;

        do {
            System.out.println("1. Alta\n2. Baja\n3. Modificación\n4. Listado por DNI\n5. Listado por antigüedad\n6. Salir");
            System.out.println("Introduzca qué quiere realizar: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduzca el nombre del socio:");
                    nombre = sc.next();
                    System.out.println("Introduzca el DNI:");
                    dni = sc.next();
                    System.out.println("Introduzca la fecha en la que comenzó a ser socio:");
                    fechAlta = sc.next();
                    socio = new Socio2(dni, nombre, fechAlta);
                    tablaSocios.add(socio);
                    break;

                case 2:
                    System.out.println("Introduzca el dni del socio que quiere eliminar:");
                    dni = sc.next();
                    tablaSocios.remove(new Socio2(dni));
                    break;

                case 3:
                    System.out.println("Introduzca el DNI del socio del cual desea cambiar el nombre");
                    dni = sc.next();
                    System.out.println("Introduzca el nuevo nombre:");
                    nombre = sc.next();
                    socio = new Socio2(dni, nombre);
                    tablaSocios.remove(socio);
                    tablaSocios.add(socio);
                    break;

                case 4:
                    ComparaNombres c = new ComparaNombres();
                    List<Socio2> lista = new ArrayList<>(tablaSocios);
                    Collections.sort(lista, c);
                    System.out.println(lista);
                    break;

                case 5:
                    ComparaAntiguo j = new ComparaAntiguo();
                    List<Socio2> listas = new ArrayList<>(tablaSocios);
                    Collections.sort(listas, j);
                    System.out.println(listas);
                    break;

            }
        } while (op != 6);

    }
}
