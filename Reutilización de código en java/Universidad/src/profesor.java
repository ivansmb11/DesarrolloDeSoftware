
public class profesor {

	String nombre;
	String apellidos;
	int id;
	String estadoCivil;
	String departamento;
	int a�odeIngreso;
	
	public profesor(String nombre, String apellidos, int id, String estadoCivil, String departamento, int a�odeIngreso) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.estadoCivil = estadoCivil;
		this.departamento = departamento;
		this.a�odeIngreso = a�odeIngreso;
		
	}



	@Override
	public String toString() {
		return "profesor [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", estadoCivil=" + estadoCivil
				+ ", departamento=" + departamento + ", a�odeIngreso=" + a�odeIngreso + "]";
	}



	public int getA�odeIngreso() {
		return a�odeIngreso;
	}

	public void setA�odeIngreso(int a�odeIngreso) {
		this.a�odeIngreso = a�odeIngreso;
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