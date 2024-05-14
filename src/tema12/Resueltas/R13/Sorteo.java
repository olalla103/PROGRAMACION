package tema12.Resueltas.R13;

import java.util.*;

public class Sorteo<T extends Comparable<T>> {
    private final Set<T> conjunto;

    public Sorteo() {
        conjunto = new TreeSet<>();
    }

    public boolean add(T elemento) {
        return conjunto.add(elemento);
    }

    public Set<T> premiados(int numPremiados) {
        Set<T> premio = null;
        // creo una lista que inicializo con los elementos de conjunto
        List<T> temp = new ArrayList<>(conjunto);
        // la desordeno
        Collections.shuffle(temp);
        // si el numPremiados es menor o igual que la longitud de conjunto añado elementos en premio
        if (numPremiados <= conjunto.size()) {
            // inicializo premio
            premio = new TreeSet<>();
            // bucle con la cantidad de numeros premiados
            for (int i = 0; i < numPremiados; i++) {
                // añado n numeros premiados, en premio, el número corresponderá a la posición de temp(i)
                premio.add(temp.get(i));
            }
        }
        return premio;
    }


    @Override
    public String toString() {
        return "Sorteo{" +
                "conjunto=" + conjunto +
                '}';
    }
}
