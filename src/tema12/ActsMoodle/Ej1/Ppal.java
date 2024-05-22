package tema12.ActsMoodle.Ej1;

import java.io.*;
import java.util.*;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> per = new ArrayList<>();
        String nombre;
        int edad;
        int op;

        // leemos fichero
        try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("act1Moodle.dat"))) {
            per = (List<Persona>) lee.readObject();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        // añadimos al treeSet los valores del arrayList
        Set<Persona> personas = new TreeSet<>(per);

        do {
            System.out.println("""
                    Introduzca la opción que desea realizar:
                    1. Agregar una nueva persona a la lista.
                    2. Eliminar una persona específica de la lista basándose en su nombre.
                    3. Actualizar la edad de una persona específica.
                    4. Mostrar la lista completa de personas.
                    5. Calcular y mostrar la edad promedio de las personas en la lista.
                    6. Salir""");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduzca el nombre:");
                    nombre = sc.next();
                    System.out.println("Introduzca la edad:");
                    edad = sc.nextInt();
                    aniadir(personas, new Persona(nombre, edad));
                    break;

                case 2:
                    System.out.println("Introduzca el nombre:");
                    nombre = sc.next();
                    System.out.println(eliminar(personas, new Persona(nombre)));
                    break;

                case 3:
                    System.out.println("Introduzca el nombre:");
                    nombre = sc.next();
                    System.out.println("Introduzca la edad:");
                    edad = sc.nextInt();
                    editar(personas, new Persona(nombre, edad), nombre, edad);
                    break;

                case 4:
                    System.out.println(personas);
                    break;

                case 5:
                    Persona pers[] = new Persona[personas.size()];
                    int edadProm = 0;
                    personas.toArray(pers);
                    for (Persona persona : pers) {
                        edadProm += persona.getEdad();
                    }
                    edadProm = edadProm / pers.length;
                    System.out.println("La edad promedio es: " + edadProm);
                    break;
            }
        } while (op != 6);

        // paso a List para que no de error en el cast
        per.addAll(personas);
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("act1Moodle.dat"))) {
            escribe.writeObject(per);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // MÉTODOS
    public static void aniadir(Set<Persona> personas, Persona persona) {
        personas.add(persona);
    }

    public static boolean eliminar(Set<Persona> personas, Persona persona) {
        return personas.remove(persona);
    }

    public static void editar(Set<Persona> personas, Persona persona, String nombre, Integer edad) {
        personas.remove(new Persona(nombre, edad));
        personas.add(new Persona(nombre, edad));

    }
}
