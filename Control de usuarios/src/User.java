
public class User {
	
	String nUsuario;
	String cPassword;
	private static User usuario;
	
	public User(String nUsuario, String cPassword) {
		this.nUsuario=nUsuario;
		this.cPassword=cPassword;
	}
		
	public String getnUsuario() {return nUsuario;}

	public String getcPassword() {return cPassword;}
	
	public static User getInstance() {
		if (usuario == null) {
			usuario = new User("ivannsmb","12345");
		}
		return usuario;
	}
	
}
