import java.util.Scanner;

public class main{
	
	static Scanner scan = new Scanner(System.in);
	static int op;

	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("---- Menu ----");
			System.out.println("1. Nueva llamada.\n");
			System.out.println("2. Mostrar información detallada: Telefono Fijo.\n");
			System.out.println("3. Mostrar información detallada: Telefono Celular.\n");
			System.out.println("4. Mostrar información detallada: Telefono VozIP.\n");
			System.out.println("5. Información general.\n");
			System.out.println("6. Salir.\n");
			
			op = scan.nextInt();
			
			if(op == 1) {
				menuLlamadas.menuLlamadas();
				Almacenamiento.addAlmacenamiento();
			}
			else if(op == 2) {
				Almacenamiento.infoFijo();
			}
			else if(op == 3) {
				Almacenamiento.infoCelular();
			}
			else if(op == 4) {
				Almacenamiento.infoVozIP();
			}
			else if(op == 5) {
				Almacenamiento.infoFijo();
				Almacenamiento.infoCelular();
				Almacenamiento.infoVozIP();
			}
		}

	}

}
