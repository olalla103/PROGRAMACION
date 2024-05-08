package tema12.Resueltas.R2;

import java.util.Arrays;

public class Contenedor<T extends Comparable<T>> implements Pila, Cola {
    T[] tabla;

    public Contenedor(T[] tabla) {
        this.tabla = tabla;
    }

    public T extraerPpio(T[] array) {
        if (array.length == 0) {
            // Si el array está vacío, no se puede extraer ningún elemento
            return null;
        }

        T primerElemento = array[0];

        // Crear un nuevo array con una longitud 1 menor que el original
        T[] nuevoArray = Arrays.copyOfRange(array, 1, array.length);

        // Asignar el nuevo array al original
        System.arraycopy(nuevoArray, 0, array, 0, nuevoArray.length);

        return primerElemento;
    }

    public T[] insertarAlPrincipio(T[] array, T elemento) {
        // Crear un nuevo array con una longitud 1 mayor que el original
        T[] nuevoArray = Arrays.copyOf(array, array.length + 1);

        // Desplazar todos los elementos hacia la derecha para dejar espacio para el nuevo elemento al principio
        System.arraycopy(array, 0, nuevoArray, 1, array.length);

        // Insertar el nuevo elemento en la primera posición
        nuevoArray[0] = elemento;

        return nuevoArray;
    }

    // metodos pila


    @Override
    public void apilar(Object nuevo) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = (T) nuevo;
    }

    @Override
    public Object extraerPpio() {
        if (tabla.length == 0) {
            // Si el array está vacío, no se puede extraer ningún elemento
            return null;
        }

        T primerElemento = tabla[0];

        // Crear un nuevo array con una longitud 1 menor que el original
        T[] nuevoArray = Arrays.copyOfRange(tabla, 1, tabla.length);

        // Asignar el nuevo array al original
        System.arraycopy(nuevoArray, 0, tabla, 0, nuevoArray.length);

        return primerElemento;
    }

    @Override
    public void encolar(Object objeto) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = (T) objeto;
    }

    @Override
    public void desencolar() {
        T primerElemento = tabla[0];
        T[] nuevoArray = Arrays.copyOfRange(tabla, 1, tabla.length);
        System.arraycopy(nuevoArray, 0, tabla, 0, nuevoArray.length);
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "tabla=" + Arrays.toString(tabla) +
                '}';
    }
}
