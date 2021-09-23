import java.util.Scanner;


public class menuLlamadas{
	
	static Scanner scan = new Scanner(System.in);
	static String TT;
	static String TL;
	static long Num;
	static Double minutos;
	static Double segundos;
	
	public static void menuLlamadas() {
		
		System.out.println("---- Menu ----");
		System.out.println("1. Llamada por línea Fija.\n");
		System.out.println("2. Llamada por Celular.\n");
		System.out.println("3. Llamada por VozIP.\n");
		System.out.println("4. Salir.\n");
		System.out.println(">>>");
		
		int op1 = scan.nextInt();
		
		if(op1 == 1) {
			TT = "Fija";
		}
		else if (op1 == 2) {
			TT = "Celular";
		}
		else if (op1 == 3) {
			TT = "VozIP";
		}
		else {
			System.out.println("Opción inválida.");
		}
		
		System.out.println("\nDame el número a llamar.");
		System.out.println(">>>");
		Num = scan.nextLong();
		
		System.out.println("1. Llamada Local.\n");
		System.out.println("2. Llamada Larga Distancia.\n");
		System.out.println("3. Llamada a Celular.\n");
		System.out.println("4. Salir.\n");
		System.out.println(">>>");
		
		int op2 = scan.nextInt();
		
		if(op2 == 1) {
			TL = "Local";
		}
		else if (op2 == 2 && op1 != 2) {
			TL = ("Larga Distancia");
		}
		else if (op2 == 3) {
			TL = "Celular";
		}
		else {
			System.out.println("Opción inválida.");
		}
		
		
		System.out.println("\nDame la duración de la llamada.");
		System.out.println("Minutos.");
		System.out.println(">>>");
		minutos = scan.nextDouble();
		System.out.println("Segundos.");
		System.out.println(">>>");
		segundos = scan.nextDouble();
		

		
		
	}
	

}
