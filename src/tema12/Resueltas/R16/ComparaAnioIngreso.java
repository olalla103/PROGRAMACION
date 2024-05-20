package tema12.Resueltas.R16;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class ComparaAnioIngreso implements Comparator<Academico> {
    @Override
    public int compare(Academico o1, Academico o2) {
        return o1.getAlta().compareTo(o2.getAlta());
    }
}
