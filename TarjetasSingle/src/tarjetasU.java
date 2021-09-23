public class tarjetasU {
	
	String Nombre;
	String noTarjeta;
	String fechaE;
	String CVV;
	
	private static tarjetasU tarjetas;
	
	public tarjetasU(String Nombre,String noTarjeta, String fechaE, String CVV){
		this.Nombre = Nombre;
		this.noTarjeta = noTarjeta;
		this.fechaE = fechaE;
		this.CVV = CVV;
		
	}

	public String getNombre() {
		return Nombre;
	}

	public String getNoTarjeta() {
		return noTarjeta;
	}

	public String getFechaE() {
		return fechaE;
	}

	public String getCVV() {
		return CVV;
	}
	
	public static tarjetasU getInstance() {
		if (tarjetas == null) {
			tarjetas = new tarjetasU("","","","");
		}
		return tarjetas;
	}
	
	public String toString() {
		return ("Tu tarjeta es: "+getNombre()+" ... "+getNoTarjeta()+" ... "+getFechaE()+" ... "+getCVV()+".");
	}
	
}