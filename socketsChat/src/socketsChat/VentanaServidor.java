package socketsChat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.*;


public class VentanaServidor extends JFrame implements Runnable {
	
	private static final long serialVersionUID = 1L;
	private	JTextArea textoServidor;
	private JPanel panelServidor; 
	private Thread hilo;
	private int puerto, puertoDestino;
	
	public VentanaServidor() {
		
		puerto = 3232;
		
		setBounds(1200,300,300,350);
		
		textoServidor = new JTextArea();
		textoServidor.setEditable(false);
		textoServidor.setBackground(new Color(169, 197, 235));
		
		panelServidor = new JPanel();
		panelServidor.setLayout(new BorderLayout());
		panelServidor.add(textoServidor,BorderLayout.CENTER);
		setTitle("iDiego Nube");
		setVisible(true);
		add(panelServidor);
		
		hilo = new Thread(this);
		hilo.start();
	}

	@Override
	public void run() {
		
		try {
			ServerSocket servidor = new ServerSocket(puerto);
			
			while(true) {
			
				Socket puenteServidor  = servidor.accept();
				
				ObjectInputStream datosEntrada = new ObjectInputStream(puenteServidor.getInputStream());
				
				Usuario usuarioRecibido = (Usuario) datosEntrada.readObject();
				
				String nombre = usuarioRecibido.getNombre();
				String ip = usuarioRecibido.getIp();
				String mensaje = usuarioRecibido.getMensaje();
				
				textoServidor.append(nombre + ": " + mensaje + " -> " + ip + "\n");
				
				puertoDestino = 3233;
				
				Socket enviarDestinatario = new Socket(ip, puertoDestino);
				
				ObjectOutputStream datosEnvio = new ObjectOutputStream(enviarDestinatario.getOutputStream());
				
				datosEnvio.writeObject(usuarioRecibido);
				
				datosEnvio.close();
				
				enviarDestinatario.close();
				
				puenteServidor.close();
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	
}
