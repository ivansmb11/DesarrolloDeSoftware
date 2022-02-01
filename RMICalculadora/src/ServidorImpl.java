import rmi.common.*;

public class ServidorImpl implements IServer{
	
	public double Suma(int num1, int num2) {
		return(num1+num2);
	}
	
	public double Resta(int num1, int num2) {
		return(num1-num2);
	}

}
