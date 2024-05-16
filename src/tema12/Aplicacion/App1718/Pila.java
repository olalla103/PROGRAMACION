package tema12.Aplicacion.App1718;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    List<T> tabla;

    public Pila(List<T> tabla) {
        this.tabla = tabla;
    }

    void insertar(T elemento) {
        tabla.add(elemento);
    }

    T eliminar() {
        T res = null;
        res = tabla.remove(tabla.size() - 1);
        return res;
    }


}
