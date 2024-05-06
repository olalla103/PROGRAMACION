package tema12.Resueltas.R2;

public class Ppal {
    public static void main(String[] args) {
        Integer[] tInt = new Integer[0];
        Contenedor<Integer> ob = new Contenedor<>(tInt);
        ob.insertarFinal(1);
        System.out.println(ob.toString());
    }
}
