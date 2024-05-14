package tema12.Resueltas;

import java.util.HashSet;
import java.util.Set;

public class R12 {
    public static void main(String[] args) {
        Set<Integer> con1 = new HashSet<>();
        con1.add(1);
        con1.add(2);
        con1.add(3);
        con1.add(4);
        con1.add(5);
        con1.add(10);

        Set<Integer> con2 = new HashSet<>();
        con2.add(10);
        con2.add(7);
        con2.add(8);

        System.out.println(union(con1, con2));
        System.out.println(interseccion(con1, con2));
    }

    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> uniendo = new HashSet<>(conjunto1);
        uniendo.addAll(conjunto2);
        return uniendo;
    }

    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> interseccionando = new HashSet<>(conjunto1);
        interseccionando.retainAll(conjunto2);
        return interseccionando;
    }
}
