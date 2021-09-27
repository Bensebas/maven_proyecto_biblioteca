package proyecto.biblioteca.finall;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Scanner Lector = new Scanner(System.in);
		Scanner LectorN = new Scanner(System.in);
		int opcion = 0;
		String ter = null;
		String codigoV = null;
		String nombreV = null;
		String autorV = null;
		int añoDePublicacionV = 0;
		String editorialV = null;
		int cantidadDePaginasV = 0;
		int precioV = 0;
		int indice = 0;
		Libro listBib[] = new Libro[10];
		Estudiante estudiante[] = new Estudiante[10];
		LocalDate hoy = LocalDate.now();
		for (int i = 0; i < 5; i++) {
			listBib[i] = new Libro();
		}

		do {
			System.out.println("*************************");
			System.out.println("1. Estudiantes:");
			System.out.println("2. Bibliotecario");

			System.out.println("*************************");
			opcion = LectorN.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("a. Consultar libros\n");

				System.out.println("b. Reservar libro\n");
				System.out.println("c. retirar libro\n");
				ter = Lector.next();

				if (ter.equals("a")) {
					System.out.println("¿ deseas buscar el libro?");
					System.out.println("a. Nombre de libro\n");
					System.out.println("b. Autor de libro\n");
					String a = Lector.next();
					int ind = 0;
					if (a.equals("a")) {
						try {
							String nombre = Lector.next();
							for (int i = 0; i < 5; i++) {
								if (listBib[i].getAutor().compareTo(nombre) == 0) {
									System.out.println("El libro fue encontrado:");
									System.out.println(listBib[i].toString());
									ind = 1;
								}
								if (ind == 0) {
									System.out.println("El libro no fue encontrado:");
								}
							}
						} catch (Exception e) {

						}
					} else if (a.equals("b")) {
						String nombre = Lector.next();
						for (int i = 0; i < 5; i++) {
							if (listBib[i].getNombre().equals(nombre)) {
								System.out.println("El libro fue encontrado:");
								System.out.println(listBib[i].toString());
								ind = 1;
							}
							if (ind == 0) {
								System.out.println("El libro no fue encontrado:");
							}
						}
					}

				} else if (ter.equals("b")) {
					System.out.println("Ingresa el codigo del libro a reservar\n");
					String cod = Lector.next();

					for (int i = 0; i < 5; i++) {

						if (listBib[i].getCodigo().equals(cod)) {
							System.out.println("El libro fue encontrado:");
							System.out.println(listBib[i].toString());
							System.out.println("Â¿Es este el libro que deseas reservar? (yes/no)");
							String var = Lector.next();
							if (var.equals("yes")) {
								System.out.println("Ingresa tu cÃ©dula: ");
								String ced = Lector.next();
								listBib[i].setEstudiante(ced);
								listBib[i].setEstado("Reservado");
							}
							break;
						}

						System.out.println("El libro no fue encontrado:");

					}

				} else if (ter.equals("c")) {
					System.out.println("Ingresa tu cÃ©dula para verificar si reservaste\n");
					String ced = Lector.next();

					for (int i = 0; i < 5; i++) {

						if (listBib[i].getEstudiante().equals(ced)) {
							System.out.println("El libro fue encontrado:");
							System.out.println(listBib[i].toString());
							if (listBib[i].getEstado().equals("Reservado")) {

								System.out.println("Puedes retirar el Libro");
								listBib[i].setEstado("Prestado");
							}
							break;
						}

						System.out.println("El libro no fue encontrado:");

					}

				}

				break;

			case 2:
				System.out.println("a. Ingresar un libro");
				System.out.println("b. Consultar un libro");
				System.out.println("c. Aplazar fecha de entrega\n");
				ter = Lector.next();

				if (ter.equals("a")) {
					System.out.println(
							"Ingrese •Código•Nombre•Autor•Año de publicación•Editorial•Cantidad de páginas•Precio");
					String var = "no";
					Libro libro = new Libro();
					do {

						System.out.println("Ingresa el codigo del libro: ");
						codigoV = Lector.next();
						System.out.println("Ingresa el nombre: ");
						nombreV = Lector.next();
						System.out.println("Ingresa el autor: ");
						autorV = Lector.next();
						System.out.println("Ingresa el añoDePublicacionV n: ");
						añoDePublicacionV = LectorN.nextInt();
						System.out.println("Ingresa el editorial: ");
						editorialV = Lector.next();
						System.out.println("Ingresa el numero de paginas : ");
						cantidadDePaginasV = LectorN.nextInt();
						System.out.println("Ingresa el precio: ");
						precioV = LectorN.nextInt();

						libro.setCodigo(codigoV);
						libro.setNombre(nombreV);
						libro.setAutor(autorV);
						libro.setAñoDePublicacionV(añoDePublicacionV);
						libro.setEditorial(editorialV);
						libro.setCantidadDePaginas(cantidadDePaginasV);
						libro.setPrecio(precioV);
						libro.setEstado("Disponible");
						listBib[indice] = libro;
						indice++;
						System.out.println("¿Deseas ingresar otro libro? (yes/no): ");
						var = LectorN.next();
					} while (var.compareTo("yes") == 0);

				} else if (ter.equals("b")) {
					System.out.println("ingrese el codigo del libro");
					String cod = Lector.next();
					for (int i = 0; i < 5; i++) {
						if (listBib[i].getCodigo().equals(cod)) {
							System.out.println("El libro fue encontrado:");
							System.out.println(listBib[i].toString());
							break;
						}
						System.out.println("El libro no fue encontrado:");
					}

				} else if (ter.equals("c")) {
					System.out.println("AÃºn no se ha implementado esta funciÃ³n, lo sentimos");

				}

				break;
			}
			System.out.println("¿Desea salir del programa? (yes/no)");
		} while (Lector.next().compareTo("no".toLowerCase()) == 0);
	}

}