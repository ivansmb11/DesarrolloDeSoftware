package teatroTaquilla;

public class logic {
	
	static boleto [][] principal = new boleto[20][10];		// 200
	static boleto [][] palco = new boleto[4][10]; 			// 40
	static boleto [][] central = new boleto[20][20]; 		// 400
	static boleto [][] lateral = new boleto[10][10]; 		// 100
	
	static boleto currentBoleto,ivan;
	
	static int counter;
	
	static String name,zone;
	
	public static void imprimirArreglosP() {
		for (int row = 0; row < principal.length; row++) {
			for (int col = 0; col < principal[row].length; col++) {
				
				System.out.print(principal[row][col]+ "\t");
				
			}
			System.out.println();
		}
	}
	
	public static void imprimirArreglosPal() {
		for (int row = 0; row < palco.length; row++) {
			for (int col = 0; col < palco[row].length; col++) {
				
				System.out.print(palco[row][col]+ "\t");
				
			}
			System.out.println();
		}
	}
	public static void imprimirArreglosCen() {
		for (int row = 0; row < central.length; row++) {
			for (int col = 0; col < central[row].length; col++) {
				
				System.out.print(central[row][col]+ "\t");
				
			}
			System.out.println();
		}
	}
	
	public static void imprimirArreglosLat() {
		for (int row = 0; row < lateral.length; row++) {
			for (int col = 0; col < lateral[row].length; col++) {
				
				System.out.print(lateral[row][col]+ "\t");
				
			}
			System.out.println();
		}
	}
	
	public static void llenarArreglos() {
		
		currentBoleto = new boleto(false,"23","",0.0,"");
		
		for (int row = 0; row < principal.length; row++) {
			for (int col = 0; col < principal[row].length; col++) {
				principal[row][col] = currentBoleto;
			}
		}
		
		
		for (int row = 0; row < palco.length; row++) {
			for (int col = 0; col < palco[row].length; col++) {
				palco[row][col] = currentBoleto;
			}
		}
		for (int row = 0; row < central.length; row++) {
			for (int col = 0; col < central[row].length; col++) {
				central[row][col] = currentBoleto;
			}
		}
		for (int row = 0; row < lateral.length; row++) {
			for (int col = 0; col < lateral[row].length; col++) {
				lateral[row][col] = currentBoleto;
			}
		}
		
		
	}
	
	public static void contarAsientosP() {
		counter = 0;
		for (int row = 0; row < principal.length; row++) {
			for (int col = 0; col < principal[row].length; col++) {
				if (principal[row][col].isOcupado() == true) {
					counter++;
				}
			}
		}
	}
	
	public static void contarAsientosPal() {
		int counter = 0;
		for (int row = 0; row < palco.length; row++) {
			for (int col = 0; col < palco[row].length; col++) {
				if (palco[row][col].isOcupado() == false) {
					counter++;
				}
			}
		}
	}
	
	public static void contarAsientosC() {
		int counter = 0;
		for (int row = 0; row < central.length; row++) {
			for (int col = 0; col < central[row].length; col++) {
				if (central[row][col].isOcupado() == false) {
					counter++;
				}
			}
		}
	}
	
	public static void contarAsientosL() {
		int counter = 0;
		for (int row = 0; row < lateral.length; row++) {
			for (int col = 0; col < lateral[row].length; col++) {
				if (lateral[row][col].isOcupado() == false) {
					counter++;
				}
			}
		}
	}
	
	public static void Borrar(String id){
		for (int row = 0; row < principal.length; row++) {
			for (int col = 0; col < principal[row].length; col++) {
				if (principal[row][col].getId() == id) {
					
					principal[row][col] = currentBoleto;

				}
			}
		}
		for (int row = 0; row < palco.length; row++) {
			for (int col = 0; col < palco[row].length; col++) {
				if (palco[row][col].getId() == id) {
					
					principal[row][col] = currentBoleto;

				}
			}
		}
		for (int row = 0; row < central.length; row++) {
			for (int col = 0; col < central[row].length; col++) {
				if (central[row][col].getId() == id) {
					principal[row][col] = currentBoleto;
				}
			}
		}
		for (int row = 0; row < lateral.length; row++) {
			for (int col = 0; col < lateral[row].length; col++) {
				if (lateral[row][col].getId() == id) {
					principal[row][col] = currentBoleto;
				}
			}
		}
	}
	
	public static void encontrarID(String id){
		for (int row = 0; row < principal.length; row++) {
			for (int col = 0; col < principal[row].length; col++) {
				if (principal[row][col].getId() == id) {
					System.out.println("Si lo encontre");
					name = principal[row][col].getNombre();
					zone = principal[row][col].getZona();

				}
			}
		}
		for (int row = 0; row < palco.length; row++) {
			for (int col = 0; col < palco[row].length; col++) {
				if (palco[row][col].getId() == id) {


				}
			}
		}
		for (int row = 0; row < central.length; row++) {
			for (int col = 0; col < central[row].length; col++) {
				if (central[row][col].getId() == id) {


				}
			}
		}
		for (int row = 0; row < lateral.length; row++) {
			for (int col = 0; col < lateral[row].length; col++) {
				if (lateral[row][col].getId() == id) {

				}
			}
		}
	}
	
	public static void comprarAsientoP() {
		for (int row = 0; row < principal.length; row++) {
			for (int col = 0; col < principal[row].length; col++) {
				if (principal[row][col].isOcupado()==false) {
					ivan = new boleto(true,"200","Ivan Sebastian Mendoza Baca",2500.0,"Principal");
					principal[row][col] = ivan;
				}
			}
		}
	}
	
	public static void comprarAsientoPal() {
		for (int row = 0; row < palco.length; row++) {
			for (int col = 0; col < palco[row].length; col++) {
				if (palco[row][col].isOcupado()==false) {
					ivan = new boleto(true,"200","Ivan Sebastian Mendoza Baca",7000.0,"Palco");
					palco[row][col] = ivan;
				}
			}
		}
	}
	
	public static void comprarAsientoC() {
		for (int row = 0; row < central.length; row++) {
			for (int col = 0; col < central[row].length; col++) {
				if (central[row][col].isOcupado()==false) {
					ivan = new boleto(true,"200","Ivan Sebastian Mendoza Baca",2000.0,"Central");
					central[row][col] = ivan;
				}
			}
		}
	}
	
	public static void comprarAsientoL() {
		for (int row = 0; row < lateral.length; row++) {
			for (int col = 0; col < lateral[row].length; col++) {
				if (lateral[row][col].isOcupado()==false) {
					ivan = new boleto(true,"200","Ivan Sebastian Mendoza Baca",1550.0,"Lateral");
					lateral[row][col] = ivan;
				}
			}
		}
	}
	
}
