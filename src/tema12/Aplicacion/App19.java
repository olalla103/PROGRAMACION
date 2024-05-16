package tema12.Aplicacion;

import java.util.*;

public class App19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        String[] tablaP;
        String palabra;

        System.out.println("Introduzca una frase:");
        palabra = sc.nextLine();
        tablaP = palabra.split(" ");

        palabras = Arrays.asList(tablaP);
        Set<String> noRepetidas = new TreeSet<>(palabras);
        System.out.println("Sin palabras repetidas: " + noRepetidas);

        System.out.println("Palabras repetidas:");
        for (String palabraUnica : noRepetidas) {
            int frecuencia = Collections.frequency(palabras, palabraUnica);
            if (frecuencia > 1) {
                System.out.print(palabraUnica + "  ");
            }
        }

    }
}
