
public class Libro extends Publicacion{
	
	String prestado;
	
	public Libro(int codigo, String titulo, int anoP) {
		super(codigo, titulo, anoP);
		this.prestado = "Disponible.";
	}
	
	public void prestar() {this.prestado = "No Disponible.";}
	
	public String prestado() {return this.prestado;}
	
	public void devolver() {this.prestado = "Disponible.";}
	
	public String toString() {return super.toString()+"\nDisponible? : "+ prestado;}
}
