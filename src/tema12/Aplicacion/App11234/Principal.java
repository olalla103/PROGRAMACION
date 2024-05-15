package tema12.Aplicacion.App11234;

public class Principal {
    public static void main(String[] args) {
        Integer[] tabla = new Integer[0];
        Contiene<Integer> contiene = new Contiene<>(tabla);

        for (int i = 0; i < 30; i++) {
            contiene.insertarFinal((int) (Math.random() * 10 + 1));
        }
        System.out.println("Sin ordenar: " + contiene);
        contiene.ordena();
        System.out.println("Ordenado: " + contiene);
        contiene.ordenar(new Mayormenor<>());
        System.out.println("Ordenado de mayor a menor: " + contiene);
    }
}
