package tema12.Aplicacion.App1718;

import java.util.ArrayList;
import java.util.List;

public class Ppal {
    public static void main(String[] args) {
        List<Integer> tabla = new ArrayList<>();
        Cola cola = new Cola(tabla);
        cola.aniadir(1);
        cola.aniadir(2);
        cola.aniadir(3);
        cola.aniadir(4);
        System.out.println(tabla);
        cola.eliminar();
        System.out.println(tabla);


    }
}
