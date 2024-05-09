package tema12.Resueltas;

import java.util.ArrayList;
import java.util.Collection;

public class R7 {
    public static void main(String[] args) {
        Collection<Integer> global = new ArrayList<>();
        Collection<Integer> cinco = new ArrayList<>();
        cinco.add(5);

        for (int i = 0; i < 20; i++) {
            global.add((int) (Math.random() * 10 + 1));
        }
        System.out.println(global);

        global.removeAll(cinco);
        System.out.println(global);
    }
}
