package tema12.Resueltas.R16;

import java.time.temporal.ChronoUnit;
import java.util.Comparator;

public class ComparaAnioIngreso implements Comparator<Academico> {
    @Override
    public int compare(Academico o1, Academico o2) {
        if (o1.getAnioIngreso().compareTo(o2.getAnioIngreso()) < 0) {
            return o1.getAnioIngreso().compareTo(o2.getAnioIngreso());
        } else {
            return o1.getAlta().getMonthValue() - o2.getAlta().getMonthValue();
        }
    }
}
