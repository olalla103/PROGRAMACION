package tema12.Resueltas.R16;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ppal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Academico> mapa = new TreeMap<>();
        Academico academico;
        String nombre, fechaIngreso;
        char letra;


        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca el nombre:");
            nombre = sc.next();
            System.out.println("Introduzca su fecha de ingreso:");
            fechaIngreso = sc.next();
            System.out.println("Introduzca la letra:");
            letra = sc.next().charAt(0);
            academico = new Academico(nombre, fechaIngreso);
            nuevoAcademico(mapa, academico, letra);
        }


        // LISTADO SIN LETRA
        Collection<Academico> sinLetra = mapa.values();
        List<Academico> listaSinLetra = new ArrayList<>(sinLetra);
        Collections.sort(listaSinLetra);
        System.out.println("Con nombre sin letra: \n" + listaSinLetra);

        // LISTADO POR ORDEN DE NOMBRE
        

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
