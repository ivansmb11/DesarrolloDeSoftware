
public class tarjetasU {
	
	String Nombre;
	long noTarjeta;
	int fechaE;
	int CVV;
	
	private static tarjetasU tarjetas;
	
	public tarjetasU(String Nombre,long noTarjeta, int fechaE, int CVV){
		this.Nombre = Nombre;
		this.noTarjeta = noTarjeta;
		this.fechaE = fechaE;
		this.CVV = CVV;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public long getNoTarjeta() {
		return noTarjeta;
	}

	public void setNoTarjeta(long noTarjeta) {
		this.noTarjeta = noTarjeta;
	}

	public int getFechaE() {
		return fechaE;
	}

	public void setFechaE(int fechaE) {
		this.fechaE = fechaE;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}
	
	public static tarjetasU getInstance() {
		if (tarjetas == null) {
			tarjetas = new tarjetasU();
		}
		return tarjetas;
	}
	
}
