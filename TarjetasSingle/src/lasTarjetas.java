import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lasTarjetas {
	
	static String [] names = new String[10];
	static String [] numbers = new String[10];
	static String [] expiration  = new String[10];
	static String [] securityNo = new String[10];
	static tarjetasU tarj;
	static Scanner scan = new Scanner(System.in);
	
	public static void llenadoArray() {
		
		Scanner sc = null;
		Scanner sc1 = null;
		Scanner sc2 = null;
		Scanner sc3 = null;
		
        try {
            File nombresClientes = new File("D:\\Anahuac\\5to\\desarrollo\\names.txt");
            sc = new Scanner(nombresClientes);
            int i = 0;
            while (sc.hasNextLine()) {
              names[i] = sc.nextLine();
              i++;
            }
          }
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          finally {
            if (sc != null) sc.close();
          }
        
        try {
        	File numerosT = new File("D:\\Anahuac\\5to\\desarrollo\\cards.txt");
        	sc1 = new Scanner(numerosT);
        	int j = 0;
        	while (sc1.hasNextLine()) {
        		numbers[j] = sc1.nextLine();
        		j++;
        	}
        	
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        finally {
          if (sc != null) sc.close();
        }
        
        try {
            File fechasExp = new File("D:\\Anahuac\\5to\\desarrollo\\expi.txt");
            sc2 = new Scanner(fechasExp);
            int i = 0;
            while (sc2.hasNextLine()) {
              expiration[i] = sc2.nextLine();
              i++;
            }
          }
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          finally {
            if (sc2 != null) sc2.close();
          }
        
        try {
            File cvv0 = new File("D:\\Anahuac\\5to\\desarrollo\\cvv.txt");
            sc3 = new Scanner(cvv0);
            int i = 0;
            while (sc3.hasNextLine()) {
              securityNo[i] = sc3.nextLine();
              i++;
            }
          }
          catch(FileNotFoundException e)
          {
              e.printStackTrace();
          }
          finally {
            if (sc3 != null) sc3.close();
          }
		
	}
	
	public static void crearObjeto() {
		
		System.out.println();
		System.out.println("Con cual tarjeta desea pagar?\n");
		for (int i = 0; i < 10; i++) {
			System.out.println((i+1)+". "+names[i]+" ... "+numbers[i]+" ... "+expiration[i]+" ... "+securityNo[i]+".\n");
		}
		
		System.out.println(">>>");
		
		int op = scan.nextInt();
		scan.nextLine();
		
		if (op > 0) {
			tarj = new tarjetasU(names[op-1],numbers[op-1],expiration[op-1],securityNo[op-1]);
		}
			
	}
	
}