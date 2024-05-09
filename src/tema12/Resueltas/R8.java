package tema12.Resueltas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class R8 {
    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();
        Object[] tabla = new Object[0];

        for (int i = 0; i < 20; i++) {
            coleccion.add((int) (Math.random() * 20 + 1));
        }

        tabla = coleccion.toArray();
        System.out.println(Arrays.toString(tabla));
        Arrays.sort(tabla);
        System.out.println(Arrays.toString(tabla));



    }
}
