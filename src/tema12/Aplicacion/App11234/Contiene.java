package tema12.Aplicacion.App11234;

import java.util.Arrays;
import java.util.Comparator;

public class Contiene<T> {
    T[] tabla;

    public Contiene(T[] tabla) {
        this.tabla = tabla;
    }

    public void insertarFinal(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = nuevo;
    }

    public void insertarPpio(T nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        System.arraycopy(tabla, 0, tabla, 1, tabla.length - 1);
        tabla[0] = nuevo;
    }

    public T extraerFinal() {
        T resultado = null;
        if (tabla.length > 0) {
            resultado = tabla[tabla.length - 1];
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }
        return resultado;
    }

    public T extraerPpio() {
        T resultado = null;
        if (tabla.length > 0) {
            resultado = tabla[0];
            tabla = Arrays.copyOfRange(tabla, 1, tabla.length);
        }
        return resultado;
    }

    public T get(int indice) {
        return tabla[indice];
    }

    public void ordena() {
        Arrays.sort(tabla);
    }

    public void ordenar(Comparator<T> c) {
        Arrays.sort(tabla, c);
    }

    @Override
    public String toString() {
        return "Contiene{" +
                "tabla=" + Arrays.toString(tabla) +
                '}';
    }
}
