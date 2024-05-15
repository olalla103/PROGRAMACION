package tema12.Aplicacion.App1718;

import java.util.List;

public class Cola<T> {
    List<T> tabla;

    public Cola(List<T> tabla) {
        this.tabla = tabla;
    }

    void aniadir(T elemento) {
        tabla.add(elemento);
    }

    T eliminar() {
        T res = null;
        if (tabla.size() <= 0) {
            System.out.println("La tabla está vacía.");
        } else {
            res = tabla.remove(0);
        }
        return res;
    }

    @Override
    public String toString() {
        return "Cola{" +
                "tabla=" + tabla +
                '}';
    }
}
