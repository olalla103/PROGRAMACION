package tema12.Resueltas.R13;

public class Principal {
    public static void main(String[] args) {
        Sorteo<Integer> s = new Sorteo<>();
        for (int i = 0; i < 20; i++) {
            s.add((int) (Math.random() * 100 + 1));
        }
        System.out.println(s);
        System.out.println("Números premiados: " + s.premiados(3));
    }
}
