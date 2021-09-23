import java.util.Scanner;

public class Main {
	
	static Scanner scan = new Scanner(System.in);
	static User usuario;
	
	public static void main(String[] args) {
		new GUI();
		usuario = new User("ivannsmb","12345");
	}

}