package tema12.Resueltas.R11;

import com.sun.source.tree.Tree;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        // CREACIÓN DE VARIABLES
        Scanner sc = new Scanner(System.in);
        Set<Socio> conjuntoSocios = new TreeSet<>();
        Socio socio;
        String dni, nombre, fechAlta;
        int op;

        // LECTURA FICHERO
        try (ObjectInputStream leeFichero = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            conjuntoSocios = (TreeSet<Socio>) leeFichero.readObject();
        } catch (IOException e) {
            System.out.println("Lista de socios vacía.");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

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
                    socio = new Socio(dni, nombre, fechAlta);
                    conjuntoSocios.add(socio);
                    break;

                case 2:
                    System.out.println("Introduzca el dni del socio que quiere eliminar:");
                    dni = sc.next();
                    conjuntoSocios.remove(new Socio(dni));
                    break;

                case 3:
                    System.out.println("Introduzca el DNI del socio del cual desea cambiar el nombre");
                    dni = sc.next();
                    System.out.println("Introduzca el nuevo nombre:");
                    nombre = sc.next();
                    socio = new Socio(dni, nombre);
                    conjuntoSocios.remove(socio);
                    conjuntoSocios.add(socio);
                    break;

                case 4:
                    System.out.println(conjuntoSocios);
                    break;

                case 5:
                    Comparator<Socio> c = new Comparator<Socio>() {
                        @Override
                        public int compare(Socio o1, Socio o2) {
                            return o1.getAntiguedad().compareTo(o2.getAntiguedad());
                        }
                    };
                    Set<Socio> cS = new TreeSet<>(c);
                    cS.addAll(conjuntoSocios);
                    System.out.println(cS);
                    break;

            }
        } while (op != 6);
    }
}