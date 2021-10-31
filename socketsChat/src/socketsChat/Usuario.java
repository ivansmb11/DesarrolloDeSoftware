package socketsChat;

import java.io.Serializable;


public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nombre, ip, mensaje;

	public String getNombre() {
		
		return nombre;
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}

	public String getIp() {
		
		return ip;
	}

	public void setIp(String ip) {
		
		this.ip = ip;
	}

	public String getMensaje() {
		
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		
		this.mensaje = mensaje;
	}
	
	
}