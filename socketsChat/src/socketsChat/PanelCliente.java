package socketsChat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.swing.*;


public class PanelCliente extends JPanel implements Runnable {

	private static final long serialVersionUID = 1L;
	private JTextField campoMensaje, campoNombre, campoIp;
	private JTextArea campoChat;
	private JButton enviar;
	private JLabel cliente;
	private EnviarTexto prueba;
	private Thread hilo;

	public PanelCliente() {
		
		campoNombre = new JTextField(6);
		add(campoNombre);
	
		cliente = new JLabel(" | ");
		add(cliente);
		
		campoIp = new JTextField(10);
		add(campoIp);
		
		campoChat = new JTextArea(12, 20);
		campoChat.setEditable(false);
		add(campoChat);
		
		campoMensaje = new JTextField(20);
		add(campoMensaje);	
		
		enviar = new JButton("Send");
		prueba = new EnviarTexto();
		enviar.addActionListener(prueba);
		add(enviar);	
		
		hilo = new Thread(this);
		hilo.start();
	}
	
	private class EnviarTexto implements ActionListener {
		
		private Socket puenteCliente;
		private ObjectOutputStream datosSalida;
		private Usuario usuario1;

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			try {
				puenteCliente  = new Socket("192.168.0.194", 9999);
				
				usuario1 = new Usuario();
				usuario1.setNombre(campoNombre.getText());
				usuario1.setIp(campoIp.getText());
				usuario1.setMensaje(campoMensaje.getText());
				datosSalida = new ObjectOutputStream(puenteCliente.getOutputStream());
				datosSalida.writeObject(usuario1);
				datosSalida.close();
				
				campoMensaje.setText("");
				
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				System.out.println(e1.getMessage());
			}
		}
	}

	@Override
	public void run() {
		
		try {
			
			int puertoDestino = 3233;
			ServerSocket servidor = new ServerSocket(puertoDestino);
			
			while(true) {
				
				Socket puenteServidor  = servidor.accept();
				
				ObjectInputStream datosEntrada = new ObjectInputStream(puenteServidor.getInputStream());
				
				Usuario usuarioRecibido = (Usuario) datosEntrada.readObject();
				
				String nombre = usuarioRecibido.getNombre();
				String ip = usuarioRecibido.getIp();
				String mensaje = usuarioRecibido.getMensaje();
				
				campoChat.append(nombre + ": " + mensaje + " -> " + ip + "\n");
				
				datosEntrada.close();
				
				puenteServidor.close();
			}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
