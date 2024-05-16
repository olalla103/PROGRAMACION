package tema12.Aplicacion;

import java.util.*;

public class App23 {
    public static void main(String[] args) {
        String nombre;
        Set<String> nombres = new TreeSet<>();

        do {
            System.out.println("Mete un nombre si quiere sali pon fin");
            nombre = new Scanner(System.in).nextLine();
            if (!nombre.equals("fin")) {
                nombres.add(nombre);

            }
        } while (!nombre.equals("fin"));

        System.out.println(nombres);

    }
}
