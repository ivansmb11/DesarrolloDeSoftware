
public abstract class Moto implements coches{
	
	public void getRuedas() {
		System.out.println("La moto tiene 2 ruedas.");
	}
	public void getPuertas() {
		System.out.println("La moto tiene 0 puertas.");
	}
	public void conducirCalle() {
		System.out.println("La moto conduce bien por la calle.");
	}
	public void conducirCampo() {
		System.out.println("La moto no conduce bien por el campo, se le reventó la llanta");
	}
}