package tema11.packMoodle2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ppal {
    public static void main(String[] args) {
        String linea = "";
        // variables alumno
        String dni, nombre, apellidos, direccion;
        Alumno alumno;
        String nombreA1, nombreA2, nombreA3;
        Integer[] notas1 = new Integer[3];
        Integer[] notas2 = new Integer[3];
        Integer[] notas3 = new Integer[3];
        Asignatura asignatura1, asignatura2, asignatura3;
        // tabla para incluir en el alumno
        Asignatura[] asignaturas = new Asignatura[3];
        // contadores notaMedia
        int contA1 = 0, contA2 = 0, contA3 = 0;

        try (BufferedReader lee = new BufferedReader(new FileReader("src/act2Moodle.txt"))) {
            linea = lee.readLine();
            while (linea != null) {
                String[] tabla = linea.split(",");
                dni = tabla[0];
                nombre = tabla[1];
                apellidos = tabla[2];
                direccion = tabla[3];

                // asignaturas
                nombreA1 = tabla[4];
                notas1[0] = Integer.valueOf(tabla[5]);
                notas1[1] = Integer.valueOf(tabla[6]);
                notas1[2] = Integer.valueOf(tabla[7]);
                contA1 = notas1[0] + notas1[1] + notas1[2];
                asignatura1 = new Asignatura(nombreA1, notas1);

                nombreA2 = tabla[8];
                notas2[0] = Integer.valueOf(tabla[9]);
                notas2[1] = Integer.valueOf(tabla[10]);
                notas2[2] = Integer.valueOf(tabla[11]);
                contA2 = notas2[0] + notas2[1] + notas2[2];
                asignatura2 = new Asignatura(nombreA2, notas2);

                nombreA3 = tabla[12];
                notas3[0] = Integer.valueOf(tabla[13]);
                notas3[1] = Integer.valueOf(tabla[14]);
                notas3[2] = Integer.valueOf(tabla[15]);
                contA3 = notas3[0] + notas3[1] + notas3[2];
                asignatura3 = new Asignatura(nombreA3, notas3);

                // pongo asignaturas para meterlas en el alumno
                asignaturas[0] = asignatura1;
                asignaturas[1] = asignatura2;
                asignaturas[2] = asignatura3;
                alumno = new Alumno(dni, nombre, apellidos, direccion, asignaturas);

                // IMPRESIÓN DEL LISTADO
                System.out.println("DNI\tNOMBRE");
                System.out.println(alumno.getDni() + "\t" + alumno.getNombre());
                System.out.println("NOMBRE ASIGNATURA\tNOTA MEDIA");
                System.out.println(alumno.getAsignaturas()[0].getNombre() + "\t" + contA1 / 3);
                System.out.println(alumno.getAsignaturas()[1].getNombre() + "\t" + contA2 / 3);
                System.out.println(alumno.getAsignaturas()[2].getNombre() + "\t" + contA3 / 3);
                double notaMediaFinal = (double) (contA1 + contA2 + contA3) / 3;
                System.out.println("MEDIA DEL CURSO:\t" + notaMediaFinal +
                        "\n------------------------------------------------------\n");

                contA1 = 0;
                contA2 = 0;
                contA3 = 0;
                linea = lee.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
