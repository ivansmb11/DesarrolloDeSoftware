
public class Revista extends Publicacion {
	
	int numero;
	
	public Revista(int codigo, String titulo, int anoP, int numero) {
		super(codigo, titulo, anoP);
		this.numero = numero;
	}
	
	public String toString() {return super.toString()+"\nNúmero: "+ numero;}
}
