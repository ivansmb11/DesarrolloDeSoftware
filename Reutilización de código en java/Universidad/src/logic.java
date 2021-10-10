
public class logic extends info {
	
	static int exito = 0;
	static int exitoR = 0;
	static int exitoC = 0;

	public static void cambiarEstadoCivil(int id, String estado) {
		for (int i = 0; i < 20; i++) {
			if (alumnos[i].getId()==id) {
				System.out.println("Lo encontró");
				alumnos[i].setEstadoCivil(estado);
				System.out.println(alumnos[i].getEstadoCivil());
				exito = 1;
			}
		}
		for (int i = 0; i < 20; i++) {
			if (profes[i].getId()==id) {
				System.out.println("Lo encontró");
				profes[i].setEstadoCivil(estado);
				System.out.println(profes[i].getEstadoCivil());
				exito = 1;
			}
		}
		for (int i = 0; i < 20; i++) {
			if (perso[i].getId()==id) {
				System.out.println("Lo encontró");
				perso[i].setEstadoCivil(estado);
				System.out.println(perso[i].getEstadoCivil());
				exito = 1;
			}
		}
	}
	
	public static void reasignarOficina(int id,String oficina) {
		
		for (int i = 0; i < 20; i++) {
			if (profes[i].getId()==id) {
				System.out.println("Lo encontró");
				profes[i].setDepartamento(oficina);
				System.out.println(profes[i].getDepartamento());
				exitoR = 1;
			}
		}
		for (int i = 0; i < 20; i++) {
			if (perso[i].getId()==id) {
				System.out.println("Lo encontró");
				perso[i].setSeccion(oficina);
				System.out.println(perso[i].getSeccion());
				exitoR = 1;
			}
		}
	}
	
	public static void cambiodeCurso(int id,String curso) {
		for (int i = 0; i < 20; i++) {
			if (alumnos[i].getId()==id) {
				System.out.println("Lo encontró");
				alumnos[i].setCurso(curso);
				System.out.println(alumnos[i].getCurso());
				exitoC = 1;
			}
		}
	}
	
	public static void imprimirTodo() {
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println(alumnos[i].toString());
		}
		for (int i = 0; i < profes.length; i++) {
			System.out.println(profes[i].toString());
		}
		for (int i = 0; i < perso.length; i++) {
			System.out.println(perso[i].toString());
		}
	}
}
