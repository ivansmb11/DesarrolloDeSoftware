
public abstract class Sedan implements coches{
	
	public void getRuedas() {
		System.out.println("El sedán tiene 4 ruedas.");
	}
	public void getPuertas() {
		System.out.println("El sedán tiene 4 puertas.");
	}
	public void conducirCalle() {
		System.out.println("El sedán conduce bien por la calle.");
	}
	public void conducirCampo() {
		System.out.println("El sedán no conduce bien por el campo, se le reventó la llanta");
	}
}
