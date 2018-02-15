import java.util.Scanner;
public class pt7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion = 7;
		Libro libroA = new Libro();
		libroA.setNombre("El Quijote de La Mancha");
		libroA.setAutor("Miguel de Cervantes");
		libroA.setEjemplares(2);
		libroA.setPrestados(0);
		
		Libro libroB = new Libro("El Capitán Alatriste", "Arturo Pérez Reverte", 1, 0);
		
		System.out.println("Bienvenido a la biblioteca. Los libros que tenemos son:");
		System.out.print("Libro 1: " + libroA.toString() + "\nLibro 2: " + libroB.toString() + "\n");
		
		while (opcion != 0) {
			System.out.println("¿Qué desea hacer?");
			System.out.println("1) Pedir prestado el libro 1.");
			System.out.println("2) Pedir prestado el libro 2.");
			System.out.println("3) Devolver el libro 1.");
			System.out.println("4) Devolver el libro 2.");
			System.out.println("5) Información.");
			System.out.println("0) Salir.");
			opcion = sc.nextInt();
			switch (opcion) {
				case 1: libroA.Prestamo();
						break;
				case 2: libroB.Prestamo();
						break;
				case 3: libroA.Devolucion();
						break;
				case 4: libroB.Devolucion();
						break;
				case 5: System.out.println("Los libros que tenemos son:");
						System.out.println("Libro 1: " + libroA.toString() + "\nLibro 2: " + libroB.toString());
				case 0: break;
			
				default: System.out.println("Ha introducido una opcion errónea. El programa se cerrará.");
						break;
			
			}
		}
		sc.close();
	}

}
