package tema12.Resueltas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class R6 {
    public static void main(String[] args) {
        Collection<Integer> coleccion = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            coleccion.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(coleccion);
        // creo un iterador para recorrer la coleccion
        Iterator<Integer> it = coleccion.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i == 5) {
                it.remove();
            }
        }
        System.out.println("Sin 5\n" + coleccion);

    }
}
