
public class llamada {
	
	String _tipoLlamada;
	long _numero;
	String _tipoTelefono;
	Double _minutos;
	Double _segundos;
	
	
	public llamada(String tipoTelefono, long numero, String tipoLlamada, Double minutos, Double segundos) {
		
		_tipoTelefono = tipoTelefono;
		_numero = numero;
		_tipoLlamada = tipoLlamada;
		_minutos = minutos;
		_segundos = segundos;
		
	}
	
	//getters
	public String getTipoTelefono() {return _tipoTelefono;}
	public long getNumero() {return _numero;}
	public String getTipoLlamada() {return _tipoLlamada;}
	public Double getMinutos() {return _minutos;}
	public Double getSegundos() {return _segundos;}
	
	//setters
	public void setTipoTelefono(String tipoTelefono) {_tipoTelefono = tipoTelefono;}
	public void setNumero(long numero) {_numero = numero;}
	public void setTipoLlamada(String tipoLlamada) {_tipoLlamada = tipoLlamada;}
	public void setMinutos(Double minutos) {_minutos = minutos;}
	public void setSegundos(Double segundos) {_segundos = segundos;}
	
}
