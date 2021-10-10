
public class info {

	static alumno [] alumnos = new alumno[20];
	static profesor [] profes = new profesor[20];
	static personal [] perso = new personal[20];
	
	public static void llenarAlumnos() {
		for (int i = 0; i < alumnos.length; i++) {
			alumnos[i] = new alumno("Ivan","Mendoza Baca",i+1,"Soltero","Informática");
			System.out.println(alumnos[i].toString());
		}
	}
	
	public static void llenarProfes() {
		for (int i = 0; i < profes.length; i++) {
			profes[i] = new profesor("Roberto","Trejo",i+21,"Casado","Ingenieria",2006);
			System.out.println(profes[i].toString());
		}
	}
	
	public static void llenarPersonal() {
		for (int i = 0; i < perso.length; i++) {
			perso[i] = new personal("Juan","Dominguez Rava",i+41,"Casado","Caja",2015);
			System.out.println(perso[i].toString());
		}
	}
}
