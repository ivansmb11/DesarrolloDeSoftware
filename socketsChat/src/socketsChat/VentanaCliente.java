package socketsChat;

import javax.swing.JFrame;


public class VentanaCliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private PanelCliente panelCliente;

	public VentanaCliente() {
		
		setBounds(600,300,300,350);
		panelCliente = new PanelCliente();
		add(panelCliente);
		setTitle("iDiego Chat");
		setVisible(true);
	}	
	
	
}