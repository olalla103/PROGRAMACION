package tema12.Aplicacion.App16;

import java.util.Comparator;

public class ComparaAntiguo implements Comparator<Socio2> {
    @Override
    public int compare(Socio2 o1, Socio2 o2) {
        return o1.getAntiguedad().compareTo(o2.getAntiguedad());
    }
}
