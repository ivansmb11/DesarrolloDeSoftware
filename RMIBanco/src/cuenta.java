

public class cuenta {
	
	int noCuenta;
	int NIP;
	double saldo;
	
	public cuenta(int noCuenta, int NIP, double saldo) {
		this.noCuenta = noCuenta;
		this.NIP = NIP;
		this.saldo = saldo;
	}

	public int getNoCuenta() {
		return noCuenta;
	}

	public void setNoCuenta(int noCuenta) {
		this.noCuenta = noCuenta;
	}

	public int getNIP() {
		return NIP;
	}

	public void setNIP(int nIP) {
		NIP = nIP;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "cuenta [noCuenta=" + noCuenta + ", NIP=" + NIP + ", saldo=" + saldo + "]";
	}
	
	

}
