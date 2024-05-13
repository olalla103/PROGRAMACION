package tema12.Propuestas.P5;

import java.util.TreeSet;

public class Principal {
    public static void main(String[] args) {
        // COMPARADORES
        ComparaEdades cE = new ComparaEdades();
        ComparaNombres cN = new ComparaNombres();
        TreeSet<Clientes> ccE = new TreeSet<>(cE);
        TreeSet<Clientes> ccN = new TreeSet<>(cN);

        ccE.add(new Clientes(1, "Olalla", "10/03/2004"));
        ccE.add(new Clientes(2, "Iñigo", "23/04/2005"));
        ccE.add(new Clientes(3, "Paola", "10/11/2005"));
        ccE.add(new Clientes(4, "Berta", "17/07/2007"));
        ccE.add(new Clientes(5, "Cuchara", "06/10/2002"));
        System.out.println("Ordenado por edad:\n" + ccE);

        ccN.add(new Clientes(1, "Olalla", "10/03/2004"));
        ccN.add(new Clientes(2, "Iñigo", "23/04/2005"));
        ccN.add(new Clientes(3, "Paola", "10/11/2005"));
        ccN.add(new Clientes(4, "Berta", "17/07/2007"));
        ccN.add(new Clientes(5, "Cuchara", "06/10/2002"));
        System.out.println("Ordenado por nombre:\n" + ccN);


    }
}
