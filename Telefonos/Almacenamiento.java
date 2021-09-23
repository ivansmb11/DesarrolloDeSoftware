
public class Almacenamiento extends menuLlamadas{
	
	static llamada DB[] = new llamada[100];
	static int contadorDeLlamadas = 0;
	static int contadorFijas;
	static int contadorCelular;
	static int contadorVozIP;
	
	static int contadorLocal;
	static int contadorLarga;
	static int contadorCelularL;
	
	static Double MinutosFijas = 0.0;
	static Double MinutosCelular = 0.0;
	static Double MinutosVozIP = 0.0;
	static Double SegundosFijas = 0.0;
	static Double SegundosCelular = 0.0;
	static Double SegundosVozIP = 0.0;
	
	static Double MinutosTotales = 0.0;
	static Double SegundosTotales = 0.0;
	
	static Double FmL = 0.0;
	static Double FsL = 0.0;
	static Double FmLD = 0.0;
	static Double FsLD = 0.0;
	static Double FmC = 0.0;
	static Double FsC = 0.0;
	
	static Double CmL = 0.0;
	static Double CsL = 0.0;
	static Double CmC = 0.0;
	static Double CsC = 0.0;
	
	static Double VmL = 0.0;
	static Double VsL = 0.0;
	static Double VmLD = 0.0;
	static Double VsLD = 0.0;
	static Double VmC = 0.0;
	static Double VsC = 0.0;
	
	static Double SaldoCelular = 50.0;
	static Double SaldoVozIP = 100.0;
	
	public static void addAlmacenamiento() {
		llamada call = new llamada(TT,Num,TL,minutos,segundos);
		DB[contadorDeLlamadas]= call;
		
		if (DB[contadorDeLlamadas].getTipoTelefono().equals("Fija")) {
			contadorFijas++;
			MinutosFijas = DB[contadorDeLlamadas].getMinutos() + MinutosFijas;
			SegundosFijas = DB[contadorDeLlamadas].getSegundos() + SegundosFijas;
			if(DB[contadorDeLlamadas].getTipoLlamada().equals("Local")) {
				
				FmL = DB[contadorDeLlamadas].getMinutos() + FmL;
				FsL = DB[contadorDeLlamadas].getSegundos() + FsL;
				
			}
			else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Larga Distancia")){
				
				FmLD = DB[contadorDeLlamadas].getMinutos() + FmLD;
				FsLD = DB[contadorDeLlamadas].getSegundos() + FsLD;
				
			}
			else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Celular")) {
				
				FmC = DB[contadorDeLlamadas].getMinutos() + FmC;
				FsC = DB[contadorDeLlamadas].getSegundos() +FsC;
				
			}
		}
		else if (DB[contadorDeLlamadas].getTipoTelefono().equals("Celular")) {
			contadorCelular++;
			MinutosCelular = DB[contadorDeLlamadas].getMinutos() + MinutosCelular;
			SegundosCelular = DB[contadorDeLlamadas].getSegundos() + SegundosCelular;
			if(DB[contadorDeLlamadas].getTipoLlamada().equals("Local")) {
				
				CmL = DB[contadorDeLlamadas].getMinutos() + CmL;
				CsL = DB[contadorDeLlamadas].getSegundos() + CsL;
				
			}
			else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Celular")) {
				
				CmC = DB[contadorDeLlamadas].getMinutos() + CmC;
				CsC = DB[contadorDeLlamadas].getSegundos() +CsC;
				
			}
			
		}
		else if (DB[contadorDeLlamadas].getTipoTelefono().equals("VozIP")) {
			contadorVozIP++;
			MinutosVozIP = DB[contadorDeLlamadas].getMinutos() + MinutosVozIP;
			SegundosVozIP = DB[contadorDeLlamadas].getSegundos() + SegundosVozIP;
			if(DB[contadorDeLlamadas].getTipoLlamada().equals("Local")) {
				
				VmL = DB[contadorDeLlamadas].getMinutos() + VmL;
				VsL = DB[contadorDeLlamadas].getSegundos() + VsL;
				
			}
			else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Larga Distancia")){
				
				VmLD = DB[contadorDeLlamadas].getMinutos() + VmLD;
				VsLD = DB[contadorDeLlamadas].getSegundos() + VsLD;
				
			}
			else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Celular")) {
				
				VmC = DB[contadorDeLlamadas].getMinutos() + VmC;
				VsC = DB[contadorDeLlamadas].getSegundos() +VsC;
				
			}
		}
		//nextIf
		if (DB[contadorDeLlamadas].getTipoLlamada().equals("Local")) {
			contadorLocal++;
		}
		else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Larga Distancia")) {
			contadorLarga++;
		}
		else if (DB[contadorDeLlamadas].getTipoLlamada().equals("Celular")) {
			contadorCelularL++;
		}
		
		
		
		MinutosTotales = DB[contadorDeLlamadas].getMinutos() + MinutosTotales;
		SegundosTotales = DB[contadorDeLlamadas].getSegundos() + SegundosTotales;
		
		contadorDeLlamadas = contadorDeLlamadas + 1;
		
	}
	

	
	public static void infoFijo() {
		System.out.println("En el telefono fijo se realizaron las siguientes operaciones.");
		
		System.out.println("TOTAL DE LLAMADAS: "+contadorFijas);
		
		Double NFsL = FsL/60;
		Double TFmsL = (FmL+NFsL);
		System.out.println("Total de minutos en llamadas locales: "+TFmsL);
		Double fijoTarifaL = TFmsL;
		System.out.println("La tarifa por llamadas locales fue: "+ fijoTarifaL+" pesos.");
		
		Double NFsLD = FsLD/60;
		Double TmsF = (FmLD+NFsLD);
		System.out.println("Total de minutos en llamadas de larga distancia: "+TmsF);
		Double fijoTarifaLD = TmsF*1.5;
		System.out.println("La tarifa por llamadas de larga distancia fue: "+ fijoTarifaLD+" pesos.");
		
		Double NFsC = FsC/60;
		Double TFmsC = (FmC+NFsC);
		System.out.println("Total de minutos en llamadas a celulares: "+TFmsC);
		Double fijoTarifaC = TFmsC*2;
		System.out.println("La tarifa por llamadas de celular fue: "+ fijoTarifaC+" pesos.");
	}
	
	public static void infoCelular() {
		System.out.println("En el telefono calular se realizaron las siguientes operaciones.");
		
		System.out.println("TOTAL DE LLAMADAS: "+contadorCelular);
		
		Double NCsL = CsL/60;
		Double TCmsL = (CmL+NCsL);
		System.out.println("Total de minutos en llamadas locales: "+TCmsL);
		Double celularTarifaL = TCmsL*2;
		System.out.println("La tarifa por llamadas locales fue: "+ celularTarifaL+" pesos.");
		
		Double NCsC = CsC/60;
		Double TCmsC = (CmC+NCsC);
		System.out.println("Total de minutos en llamadas a celulares: "+TCmsC);
		Double celularTarifaC = TCmsC*4;
		System.out.println("La tarifa por llamadas de celular fue: "+ celularTarifaC+" pesos.");
		
		SaldoCelular = SaldoCelular-celularTarifaL-celularTarifaC;
		System.out.println(SaldoCelular);
		
	}
	public static void infoVozIP() {
		System.out.println("En el telefono fijo se realizaron las siguientes operaciones.");
		
		System.out.println("TOTAL DE LLAMADAS: "+contadorVozIP);
		
		Double NVsL = VsL/60;
		Double TVmsL = (VmL+NVsL);
		System.out.println("Total de minutos en llamadas locales: "+TVmsL);
		Double vozTarifaL = TVmsL*1.5;
		System.out.println("La tarifa por llamadas locales fue: "+ vozTarifaL+" pesos.");
		
		Double NVsLD = VsLD/60;
		Double TVmsLD = (VmLD+NVsLD);
		System.out.println("Total de minutos en llamadas de larga distancia: "+TVmsLD);
		Double vozTarifaLD = TVmsLD*0.8;
		System.out.println("La tarifa por llamadas de larga distancia fue: "+ vozTarifaLD+" pesos.");
		
		Double NVsC = VsC/60;
		Double TVmsC = (VmC+NVsC);
		System.out.println("Total de minutos en llamadas a celulares: "+TVmsC);
		Double vozTarifaC = TVmsC*0.7;
		System.out.println("La tarifa por llamadas de celular fue: "+ vozTarifaC+" pesos.");
		
		SaldoVozIP = SaldoVozIP-vozTarifaL-vozTarifaLD-vozTarifaC;
		System.out.println(SaldoVozIP);
	}
	
}
