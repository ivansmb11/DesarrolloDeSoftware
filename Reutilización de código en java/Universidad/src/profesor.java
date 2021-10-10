
public class profesor {

	String nombre;
	String apellidos;
	int id;
	String estadoCivil;
	String departamento;
	int aņodeIngreso;
	
	public profesor(String nombre, String apellidos, int id, String estadoCivil, String departamento, int aņodeIngreso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.estadoCivil = estadoCivil;
		this.departamento = departamento;
		this.aņodeIngreso = aņodeIngreso;
		
	}



	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil
				+ ", departamento=" + departamento + ", aņodeIngreso=" + aņodeIngreso + "]";
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}