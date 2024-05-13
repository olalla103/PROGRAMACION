package tema12.Propuestas.P5;

import java.util.Comparator;

public class ComparaEdades implements Comparator<Clientes> {

    @Override
    public int compare(Clientes o1, Clientes o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}
