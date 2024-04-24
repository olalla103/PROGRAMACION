package tema11.packMoodle1;

import java.io.*;

public class Ppal {


    public static void main(String[] args) {
        // ME QUEDO HACIENDO LOS CONTADORES DE NOTAS POR ALUMNO
        // ESCRIBO FICHEROS PARA EMPEZAR LA ACTIVIDAD
        int suspensos = 0, aprobados = 0, bien = 0, notables = 0, sobresalientes = 0;
        Asignatura[] asignaturas = new Asignatura[7];
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("asignatura.dat"))) {
            asignaturas[0] = new Asignatura("Programacion", 1);
            asignaturas[1] = new Asignatura("Base de datos", 2);
            asignaturas[2] = new Asignatura("Lenguaje de marcas", 3);
            asignaturas[3] = new Asignatura("FOL", 4);
            asignaturas[4] = new Asignatura("Sistemas informaticos", 5);
            asignaturas[5] = new Asignatura("Sistemas de gestion", 6);
            asignaturas[6] = new Asignatura("Moviles", 7);
            escribe.writeObject(asignaturas);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // TABLAS DE NOTAS DE LOS ALUMNOS
        Pares[] tablaNotasO = new Pares[5];
        tablaNotasO[0] = new Pares(0, 6.0);
        tablaNotasO[1] = new Pares(4, 8.0);
        tablaNotasO[2] = new Pares(1, 7.5);
        tablaNotasO[3] = new Pares(3, 5.0);
        tablaNotasO[4] = new Pares(6, 6.0);

        Pares[] tablaNotasC = new Pares[5];
        tablaNotasO[0] = new Pares(0, 7.0);
        tablaNotasO[1] = new Pares(6, 5.0);
        tablaNotasO[2] = new Pares(1, 8.5);
        tablaNotasO[3] = new Pares(3, 9.0);
        tablaNotasO[4] = new Pares(6, 6.0);

        Pares[] tablaNotasP = new Pares[5];
        tablaNotasO[0] = new Pares(0, 5.0);
        tablaNotasO[1] = new Pares(6, 10.0);
        tablaNotasO[2] = new Pares(1, 7.5);
        tablaNotasO[3] = new Pares(3, 7.0);
        tablaNotasO[4] = new Pares(7, 9.0);

        Pares[] tablaNotasI = new Pares[5];
        tablaNotasO[0] = new Pares(0, 6.5);
        tablaNotasO[1] = new Pares(4, 7.0);
        tablaNotasO[2] = new Pares(1, 6.5);
        tablaNotasO[3] = new Pares(3, 4.0);
        tablaNotasO[4] = new Pares(5, 5.0);


        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
            Alumno[] alumnos = new Alumno[10];
            alumnos[0] = new Alumno("78104491X", "Olalla", tablaNotasO);
            alumnos[1] = new Alumno("11111111A", "Carmen", tablaNotasC);
            alumnos[2] = new Alumno("22222222B", "Pablo", tablaNotasP);
            alumnos[3] = new Alumno("33333333C", "Inés", tablaNotasI);
            escribe.writeObject(alumnos);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // CONTAMOS NOTAS POR ALUMNO
        for (int i = 0; i < tablaNotasO.length; i++) {
            if (tablaNotasO[i].getCalificacion() < 5) {
                suspensos++;
            } else if (tablaNotasO[i].getCalificacion() == 5) {
                suspensos++;
            } else if (tablaNotasO[i].getCalificacion() < 5) {
                suspensos++;
            } else if (tablaNotasO[i].getCalificacion() < 5) {
                suspensos++;
            }
        }

        System.out.println("Listado: Resumen de calificaciones por asignatura:");

        System.out.println("Nombre asignatura\tSus\tAprb\tBien\tNot\tSob");


    }


}
