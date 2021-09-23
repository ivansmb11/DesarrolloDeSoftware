
public class Publicacion {
	
	int codigo;
	String titulo;
	int anoP;
	
	public Publicacion(int codigo, String titulo, int anoP) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.anoP = anoP;
	}
	


	public int getCodigo() {return codigo;}
	public String getTitulo() {return titulo;}
	public int getAnoP() {return anoP;}
	
	public void setCodigo(int codigo) {this.codigo = codigo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public void setAnoP(int anoP) {this.anoP = anoP;}
	
	public String toString() {
		return ("Código: "+getCodigo()+"\nTítulo: "+getTitulo()+"\nAño de publicación: "+getAnoP());
	}
	
}
