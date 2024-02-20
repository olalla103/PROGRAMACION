package articulos;

import java.util.Scanner;

public class Ppal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Articulo articulo;
		ConjuntoArticulo conjuntoArticulo = new ConjuntoArticulo();
		String descripcion;
		Double precioCompra, precioVenta;
		Integer stock, cantidad;
		Integer op, codigo;

		do {
			System.out.println("Introduzca qué opción desea realizar:\n 1.Alta artículo.\n 2.baja artículo."
					+ "\n 3.Modificar precio de venta de un artículo concreto.\n 5.Entrada de mercancía.\n 6.Salida de mercancía.\n 7.Listar\n8.Listar ordenado\n9.Salir");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca la descripción del Articulo:");
				descripcion = sc.next();
				System.out.println("Introduzca el precio de compra del artículo:");
				precioCompra = sc.nextDouble();
				System.out.println("Introduzca el precio de venta del artículo:");
				precioVenta = sc.nextDouble();
				System.out.println("Introduzca el precio de venta del artículo:");
				precioVenta = sc.nextDouble();
				System.out.println("Introduzca el stock del artículo:");
				stock = sc.nextInt();
				articulo = new Articulo(descripcion, precioCompra, precioVenta, stock);
				conjuntoArticulo.alta(articulo);
				System.out.println(conjuntoArticulo.toString());
				break;

			case 2:
				System.out.println("Introduzca el ID del Articulo que desea eliminar: ");
				codigo = sc.nextInt();
				conjuntoArticulo.baja(codigo);
				System.out.println(conjuntoArticulo.toString());
				break;

			case 3:
				System.out.println("Introduzca el codigo del Artículo que desea modificar:");
				codigo = sc.nextInt();
				System.out.println("Introduzca el nuevo precio del Artículo que desea modificar:");
				precioVenta = sc.nextDouble();
				conjuntoArticulo.modifica(codigo, precioVenta);
				break;
			case 4:
				System.out.println("Introduzca el codigo del artículo");
				codigo = sc.nextInt();
				System.out.println("Introduzca la cantidad de mercanciía: ");
				cantidad = sc.nextInt();
				conjuntoArticulo.entradaMercancia(codigo, cantidad);
				break;
			case 5:
				System.out.println("Introduzca el codigo del artículo");
				codigo = sc.nextInt();
				System.out.println("Introduzca la cantidad de mercanciía: ");
				cantidad = sc.nextInt();
				conjuntoArticulo.salidaMercancia(codigo, cantidad);
				break;

			case 6:
				System.out.println(conjuntoArticulo.toString());
				break;

			case 7:
				System.out.println(conjuntoArticulo.toString());
				break;

			case 8:
				conjuntoArticulo.ordenaPorCodigo();
				break;
			}

		} while (op != 9);

		sc.close();
	}

}
