package teatroTaquilla;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI2 implements ActionListener {

	static JPanel panel;
	static JFrame frame2;
	static JLabel costo, costo3raEdad, estudiante;
	static JButton button1, button2, button3;

	public static void GUIPRINCIPAL(){
		panel = new JPanel();
		frame2 = new JFrame();
		costo = new JLabel("$2500");
		costo3raEdad= new JLabel("$1750");
		estudiante = new JLabel("¿Eres estudiante?");
		button1 = new JButton("< 1 >");
		button2 = new JButton("< 2 >");
		button3 = new JButton("< 3 >");
		
		button1.addActionListener(new ButtonListener2());
		button2.addActionListener(new ButtonListener2());
		button3.addActionListener(new ButtonListener2());
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(3,2));
		panel.setPreferredSize(new Dimension(550,300));
		
		panel.add(costo);
		panel.add(button1);
		panel.add(costo3raEdad);
		panel.add(button2);
		panel.add(estudiante);
		panel.add(button3);
		
		frame2.add(panel, BorderLayout.CENTER);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(550,500);
		frame2.setTitle("Teatro de Madrid.");
		frame2.pack();
		frame2.setVisible(true);
		
	}
	
	public static void GUIPALCO() {
		panel = new JPanel();
		frame2 = new JFrame();
		costo = new JLabel("$7000");
		costo3raEdad= new JLabel("$4000");
		estudiante = new JLabel("¿Eres estudiante?");
		
		button1 = new JButton("< 1 >");
		button2 = new JButton("< 2 >");
		button3 = new JButton("< 3 >");
		
		button1.addActionListener(new ButtonListener3());
		button2.addActionListener(new ButtonListener3());
		button3.addActionListener(new ButtonListener3());
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(3,2));
		panel.setPreferredSize(new Dimension(550,300));
		
		panel.add(costo);
		panel.add(button1);
		panel.add(costo3raEdad);
		panel.add(button2);
		panel.add(estudiante);
		panel.add(button3);
		
		frame2.add(panel, BorderLayout.CENTER);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(550,500);
		frame2.setTitle("Teatro de Madrid.");
		frame2.pack();
		frame2.setVisible(true);

	}
	public static void GUICENTRAL() {
		panel = new JPanel();
		frame2 = new JFrame();
		costo = new JLabel("$2000");
		costo3raEdad= new JLabel("$1400");
		estudiante = new JLabel("¿Eres estudiante?");
		
		button1 = new JButton("< 1 >");
		button2 = new JButton("< 2 >");
		button3 = new JButton("< 3 >");
		
		button1.addActionListener(new ButtonListener4());
		button2.addActionListener(new ButtonListener4());
		button3.addActionListener(new ButtonListener4());
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(3,2));
		panel.setPreferredSize(new Dimension(550,300));
		
		panel.add(costo);
		panel.add(button1);
		panel.add(costo3raEdad);
		panel.add(button2);
		panel.add(estudiante);
		panel.add(button3);
		
		frame2.add(panel, BorderLayout.CENTER);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(550,500);
		frame2.setTitle("Teatro de Madrid.");
		frame2.pack();
		frame2.setVisible(true);

	}
	public static void GUILATERAL() {
		panel = new JPanel();
		frame2 = new JFrame();
		costo = new JLabel("$1550");
		costo3raEdad= new JLabel("$1000");
		estudiante = new JLabel("¿Eres estudiante?");
		
		button1 = new JButton("< 1 >");
		button2 = new JButton("< 2 >");
		button3 = new JButton("< 3 >");
		
		button1.addActionListener(new ButtonListener5());
		button2.addActionListener(new ButtonListener5());
		button3.addActionListener(new ButtonListener5());
		
		
		panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel.setLayout(new GridLayout(3,2));
		panel.setPreferredSize(new Dimension(550,300));
		
		panel.add(costo);
		panel.add(button1);
		panel.add(costo3raEdad);
		panel.add(button2);
		panel.add(estudiante);
		panel.add(button3);
		
		frame2.add(panel, BorderLayout.CENTER);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(550,500);
		frame2.setTitle("Teatro de Madrid.");
		frame2.pack();
		frame2.setVisible(true);

	}
	

	
	private static class ButtonListener2 extends logic implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			comprarAsientoP();

		}
	}
	
	private static class ButtonListener3 extends logic implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			comprarAsientoPal();

		}
	}
	
	private static class ButtonListener4 extends logic implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			comprarAsientoC();

		}
	}
	
	private static class ButtonListener5 extends logic implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			comprarAsientoL();

		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
