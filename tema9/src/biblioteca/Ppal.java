package biblioteca;

import java.util.Scanner;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Libro libro;
		Revista revista;
		Biblioteca biblioteca = new Biblioteca();
		Integer codigo, anioPublicacion, numero, op = 0;
		Boolean prestado;
		String autor, titulo;

		do {
			System.out.println(
					"Introduzca la opción que desea realizar:\n 1.Insertar un libro\n 2.Insertar una revista\n 3.Eliminar un libro dado un código"
							+ "\n 4.Consultar los datos de un libro en concreto\n 5.Listar las publicaciones ordenadas por su código"
							+ "\n 6.Listado de libros prestados \n 7.Listado de libros no prestados\n 8.Listado de libros ordenados por autor"
							+ "\n 9.Consultar número de publicaciones totales\n 10.Salir");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Introduzca el ćodigo del libro:");
				codigo = sc.nextInt();
				System.out.println("Introduzca el título del libro:");
				titulo = sc.next();
				System.out.println("Introduzca el autor del libro:");
				autor = sc.next();
				System.out.println("Introduzca el año de publicación:");
				anioPublicacion = sc.nextInt();
				System.out.println("Introduzca true si el libro está prestado, introduzca false si no.");
				prestado = sc.nextBoolean();
				libro = new Libro(codigo, titulo, anioPublicacion, autor);
				libro.setPrestado(prestado);
				biblioteca.altaLibro(libro);
				break;
			case 2:
				System.out.println("Introduzca el ćodigo de la revista:");
				codigo = sc.nextInt();
				System.out.println("Introduzca el título de la revista:");
				titulo = sc.next();
				System.out.println("Introduzca el autor de la revista:");
				autor = sc.next();
				System.out.println("Introduzca el año de publicación:");
				anioPublicacion = sc.nextInt();
				System.out.println("Introduzca el número de la revista:");
				numero = sc.nextInt();
				revista = new Revista(codigo, titulo, anioPublicacion, numero);
				biblioteca.altaLibro(revista);
				break;
			case 3:
				System.out.println("Introduzca el código del libro que quieres eliminar:");
				codigo = sc.nextInt();
				biblioteca.bajaLibro(codigo);
				break;
			case 4:
				System.out.println("Introduzca el código del libro que quiere consultar: ");
				codigo = sc.nextInt();
				biblioteca.datosLibro(codigo);
				break;
			case 5:
				biblioteca.listadOrdenado();
				System.out.println(biblioteca.toString());
				break;
			case 6:
				biblioteca.listadoLibrosPrestados();
				break;
			case 7:
				biblioteca.listadoLibrosNoPrestados();
				break;
			case 8:
				biblioteca.listaLibrosOrdenadosAutores();
				break;
			case 9:
				biblioteca.numPublicaciones();
				break;

			}
		} while (op != 10);

		sc.close();

	}

}
