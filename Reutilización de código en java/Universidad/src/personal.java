
public class personal {

	String nombre;
	String apellidos;
	int id;
	String estadoCivil;
	String seccion;
	int añodeIngreso;
	
	public personal(String nombre, String apellidos, int id, String estadoCivil, String seccion, int añodeIngreso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.estadoCivil = estadoCivil;
		this.seccion = seccion;
		this.añodeIngreso = añodeIngreso;
		
	}


	@Override
	public String toString() {
		return "personal [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil
				+ ", seccion=" + seccion + ", a�odeIngreso=" + añodeIngreso + "]";
	}


	public int getAñodeIngreso() {
		return añodeIngreso;
	}

	public void setAñodeIngreso(int añodeIngreso) {
		this.añodeIngreso = añodeIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}
	

}