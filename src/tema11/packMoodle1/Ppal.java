package tema11.packMoodle1;

import java.io.*;

public class Ppal {

    public static void main(String[] args) {
        // ESCRIBO FICHEROS PARA EMPEZAR LA ACTIVIDAD
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
        tablaNotasC[0] = new Pares(0, 7.0);
        tablaNotasC[1] = new Pares(6, 5.0);
        tablaNotasC[2] = new Pares(1, 8.5);
        tablaNotasC[3] = new Pares(3, 9.0);
        tablaNotasC[4] = new Pares(6, 6.0);

        Pares[] tablaNotasP = new Pares[5];
        tablaNotasP[0] = new Pares(0, 5.0);
        tablaNotasP[1] = new Pares(6, 10.0);
        tablaNotasP[2] = new Pares(1, 7.5);
        tablaNotasP[3] = new Pares(3, 7.0);
        tablaNotasP[4] = new Pares(7, 9.0);

        Pares[] tablaNotasI = new Pares[5];
        tablaNotasI[0] = new Pares(0, 6.5);
        tablaNotasI[1] = new Pares(4, 7.0);
        tablaNotasI[2] = new Pares(1, 6.5);
        tablaNotasI[3] = new Pares(3, 4.0);
        tablaNotasI[4] = new Pares(5, 5.0);


        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("alumnos.dat"))) {
            Alumno[] alumnos = new Alumno[4];
            alumnos[0] = new Alumno("78104491X", "Olalla", tablaNotasO);
            alumnos[1] = new Alumno("11111111A", "Carmen", tablaNotasC);
            alumnos[2] = new Alumno("22222222B", "Pablo", tablaNotasP);
            alumnos[3] = new Alumno("33333333C", "Inés", tablaNotasI);
            escribe.writeObject(alumnos);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // AHORA LEEMOS LOS ARCHIVOS
        Asignatura[] asignaturasLee = new Asignatura[7];
        Alumno[] alumnosLee = new Alumno[4];

        try (ObjectInputStream lee = new ObjectInputStream(new FileInputStream("asignatura.dat"));
             ObjectInputStream lee2 = new ObjectInputStream(new FileInputStream("alumnos.dat"))) {
            // METO EN LA TABLAS ASIGNATURA LOS DATOS
            asignaturasLee = (Asignatura[]) lee.readObject();

            // METO LOS ALUMNOS EN LA TABLA DE ALUMNOS
            alumnosLee = (Alumno[]) lee.readObject();
        } catch (ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }


        System.out.println("Listado: Resumen de calificaciones por asignatura:");
        cuentaNotas(1, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});
        System.out.println();
        cuentaNotas(2, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});
        System.out.println();
        cuentaNotas(3, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});
        System.out.println();
        cuentaNotas(4, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});
        System.out.println();
        cuentaNotas(5, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});
        System.out.println();
        cuentaNotas(6, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});
        System.out.println();
        cuentaNotas(7, new Pares[][]{tablaNotasO, tablaNotasC, tablaNotasP, tablaNotasI});


    }

    public static void cuentaNotas(int codigo, Pares[][] tablasNotas) {
        int suspensos = 0, aprobados = 0, bien = 0, notables = 0, sobresalientes = 0;
        String asignatura = "";

        // Recorrer todas las tablas de notas
        for (Pares[] tabla : tablasNotas) {
            // Para cada tabla, contar los diferentes tipos de calificaciones de la asignatura específica
            for (Pares pares : tabla) {
                if (pares.getCodigoAsignatura() == codigo) {
                    double calificacion = pares.getCalificacion();
                    if (calificacion < 5) {
                        suspensos++;
                    } else if (calificacion < 6) {
                        aprobados++;
                    } else if (calificacion < 7) {
                        bien++;
                    } else if (calificacion < 9) {
                        notables++;
                    } else {
                        sobresalientes++;
                    }
                }
            }
        }

        // Convertir el código de asignatura a su nombre correspondiente
        switch (codigo) {
            case 1:
                asignatura = "Programación";
                break;
            case 2:
                asignatura = "Base de datos";
                break;
            case 3:
                asignatura = "Lenguaje de Marcas";
                break;
            case 4:
                asignatura = "FOL";
                break;
            case 5:
                asignatura = "Sistemas informáticos";
                break;
            case 6:
                asignatura = "Sistemas de gestión empresarial";
                break;
            case 7:
                asignatura = "Móviles";
                break;
        }

        // Imprimir el resultado
        System.out.println("Resumen de calificaciones para la asignatura de " + asignatura + ":");
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Bien: " + bien);
        System.out.println("Notables: " + notables);
        System.out.println("Sobresalientes: " + sobresalientes);
    }

}
