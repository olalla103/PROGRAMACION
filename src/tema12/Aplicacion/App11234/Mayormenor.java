package tema12.Aplicacion.App11234;

import java.util.Comparator;

public class Mayormenor<T extends Comparable<T>> implements Comparator<T> {


    @Override
    public int compare(T o1, T o2) {
        return o2.compareTo(o1);
    }
}
