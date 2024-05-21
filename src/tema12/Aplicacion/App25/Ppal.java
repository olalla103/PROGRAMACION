package tema12.Aplicacion.App25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Club club = new Club();
        Socio3 socio; // clave
        String apodo, nombre, fechaIngreso;
        int op;

        do {
            System.out.println("1.Alta socio\n2.Baja socio\n3.Modificación Socio\n4.Listar por apodo\n5.Listar por antigüedad"
                    + "\n6.Listar socios por año anterior\n7.Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduce el apodo:");
                    apodo = sc.next();
                    if (!club.compruebaApodo(apodo)) {
                        System.out.println("Introduce el nombre:");
                        nombre = sc.next();
                        System.out.println("Introduce la fecha en formato dd/mm/yyyy");
                        fechaIngreso = sc.next();
                        socio = new Socio3(apodo, nombre, fechaIngreso);
                        club.aniadir(socio);
                    }
                    break;

                case 2:
                    System.out.println("Introduce el apodo:");
                    apodo = sc.next();
                    if (club.compruebaApodo(apodo)) {
                        club.eliminar(apodo);
                    }
                    break;
                case 3:
                    System.out.println("Introduce el apodo:");
                    apodo = sc.next();
                    System.out.println("Introduzca el nuevo nombre:");
                    nombre = sc.next();
                    System.out.println("Introduzca la nueva fecha:");
                    fechaIngreso = sc.next();
                    club.modificarSocio(apodo, nombre, fechaIngreso);
                    break;

                case 4:
                    System.out.println(club);
                    break;

                case 5:
                    // PASO EL MAPA A LISTA PARA ORDENARLO
                    List<Socio3> socioLista = new ArrayList<>(club.mapa.values());
                    Collections.sort(socioLista, new ComparaAntiguo());
                    System.out.println(socioLista);
                    break;

                case 6:
                    System.out.println("Introduce un año:");
                    int anio = sc.nextInt();
                    club.listadoAnio(anio);
                    break;
            }
        } while (op != 7);
    }
}
