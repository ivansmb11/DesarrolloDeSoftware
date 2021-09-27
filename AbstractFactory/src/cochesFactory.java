
public class cochesFactory extends AbstractFactory{
	static int todoT = 0;	
	public coches getRuedas(String ruedas) {
		if(ruedas.equalsIgnoreCase("4")) {
			if ()
				return new SUV;
		} else if (ruedas.equalsIgnoreCase("2")) {
			return new Moto;
		}
		return null;
	}
	@Override
	public coches getPuertas(String puertas) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public coches conducirCalle(String puede) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public coches conducirCampo(String puede) {
		// TODO Auto-generated method stub
		return null;
	}

}
