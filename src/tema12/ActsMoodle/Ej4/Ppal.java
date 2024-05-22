package tema12.ActsMoodle.Ej4;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estudent estudent;
        Map<Integer, Estudent> mapa = new TreeMap<>();
        String nombre, carrera;
        int edad, numID, op;
        double promedio;

        do {
            System.out.println("""
                    Introduzca la opción que desea realizar:                    
                    1. Agregar Estudiante: Permitir al usuario ingresar los datos de un nuevo estudiante y
                    agregarlo al sistema, asignándole un número de identificación único.
                    2. Buscar Estudiante: Permitir al usuario buscar un estudiante por su número de
                    identificación estudiantil y mostrar toda su información.
                    3. Eliminar Estudiante: Permitir al usuario eliminar un estudiante del sistema por su
                    número de identificación estudiantil.
                    4. Actualizar Promedio: Permitir al usuario actualizar el promedio de un estudiante
                    existente en el sistema, dado su número de identificación estudiantil.
                    5. Mostrar mapa por Carrera: Permitir al usuario ingresar el nombre de una
                    carrera y mostrar una lista de todos los mapa inscritos en esa carrera,
                    ordenados alfabéticamente por nombre.
                    6. Mostrar mapa por Promedio: Mostrar una lista de todos los mapa en
                    orden descendente según su promedio.
                    """);
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduzca el nombre:");
                    nombre = sc.next();
                    System.out.println("Introduzca la edad");
                    edad = sc.nextInt();
                    System.out.println("Introduzca la nota media:");
                    promedio = sc.nextDouble();
                    System.out.println("Introduzca la carrera:");
                    carrera = sc.next();
                    estudent = new Estudent(nombre, carrera, edad, promedio);
                    mapa.put(estudent.getNumID(), estudent);
                    break;

                case 2:
                    System.out.println("Introduzca el ID que desea buscar:");
                    numID = sc.nextInt();
                    if (buscar(mapa, numID)) {
                        mapa.get(numID);
                    } else {
                        System.out.println("Ese estudiante no existe.");
                    }
                    break;

                case 3:
                    System.out.println("Introduzca el ID que desea buscar:");
                    numID = sc.nextInt();
                    mapa.remove(numID);
                    break;

                case 4:
                    System.out.println("Introduzca el ID que desea buscar:");
                    numID = sc.nextInt();
                    nombre = mapa.get(numID).getNombre();
                    edad = mapa.get(numID).getEdad();
                    carrera = mapa.get(numID).getCarrera();
                    System.out.println("Introduzca el nuevo promedio:");
                    promedio = sc.nextDouble();
                    mapa.remove(numID);
                    Estudent.setContadorID(-1);
                    mapa.put(numID, new Estudent(nombre, carrera, edad, promedio));
                    break;

                case 5:
                    System.out.println("Introduzca la carrera:");
                    carrera = sc.next();
                    for (Map.Entry<Integer, Estudent> entrada : mapa.entrySet()) {
                        if (entrada.getValue().getCarrera().equals(carrera)) {
                            System.out.println(entrada.getValue());
                        }
                    }
                    break;

                case 6:
                    System.out.println("Introduzca un promedio:");
                    promedio = sc.nextDouble();
                    for (Map.Entry<Integer, Estudent> entrada : mapa.entrySet()) {
                        if (entrada.getValue().getPromedio() == (promedio)) {
                            System.out.println(entrada.getValue());
                        }
                    }
                    break;
            }
        } while (op != 7);
    }

    public static Boolean buscar(Map<Integer, Estudent> estudents, Integer num) {
        return estudents.containsKey(num);
    }
}
