package tema12.ActsMoodle.Ej3;

import java.io.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Estudiante> mapa = new TreeMap<>();
        Set<Estudiante> setEstudiantes = new TreeSet<>();

        // datos de estudiantes
        Estudiante e1 = new Estudiante("Olalla", 20, 7.0);
        Estudiante e2 = new Estudiante("Javier", 22, 8.5);
        Estudiante e3 = new Estudiante("Mariana", 19, 6.3);

        // escribo en el fichero los objetos
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            escribe.writeObject(e1);
            escribe.writeObject(e2);
            escribe.writeObject(e3);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // leo del fichero los objetos
        try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("estudiantes.dat"))) {
            // leo 3 veces porque hay tres objetos
            for (int i = 0; i < 3; i++) {
                Estudiante estudiante = (Estudiante) lee.readObject();
                setEstudiantes.add(estudiante);
                mapa.put(estudiante.getNombre(), estudiante);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("TreeSet estudiantes: " + setEstudiantes + "\nMapa estudiantes: " + mapa);

        // Búsqueda de estudiante
        System.out.println("Introduzca el nombre del estudiante que desea buscar:");
        String nombre = sc.next();
        System.out.println(mapa.get(nombre));

        // Añadir estudiante
        System.out.println("Introduzca el nombre del nuevo estudiante:");
        nombre = sc.next();
        System.out.println("Introduzca la edad del nuevo estudiante:");
        int edad = sc.nextInt();
        System.out.println("Introduzca la nota media del nuevo estudiante:");
        double notasProm = sc.nextDouble();
        // añado al treeSet y al map
        setEstudiantes.add(new Estudiante(nombre, edad, notasProm));
        mapa.put(nombre, new Estudiante(nombre, edad, notasProm));
        System.out.println("Lista: " + setEstudiantes + "\nMapa: " + mapa);

        // Eliminar estudiante
        System.out.println("Introduzca el nombre del estudiante que quieres eliminar:");
        nombre = sc.next();
        mapa.remove(nombre);
        setEstudiantes.remove(new Estudiante(nombre));
        System.out.println("Lista: " + setEstudiantes + "\nMapa: " + mapa);

        // vuelvo a escribir en el fichero
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("estudiantes.dat"))) {
            escribe.writeObject(setEstudiantes);
            escribe.writeObject(mapa);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
