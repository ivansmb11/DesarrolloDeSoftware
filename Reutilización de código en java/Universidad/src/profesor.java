
public class profesor {

	String nombre;
	String apellidos;
	int id;
	String estadoCivil;
	String departamento;
	int añodeIngreso;
	
	public profesor(String nombre, String apellidos, int id, String estadoCivil, String departamento, int añodeIngreso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.estadoCivil = estadoCivil;
		this.departamento = departamento;
		this.añodeIngreso = añodeIngreso;
		
	}



	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil
				+ ", departamento=" + departamento + ", a�odeIngreso=" + añodeIngreso + "]";
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

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
}