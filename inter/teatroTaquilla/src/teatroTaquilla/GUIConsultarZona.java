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



public class GUIConsultarZona implements ActionListener {

	JPanel panel, panelMenu;
	JFrame frame;
	JLabel text, zP, zPal, zC, zL;
	static JLabel asientosV;
	static JLabel terceros;
	static JLabel estudiates;
	static JLabel dinero;
	static JButton zonaPrincipal;
	static JButton zonaPalco;
	static JButton zonaCentral;
	static JButton zonaLateral;
	
	public GUIConsultarZona() {
		
		panelMenu = new JPanel();
		panel = new JPanel();
		frame = new JFrame();
		zonaPrincipal = new JButton("< 1 >");
		zonaPalco = new JButton("< 2 >");
		zonaCentral = new JButton("< 3 >");
		zonaLateral = new JButton("< 4 >");
		text = new JLabel("Selecciona una zona para checar su capacidad.");
		zP = new JLabel("Zona Principal.");
		zPal = new JLabel("Zona Palco.");
		zC = new JLabel("Zona Central.");
		zL = new JLabel("Zona Lateral.");
		
		asientosV = new JLabel("Asientos vendidos: ");
		terceros = new JLabel("3ra Edad: ");
		estudiates = new JLabel("Estudiantes: ");
		dinero = new JLabel("Dinero recaudado en esta Zona: ");
		
		zonaPrincipal.addActionListener(new ButtonListenerCZ());
		zonaPalco.addActionListener(new ButtonListenerCZ());
		zonaCentral.addActionListener(new ButtonListenerCZ());
		zonaLateral.addActionListener(new ButtonListenerCZ());
		
		zonaPrincipal = new JButton("< 1 >");
		zonaPalco = new JButton("< 2 >");
		zonaCentral = new JButton("< 3 >");
		zonaLateral = new JButton("< 4 >");
		
		panel.add(zP);
		panel.add(zonaPrincipal);
		panel.add(zPal);
		panel.add(zonaPalco);
		panel.add(zC);
		panel.add(zonaCentral);
		panel.add(zL);
		panel.add(zonaLateral);
		panel.add(asientosV);
		panel.add(terceros);
		panel.add(estudiates);
		panel.add(dinero);
		
		panel.setLayout(new GridLayout(6,2));
		panel.setPreferredSize(new Dimension(550,400));
		
		panelMenu.setLayout(new GridLayout(1,1));
		panelMenu.setPreferredSize(new Dimension(550,100));
		
		panelMenu.add(text);
		
		frame.add(panel, BorderLayout.SOUTH);
		frame.add(panelMenu, BorderLayout.NORTH);
		frame.setSize(550,500);
		frame.setTitle("Teatro de Madrid.");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	private static class ButtonListenerCZ extends logic implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == zonaPrincipal) {
				contarAsientosP();
				asientosV.setText("Asientos vendidos: "+counter);
				
			} else if (e.getSource() == zonaPalco) {
				contarAsientosPal();
				asientosV.setText("Asientos vendidos: "+counter);
				
			} else if (e.getSource() == zonaCentral) {
				contarAsientosC();
				asientosV.setText("Asientos vendidos: "+counter);
				
			} else if (e.getSource() == zonaLateral) {
				contarAsientosL();
				asientosV.setText("Asientos vendidos: "+counter);
			}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
