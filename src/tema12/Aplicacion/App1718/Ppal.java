package tema12.Aplicacion.App1718;

import java.util.ArrayList;
import java.util.List;

public class Ppal {
    public static void main(String[] args) {
        // CLASE COLA
        List<Integer> tabla = new ArrayList<>();
        Cola cola = new Cola(tabla);
        cola.aniadir(1);
        cola.aniadir(2);
        cola.aniadir(3);
        cola.aniadir(4);
        cola.eliminar();

        // CLASE PILA
        List<Integer> tP = new ArrayList<>();
        Pila<Integer> pila = new Pila<>(tP);
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        System.out.println(tP);
        pila.eliminar();
        System.out.println(tP);
        pila.insertar(6);
        System.out.println(tP);


    }
}
