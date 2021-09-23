package asientos;

public class personas {
	
	public static String getTaken;
	String _taken;
	String _name;
	String _socialN;
	
	public personas(String taken, String name, String socialN) {
		
		_taken = taken;
		_name = name;
		_socialN = socialN;
		
	}
	
	//getters
	public String getTaken() {return _taken;}
	public String getName() {return _name;}
	public String getSocialN() {return _socialN;}
	
	//setters
	public void setTaken(String taken) {_taken = taken;}
	public void setName(String name) {_name = name;}
	public void setSocialN(String socialN) {_socialN = socialN;}
	
	public String toString() {
		return("Seat information \nSeat taken: "+getTaken() + "\nPassenger name: "+getName() + "\nSocial number: "+getSocialN());
		
	}

}
