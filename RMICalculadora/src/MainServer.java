import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class MainServer {

	public static void main(String[] args) throws Exception{

		ServidorImpl server = new ServidorImpl();
		IServer remote = (IServer)UnicastRemoteObject.exportObject(server, 9900);
		
		LocateRegistry.createRegistry(0);
		
		Registry registro = LocateRegistry.getRegistry();
		registro.rebind("remoteServer", remote);
		
		
		
		System.out.println("Servidor listo, Presiona ENTER para terminar.");
		System.in.read();
		
		registro.unbind("remoteServer");
		UnicastRemoteObject.unexportObject(server, true);

	}
}
