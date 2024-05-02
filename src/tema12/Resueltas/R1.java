package tema12.Resueltas;

import java.util.Arrays;

public class R1 {
    public static void main(String[] args) {
        String[] cadenas = {};
        System.out.println(Arrays.toString(cadenas));
        cadenas = aniadir("Hola", cadenas);
        cadenas = aniadir("Adiós", cadenas);
        System.out.println(Arrays.toString(cadenas));

    }

    public static <E> E[] aniadir(E elemento, E[] tabla) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = elemento;
        return tabla;
    }
}
