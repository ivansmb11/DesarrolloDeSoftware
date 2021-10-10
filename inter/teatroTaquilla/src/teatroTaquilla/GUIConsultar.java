package teatroTaquilla;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GUIConsultar extends logic implements ActionListener{
	
	JTextField idb;
	JPanel panel;
	JFrame frame;
	JLabel text,zona, nombre;
	JButton button;
	static String id;
	
	public GUIConsultar() {
		
		panel = new JPanel();
		frame = new JFrame();
		button = new JButton("Consultar!");
		text = new JLabel("Escribe tu ID para encontrar tu asiento.");
		zona = new JLabel("Zona: ");
		nombre = new JLabel("Nombre: ");
		idb = new JTextField();
		button.addActionListener(this);
		
		panel.setLayout(new GridLayout(5,1));
		panel.setPreferredSize(new Dimension(550,300));
		
		panel.add(text);
		panel.add(idb);
		panel.add(button);
		panel.add(nombre);
		panel.add(zona);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(550,450);
		frame.setTitle("Teatro de Madrid.");
		frame.pack();
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		id = idb.getText();
		Borrar(id);
		imprimirArreglosP();
		
		
		
		
	}
}
