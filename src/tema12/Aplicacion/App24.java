package tema12.Aplicacion;

import java.util.*;

public class App24 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            l1.add((int) (Math.random() * 10 + 1));
        }

        List<Integer> l2 = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            l2.add((int) (Math.random() * 10 + 1));
        }

        System.out.println(l1 + "\n" + l2);

        List<Integer> todo = new ArrayList<>();
        Collections.sort(l1);
        Collections.sort(l2);
        todo.addAll(l1);
        todo.addAll(l2);
        Collections.sort(todo);
        System.out.println(todo);
    }
}
