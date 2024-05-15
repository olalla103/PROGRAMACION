package tema12.Resueltas.R14;

import java.io.*;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Temperatura> rtemperaturas = new LinkedHashSet<>();
        double temp;
        Temperatura temperatura = null;
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
                    temperatura = new Temperatura(temp);
                    rtemperaturas.add(temperatura);
                    break;
                case 2:
                    System.out.println(rtemperaturas);
                    break;
                case 3:
                    List<Temperatura> listaTemp = new ArrayList<>(rtemperaturas);
                    double temMedia = 0.0;
                    for (int i = 0; i < listaTemp.size(); i++) {
                        temMedia += listaTemp.get(i).getGrados();
                    }
                    System.out.println("La temperatura máxima es: " + Collections.max(rtemperaturas)
                            + "\nLa temperatura mínima es: " + Collections.min(rtemperaturas)
                            + "\nLa temperatura media es: " + temMedia / rtemperaturas.size());
                    break;
                case 4:
                    break;
            }
        } while (op != 4);

        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("registros" + temperatura.fechaHora.getYear() + temperatura.fechaHora.getMonthValue() + temperatura.fechaHora.getDayOfMonth() + ".dat"))) {
            escribe.writeObject(rtemperaturas);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}
