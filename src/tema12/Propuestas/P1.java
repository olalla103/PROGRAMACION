package tema12.Propuestas;

import java.util.Arrays;

public class P1<E> {
    public static void main(String[] args) {
        Integer[] tablaN = {1, 2, 3, 4};
        Integer[] tablaL = {6, 7, 8, 9};
        Integer[] tabla = juntaTablas(tablaL, tablaN);
        System.out.println(Arrays.toString(tabla));
    }

    public static <E> E[] juntaTablas(E[] t1, E[] t2) {
        E[] tablaFinal = Arrays.copyOf(t1, t1.length + t2.length);
        for (int i = 0; i < t1.length - 1; i++) {
            tablaFinal[i] = t1[i];
        }

        for (int i = 0; i < t2.length; i++) {
            tablaFinal[t1.length + i] = t2[i];
        }

        return tablaFinal;
    }
}
