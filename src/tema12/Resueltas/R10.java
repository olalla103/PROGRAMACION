package tema12.Resueltas;

import java.util.*;

public class R10 {
    public static void main(String[] args) {
        List<Integer> cOriginal = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            cOriginal.add((int) (Math.random() * 10 + 1));
        }
        Comparator<Integer> c = Comparator.naturalOrder();
        cOriginal.sort(c);
        System.out.println("Conjunto original:\n" + cOriginal);

        Set<Integer> noRepeti2 = new TreeSet<>();
        noRepeti2.addAll(cOriginal);
        System.out.println("No repetidos\n" + noRepeti2);

        Set<Integer> repeti2 = new TreeSet<>();
        for (Integer e : noRepeti2) {
            cOriginal.remove(e);
        }
        repeti2.addAll(cOriginal);
        System.out.println("Repeticiones:\n" + repeti2);

        Set<Integer> unicos = new TreeSet<>();
        unicos.addAll(noRepeti2);
        unicos.removeAll(repeti2);
        System.out.println("Elementos repetidos únicos:\n" + unicos);


    }
}
