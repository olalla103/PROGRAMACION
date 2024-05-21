package tema12.Aplicacion.App25;

import java.util.Comparator;

public class ComparaAntiguo implements Comparator<Socio3> {

    @Override
    public int compare(Socio3 o1, Socio3 o2) {
        return o1.getAntiguedad().compareTo(o2.getAntiguedad());
    }
}
