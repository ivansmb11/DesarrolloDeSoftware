import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class lasTarjetas {
	
	static String [] names = new String[10];
	static String [] numbers = new String[10];
	static int [] expiration  = new int[10];
	static int [] securityNo = new int[10];
	
	public static void llenadoArray() {
		
		Scanner sc = null;
		Scanner sc1 = null;
        try {
            File nombresClientes = new File("/home/ivanm/Desktop/5to/desarrollo/names.txt");
            sc = new Scanner(nombresClientes);
            int i = 0;
            while (sc.hasNextLine()) {
              names[i] = sc.nextLine();
              System.out.println(names[i]);
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
        	File numerosT = new File("/home/ivanm/Desktop/5to/desarrollo/cards.txt");
        	sc1 = new Scanner(numerosT);
        	int j = 0;
        	while (sc1.hasNextLine()) {
        		numbers[j] = sc1.nextLine();
        		System.out.println(numbers[j]);
        		j++;
        	}
        	
        } catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
          if (sc != null) sc.close();
        }
		
	}
	
}
