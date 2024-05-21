package tema12.Resueltas.R16;

import java.util.*;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Academico> mapa = new TreeMap<>();
        Academico academico;
        String nombre, fechaIngreso;
        char letra;


        for (int i = 0; i < 4; i++) {
            System.out.println("Introduzca el nombre:");
            nombre = sc.next();
            System.out.println("Introduzca su fecha de ingreso:");
            fechaIngreso = sc.next();
            System.out.println("Introduzca la letra:");
            letra = sc.next().charAt(0);
            academico = new Academico(nombre, fechaIngreso);
            nuevoAcademico(mapa, academico, letra);
        }

        // SIN LETRA
        // ORDENADO POR NOMBRE
        Collection<Academico> sinLetra = mapa.values();
        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);
        Collections.sort(listaSinLetra);
        System.out.println("Con nombre sin letra: \n" + listaSinLetra);

        // ORDENADO POR AÑO DE INGRESO
        List<Academico> lA = new ArrayList<>(sinLetra);
        lA.sort(new ComparaAnioIngreso());
        System.out.println("Listado por año de ingreso:  +" + lA);

        // CON LETRA
        // LISTADO POR ORDEN DE LETRA
        System.out.println(mapa);
    }

    public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
        if (Character.isLetter(letra)) {
            academia.put(letra, nuevo);
            return true;
        } else {
            return false;
        }
    }
}
