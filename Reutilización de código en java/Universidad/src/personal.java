
public class personal {

	String nombre;
	String apellidos;
	int id;
	String estadoCivil;
	String seccion;
	int aņodeIngreso;
	
	public personal(String nombre, String apellidos, int id, String estadoCivil, String seccion, int aņodeIngreso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.estadoCivil = estadoCivil;
		this.seccion = seccion;
		this.aņodeIngreso = aņodeIngreso;
		
	}


	@Override
	public String toString() {
		return "personal [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil
				+ ", seccion=" + seccion + ", aņodeIngreso=" + aņodeIngreso + "]";
	}


	public int getAņodeIngreso() {
		return aņodeIngreso;
	}

	public void setAņodeIngreso(int aņodeIngreso) {
		this.aņodeIngreso = aņodeIngreso;
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