package tema12.Aplicacion;

import java.util.*;

public class App15 {
    public static void main(String[] args) {
        Integer[] tabla = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9, 10, 10, 22, 1, 4, 5, 6};
        System.out.println(Arrays.toString(tabla));
        tabla = noRepes(tabla);
        System.out.println(Arrays.toString(tabla));

    }

    public static <T> T[] noRepes(T[] tabla) {
        // lo paso a treeset ya que no me deja tener repetidos
        Set<T> lista = new TreeSet<>(Arrays.asList(tabla));
        // devuelvo la lista pasada a Array y hago un copyOf para crear un nuevo Array con el
        // tamaño correcto y lo pasamos como argumento al método toArray() para evitar el error de casteo
        return lista.toArray(Arrays.copyOf(tabla, lista.size()));
    }
}
