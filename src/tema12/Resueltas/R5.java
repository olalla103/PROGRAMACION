package tema12.Resueltas;

import java.util.ArrayList;
import java.util.Collection;

public class R5 {
    public static void main(String[] args) {
        Collection<Integer> colInt = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            colInt.add((int) (Math.random() * 10 + 1));
        }
        System.out.println("Con repeticiones\n" + colInt);

        Collection<Integer> col2 = new ArrayList<>();
        for (int n : colInt) {
            if (!col2.contains(n)) {
                col2.add(n);
            }
        }
        System.out.println("Sin repeticiones:\n" + col2);


    }
}
