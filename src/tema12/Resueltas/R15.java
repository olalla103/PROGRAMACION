package tema12.Resueltas;

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class R15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> repuestos = new HashMap<>();
        String codigo;
        int stock, op;

        try (ObjectInputStream escribe = new ObjectInputStream(new FileInputStream("repuestos.dat"))) {
            repuestos = (Map<String, Integer>) escribe.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        do {
            System.out.println("Introduzca qué desea realizar:\n1.Alta\n2.Baja\n3.Actualizar stock\n4.Mostrar\n5.Salir");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Introduzca el nombre de la pieza:");
                    codigo = sc.next();
                    if (!contiene(repuestos, codigo)) {
                        System.out.println("Introduzca el stock de la pieza:");
                        stock = sc.nextInt();
                        repuestos.put(codigo, stock);
                        toString(repuestos);
                    } else {
                        System.out.println("Ese código ya se encuentra en el mapa.");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca el nombre de la pieza que desea eliminar:");
                    codigo = sc.next();
                    if (contiene(repuestos, codigo)) {
                        repuestos.remove(codigo);
                        toString(repuestos);
                    } else {
                        System.out.println("Ese código no se encuentra en el mapa.");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el nombre de la pieza para renovar su stock");
                    codigo = sc.next();
                    if (contiene(repuestos, codigo)) {
                        System.out.println("Introduzca el nuevo stock:");
                        stock = sc.nextInt();
                        repuestos.put(codigo, stock);
                        toString(repuestos);
                    } else {
                        System.out.println("Ese código no se encuentra en el mapa.");
                    }
                    break;
                case 4:
                    toString(repuestos);
                    break;
            }
        } while (op != 5);

        try (ObjectOutputStream escribe = new ObjectOutputStream(new FileOutputStream("repuestos.dat"))) {
            escribe.writeObject(repuestos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    // MÉTODOS
    public static boolean contiene(Map<String, Integer> mapa, String codigo) {
        return mapa.containsKey(codigo);
    }

    public static void toString(Map<String, Integer> mapa) {
        System.out.println(mapa);
    }
}
