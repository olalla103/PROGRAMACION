package tema12.Resueltas.R14;

import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Double> rtemperaturas = new LinkedHashSet<>();
        double temp;
        int op;

        do {
            System.out.println("""
                    Introduzca qué desea hacer:
                    1. Nuevo registro\

                    2.Listar registros
                    3.Mostrar estadística
                    4.Salir""");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Introduzca una temperatura:");
                    temp = sc.nextDouble();
                    rtemperaturas.add(temp);
                    break;
                case 2:
                    System.out.println(rtemperaturas);
                    break;
                case 3:
                    List<Double> listaTemp = new ArrayList<>(rtemperaturas);
                    double temMedia = 0.0;
                    for (int i = 0; i < listaTemp.size(); i++) {
                        temMedia += listaTemp.get(i);
                    }
                    System.out.println("La temperatura máxima es: " + Collections.max(rtemperaturas)
                            + "\nLa temperatura mínima es: " + Collections.min(rtemperaturas)
                            + "\nLa temperatura media es: " + temMedia / rtemperaturas.size());
                    break;
                case 4:
                    break;
            }
        } while (op != 4);
       /* LocalDate fecha = LocalDate.now();
        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("registros" + fecha + ".dat"))) {
            escribe.writeObject();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }*/
    }
}
