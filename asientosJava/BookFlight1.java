package asientos;

import java.util.Scanner;

public class BookFlight1 {
	
	static Scanner scan = new Scanner(System.in);
	
	static personas [][] clientes = new personas[7][6];
	
	static personas asientoLibre = new personas("No",".",".");
	
	static personas [][] clientesVIP = new personas[2][4];

	public static int pasajerosE;

	public static int pasajerosT;
	
	
	public static void avionEjecutivo() {
		
		String pref = "0";
		
		
		personas persona;
		
		
		System.out.println("Nombre: ");
		String name = scan.nextLine();
		System.out.println("SSN: ");
		String ssn = scan.nextLine();
		
		
		persona = new personas("Yes",name,ssn);
		
		
		
		while (pasajerosE < 8 && pref.equals("0")) {
			System.out.println("�Cual es el asiento de tu preferencia?");
			System.out.println("");
			System.out.println("1. Ventana.");
			System.out.println("2. Pasillo.");
			System.out.println("");
			System.out.println(">>> ");
			pref = scan.nextLine();
			
		}
		
		
		if (pref.equals("1")) {
			System.out.println("ventana");
			for (int rowe = 0; rowe <= 1; rowe++) {
				System.out.println(rowe);
				if (clientesVIP[rowe][0].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientesVIP[rowe][0] = persona;
					 pasajerosE++;
					 break;
				 }
				 else if (clientesVIP[rowe][3].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientesVIP[rowe][3] = persona;
					 pasajerosE++;
					 break;
				 }
			}
		}	
	

		else if (pref.equals("2")) {
			System.out.println("Pasillo");
			for (int rowe = 0; rowe <= 2; rowe++) {
				 if (clientesVIP[rowe][1].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientesVIP[rowe][1] = persona;
					 pasajerosE++;
					 break;
				 }
				 else if (clientesVIP[rowe][2].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientesVIP[rowe][2] = persona;
					 pasajerosE++;
					 
					 break;
				 }

			}
		}
		else {
			System.out.println("Invalid Selection.");
		}
	}
	
	public static void avionTurista() {
		
		String pref = "0";
		
		
		personas persona;
		
		
		System.out.println("Nombre: ");
		String name = scan.nextLine();
		System.out.println("SSN: ");
		String ssn = scan.nextLine();
		
		
		persona = new personas("Yes",name,ssn);
		
		
		
		while (pasajerosT < 42 && pref.equals("0")) {
			System.out.println("¿Cual es el asiento de tu preferencia?");
			System.out.println("");
			System.out.println("1. Ventana.");
			System.out.println("2. Centro.");
			System.out.println("3. Pasillo.");
			System.out.println("");
			System.out.println(">>> ");
			pref = scan.nextLine();
			
		}
		
		
		if (pref.equals("1")) {
			System.out.println("ventana");
			for (int rowe = 0; rowe <= 6; rowe++) {
				 if (clientes[rowe][0].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientes[rowe][0] = persona;
					 pasajerosT++;
					 break;
				 }
				 else if (clientes[rowe][5].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientes[rowe][5] = persona;
					 pasajerosT++;
					 break;
				 }
				 else {
					 System.out.println("we ran out  window seats.");
					 break;
				 }
			}
			
		}
		else if (pref.equals("2")) {
			System.out.println("Centro");
			for (int rowe = 0; rowe <= 6; rowe++) {
				 if (clientes[rowe][1].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientes[rowe][1] = persona;
					 pasajerosT++;
					 break;
				 }
				 else if (clientes[rowe][4].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientes[rowe][4] = persona;
					 pasajerosT++;
					 break;
				 }
				 else {
					 System.out.println("we ran out center seats.");
					 break;
				 }
			}
		}
		else if (pref.equals("3")) {
			System.out.println("Pasillo");
			for (int rowe = 0; rowe <= 6; rowe++) {
				 if (clientes[rowe][2].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientes[rowe][2] = persona;
					 pasajerosT++;
					 break;
				 }
				 else if (clientes[rowe][3].getTaken().equals("No")) {
					 System.out.println("your seat has been chosen according to your preferences");
					 clientes[rowe][3] = persona;
					 pasajerosT++;
					 break;
				 }
				 
			}
		}
		else {
			System.out.println("Invalid Selection.");
		}
		
	}
	
	

	public static void llenarArray() {
		for(int i=0; i< clientes.length; i++) {
            for(int j=0; j< clientes[i].length; j++) {
            	clientes[i][j] = asientoLibre;
                }
        }
	}
	
	public static void llenarArrayE() {
		for(int i=0; i< clientesVIP.length; i++) {
            for(int j=0; j< clientesVIP[i].length; j++) {
            	clientesVIP[i][j] = asientoLibre;
                }
        }
	}
	
	
	public static void main(String[] args) {
		
		
		
		BookFlight1.llenarArrayE();
		BookFlight1.llenarArray();
		
		while (true) {
			System.out.println("MENU");
			System.out.println("-----------------------");
			System.out.println("1. Reservar clase Ejecutiva.");
			System.out.println("2. Reservar clase Turista.");
			System.out.println("3. Revisar el % de ocupaci�n del avi�n.");
			System.out.println("4. Eliminar una reservaci�n.");
			System.out.println("5. Imprimir el mapa actual del avi�n.");
			System.out.println(">>> ");
			String op = scan.nextLine();
			
			if (op.equals("1")) {
				avionEjecutivo();
				for(int i=0; i< clientesVIP.length; i++) {
		            for(int j=0; j< clientesVIP[i].length; j++) {
		                System.out.print("["+clientesVIP[i][j].getTaken()+"]" + "\t");
		                }
		            System.out.println("");
		        }
			}
			else if (op.equals("2")){
				avionTurista();
				for(int i=0; i< clientes.length; i++) {
		            for(int j=0; j< clientes[i].length; j++) {
		                System.out.print("["+clientes[i][j].getTaken()+"]" + "\t");
		                }
		            System.out.println("");
		        }
			}
			else if (op.equals("3")){
				int pasa = pasajerosE + pasajerosT;
				@SuppressWarnings("deprecation")
				Double pasaD = new Double(pasa);
				Double porc = (((pasaD)/50)*100);
				System.out.println("Actualmente el avi�n est� al "+porc+"% de su capacidad.");
			}
			else if (op.equals("4")) {
				System.out.println("Digite el n�mero de Seguro Social de la persona que desea eliminar.");
				String ssn4 = scan.nextLine();
				for(int i=0; i< clientes.length; i++) {
		            for(int j=0; j< clientes[i].length; j++) {
		            	if (clientes[i][j].getSocialN().equals(ssn4)) {
		            		clientes[i][j] = asientoLibre;
		            		System.out.println("Asiento eliminado con �xito.");
		            	}
		            }
		        }
				for(int i=0; i< clientesVIP.length; i++) {
		            for(int j=0; j< clientesVIP[i].length; j++) {
		            	if (clientesVIP[i][j].getSocialN().equals(ssn4)) {
		            		clientesVIP[i][j] = asientoLibre;
		            		System.out.println("Asiento eliminado con �xito.");	
		            	}

		            }
		        }
			}
			else if (op.equals("5")) {
				for(int i=0; i< clientesVIP.length; i++) {
		            for(int j=0; j< clientesVIP[i].length; j++) {
		                System.out.print("["+clientesVIP[i][j].getTaken()+"]" + "\t");
		                }
		            System.out.println("");
		        }
				System.out.println("");
				for(int i=0; i< clientes.length; i++) {
		            for(int j=0; j< clientes[i].length; j++) {
		                System.out.print("["+clientes[i][j].getTaken()+"]" + "\t");
		                }
		            System.out.println("");
		        }
			}
			else {
				System.out.println("Error.");
			}
			
			
		}

	}

}