package tema12.Aplicacion.App16;

import java.util.Comparator;

public class ComparaNombres implements Comparator<Socio2> {

    @Override
    public int compare(Socio2 o1, Socio2 o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
