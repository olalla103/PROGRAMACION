package tema12.Aplicacion.App25;

import java.util.Map;
import java.util.TreeMap;

public class Club {
    Map<String, Socio3> mapa = new TreeMap<>();

    public boolean aniadir(Socio3 socio) {
        if (!compruebaApodo(socio.getApodo())) {
            mapa.put(socio.getApodo(), socio);
            return true;
        } else {
            System.out.println("Ese apodo ya existe.");
            return false;
        }
    }

    public boolean eliminar(String clave) {
        if (!compruebaApodo(clave)) {
            return false;
        } else {
            mapa.remove(clave);
            return true;
        }
    }

    public void modificarSocio(String clave, String nombre, String fechaIngreso) {
        if (compruebaApodo(clave)) {
            Socio3 socio = new Socio3(clave, nombre, fechaIngreso);
            mapa.put(clave, socio);
        } else {
            System.out.println("Ese apodo no existe.");
        }

    }

    // LISTADO A X AÑO ANTERIOR
    public void listadoAnio(Integer anio) {
        for (Map.Entry<String, Socio3> entrada : mapa.entrySet()) {
            if (entrada.getValue().getAlta().getYear() < anio) {
                System.out.println(entrada);
            }
        }
    }

    // ORDENA POR ANTIGÜEDAD


    public boolean compruebaApodo(String clave) {
        return mapa.containsKey(clave);
    }

    @Override
    public String toString() {
        return "Club{" +
                "mapa=" + mapa +
                '}';
    }
}
