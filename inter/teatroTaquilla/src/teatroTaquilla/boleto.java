package teatroTaquilla;

public class boleto {
	
	boolean ocupado;
	String id;
	String nombre;
	double precio;
	String zona;
	
	public boleto(boolean ocupado, String id, String nombre,double precio, String zona) {
		this.ocupado = ocupado;
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.zona = zona;
		
		
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public String toString() {
		return "boleto [ocupado=" + ocupado +" id= "+id+ "]";
	}
	
	
}
