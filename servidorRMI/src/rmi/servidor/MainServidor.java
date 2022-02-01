package rmi.servidor;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import rmi.common.*;

public class MainServidor {
	public static void main(String[] args) throws Exception {
		ServidorImpl servidor = new ServidorImpl();
		IServidor remote = (IServidor)UnicastRemoteObject.exportObject(servidor, 2222);
		
		LocateRegistry.createRegistry(0);
		
		Registry registry = LocateRegistry.getRegistry();
		registry.rebind("remoteServidor", remote);
		//System.setProperty("java.rmi.server.hostname","127.0.0.1");
		
		System.out.println("Servidor listo, Enter para terminar");
		System.in.read();
		
		registry.unbind("remoteServidor");
		UnicastRemoteObject.unexportObject(servidor, true);
	}
}