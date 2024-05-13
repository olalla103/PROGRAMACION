package tema12.Propuestas.P5;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Clientes> {
    @Override
    public int compare(Clientes o1, Clientes o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
