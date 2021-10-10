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
import javax.swing.JTextField;

public class GUI implements ActionListener {

	JPanel panel,panel2;
	JFrame frame;
	JButton jb1, jb2, jb3, jb4;
	JLabel welcome, msg, a1, a2, a3, a4;

	public GUI(){

		
		panel2 = new JPanel();
		panel = new JPanel();
		frame = new JFrame();
		jb1 = new JButton("< 1 >");
		jb2 = new JButton("< 2 >");
		jb3 = new JButton("< 3 >");
		jb4 = new JButton("< 4 >");
		
		
		jb1.addActionListener(new ButtonListener());
		jb2.addActionListener(new ButtonListener());
		jb3.addActionListener(new ButtonListener());
		jb4.addActionListener(new ButtonListener());
		welcome = new JLabel("Sistema de compra de boletos del Teatro de Madrid.");
		msg = new JLabel("¿En qué zona desea sentarse?");
		a1 = new JLabel("    PRINCIPAL $2500 / $1750.");
		a2 = new JLabel("    PALCO     $7000 / $4000.");
		a3 = new JLabel("    CENTRAL   $2000 / $1400.");
		a4 = new JLabel("    LATERAL   $1550 / $1000.");
		

		panel.setLayout(new GridLayout(2,0));
		panel2.setLayout(new GridLayout(4,2));
		panel.setPreferredSize(new Dimension(550,100));
		panel2.setPreferredSize(new Dimension(550,300));
		panel.add(welcome);
		panel.add(msg);
		

		panel2.add(a1);
		panel2.add(jb1);
		panel2.add(a2);
		panel2.add(jb2);
		panel2.add(a3);
		panel2.add(jb3);
		panel2.add(a4);
		panel2.add(jb4);
		
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(panel2,BorderLayout.SOUTH);
		frame.setSize(550,450);
		frame.setTitle("Teatro de Madrid.");
		frame.pack();
		frame.setVisible(true);
		
	}

	private class ButtonListener extends GUI2 implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == jb1) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				GUI2.GUIPRINCIPAL();
				System.out.println("button Pressed jb1");
			} else if (e.getSource() == jb2) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				GUI2.GUIPALCO();
				System.out.println("button Pressed jb2");
			} else if (e.getSource() == jb3) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				GUI2.GUICENTRAL();
				System.out.println("button Pressed jb3");
			}
			else if (e.getSource() == jb4) {
				frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
				GUI2.GUILATERAL();
				System.out.println("button Pressed jb4");
			}

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}