package proyecto.biblioteca.finall;

import java.util.Scanner;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Lector = new Scanner(System.in);
		Scanner LectorN = new Scanner(System.in);
		int opcion = 0;
		String ter = null;
		String codigoV = null;
		String nombreV = null;
		String autorV = null;
		int añoDePublicaciónV = 0;
		String editorialV = null;
		int cantidadDePaginasV = 0;
		int precioV = 0;

		Libro listBib[] = new Libro[10];
		Estudiante estudiante = new Estudiante();

		do {
			System.out.println("*************************");
			System.out.println("1. Estudiantes:");
			System.out.println("2. Bibliotecario");
			System.out.println("3. SALIR");
			System.out.println("*************************");
			opcion = LectorN.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("a. Consultar libros\n");
				
				System.out.println("b. Reservar libro\n");
				ter = Lector.nextLine();

				if (ter.equals("a")) {
					System.out.println("ingrese el nombre y/o autor del libro\n ");
					for (int i = 0; i < 5; i++) {
						//Libro listBib = libro[i];
						//String no1 = cedula;
						//String no2 = Lector.nextLine();
						//boolean igual = no1.equals(no2);
						System.out.println("yo" + "placeholder");
						
						
					}

						}else if (ter.equals("b")) {
					System.out.println("Ingrese el código del libro a reserva y la cedula del estudiante\n");

				} 
				;

				;
				break;

			case 2:
				System.out.println("a. Ingresar un libro");
				System.out.println("b. Prestar un libro");
				System.out.println("c. Aplazar fecha de entrega\n");
				ter = Lector.nextLine();

				if (ter.equals("a")) {
					System.out.println(
							"Ingrese •Código•Nombre•Autor•Año de publicación•Editorial•Cantidad de páginas•Precio ");
					for (int i = 0; i < 5; i++) {

						Libro libro = new Libro();

						codigoV = Lector.nextLine();
						nombreV = Lector.nextLine();
						autorV = Lector.nextLine();
						añoDePublicaciónV = LectorN.nextInt();
						editorialV = Lector.nextLine();
						cantidadDePaginasV = LectorN.nextInt();
						precioV = LectorN.nextInt();

						libro.setCodigo(codigoV);
						libro.setNombre(nombreV);
						libro.setAutor(autorV);
						libro.setAñoDePublicación(añoDePublicaciónV);
						libro.setEditorial(editorialV);
						libro.setCantidadDePaginas(cantidadDePaginasV);
						libro.setPrecio(precioV);

						listBib[i] = libro;

					}

				} else if (ter.equals("b")) {
					System.out.println("ingrese el código del libro");

				} else if (ter.equals("c")) {
					System.out.println("ingrese el código del libro");

				}

				;
				break;
			}

		} while (opcion != 3);

	}
}