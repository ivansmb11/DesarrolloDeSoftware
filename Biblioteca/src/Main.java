import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		while(true) {
			menu();
		}

	}
	
	public static void menu() {
		System.out.println("---- MENU ----\n");
		System.out.println("1. Nuevo Libro.");
		System.out.println("2. Nueva Revista.");
		System.out.println("3. Prestar libro.");
		System.out.println("4. Devolver libro.");
		System.out.println("5. Ver estado libro.");
		
		int op = scan.nextInt();
		if (op == 1) {
			Libro li;
			crearLibro();
		} else {
			if (op == 2) {
				crearRevista();
			} else {
				if (op == 3) {
					prestarLibro();
				} else {
					if (op == 4) {
						devolverLibro();
					} else {
						if (op == 5) {
							checarEstadoLibro();
						} else {
							System.out.println("Opcion Invalida.");
						}
					}
				}
			}
		}
	}
	
	public static void crearLibro() {
		
		
		System.out.println("\nSeleccionaste Crear un libro.");
		System.out.println("Inserta el codigo: ");
		int code = scan.nextInt();
		scan.nextLine();
		System.out.println("Inserta el titulo: ");
		String title = scan.nextLine();
		System.out.println("Inserta el año de publicación: ");
		int year = scan.nextInt();
		scan.nextLine();
		
		Libro li = new Libro(code,title,year);
		

		
		System.out.println(li.toString());
		
		
		
	}
	public static void crearRevista() {
		
		System.out.println("\nSeleccionaste Crear una revista.");
		System.out.println("Inserta el codigo: ");
		int code = scan.nextInt();
		scan.nextLine();
		System.out.println("Inserta el titulo: ");
		String title = scan.nextLine();
		System.out.println("Inserta el año de publicación: ");
		int year = scan.nextInt();
		System.out.println("Inserta el número: ");
		int num = scan.nextInt();
		
		Revista re = new Revista(code,title,year,num);
		
		System.out.println(re.toString());
		
	}
	
	public static void prestarLibro() {
		li.prestar();
		System.out.println(li.toString());
	}
	public static void devolverLibro() {
		li.devolver();
		System.out.println(li.toString());
	}
	
	public static void checarEstadoLibro() {
		System.out.println(li.toString());
	}

}
