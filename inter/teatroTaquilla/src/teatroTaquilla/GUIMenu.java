package teatroTaquilla;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GUIMenu implements ActionListener {
	
	static JPanel panel, panelM;
	static JFrame frameMenu;
	static JLabel menuPrin, vender, consultar, consultarPzona, cancelar;
	static JButton Bvender, Bconsultar, BconsultarPzona, Bcancelar;
	
	public GUIMenu() {
		
		panelM = new JPanel();
		panel = new JPanel();
		frameMenu = new JFrame();
		Bvender = new JButton("< 1 >");
		Bconsultar = new JButton("< 2 >");
		BconsultarPzona = new JButton("< 3 >");
		Bcancelar = new JButton("< 4 >");
		
		Bvender.addActionListener(new ButtonListenerMenu());
		Bconsultar.addActionListener(new ButtonListenerMenu());
		BconsultarPzona.addActionListener(new ButtonListenerMenu());
		Bcancelar.addActionListener(new ButtonListenerMenu());
		
		menuPrin = new JLabel("Bienvenidos al Menu principal del Teatro de Madrid.");
		vender = new JLabel("Comprar Boletos.");
		consultar = new JLabel("Consultar por ID.");
		consultarPzona = new JLabel("Consultar por zona.");
		cancelar = new JLabel("Cancelar.");
		
		panelM.setLayout(new GridLayout(1,0));
		panel.setLayout(new GridLayout(4,2));
		panelM.setPreferredSize(new Dimension(550,100));
		panel.setPreferredSize(new Dimension(550,300));
		
		panelM.add(menuPrin);
		
		panel.add(vender);
		panel.add(Bvender);
		panel.add(consultar);
		panel.add(Bconsultar);
		panel.add(consultarPzona);
		panel.add(BconsultarPzona);
		panel.add(cancelar);
		panel.add(Bcancelar);
		
		frameMenu.add(panelM, BorderLayout.NORTH);
		frameMenu.add(panel,BorderLayout.SOUTH);
		frameMenu.setSize(550,450);
		frameMenu.setTitle("Teatro de Madrid.");
		frameMenu.pack();
		frameMenu.setVisible(true);
		
	}
	
	private static class ButtonListenerMenu implements ActionListener {

		public void actionPerformed(ActionEvent e) {
				if(e.getSource() == Bvender) {
					new GUI();
				} else if(e.getSource() == Bconsultar) {
					new GUIConsultar();
				} else if (e.getSource() == BconsultarPzona) {
					new GUIConsultarZona();
				} else if (e.getSource() == Bcancelar) {
					new GUICancelar();
				}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
