package tema12.Aplicacion;

import java.util.*;

public class App22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        List<String> lista = new ArrayList<>();

        System.out.println("Introduzca una palabra:");
        palabra = sc.next();
        while (palabra.compareToIgnoreCase("fin") > 0) {
            lista.add(palabra);
            System.out.println("Introduzca una palabra:");
            palabra = sc.next();
        }
        System.out.println(lista);

        Set<String> sinRepetidos = new LinkedHashSet<>(lista);
        System.out.println(sinRepetidos);
    }
}
