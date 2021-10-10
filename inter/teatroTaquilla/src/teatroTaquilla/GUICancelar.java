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

public class GUICancelar extends logic implements ActionListener{
	
	JPanel panel;
	JFrame frame;
	JButton button;
	JLabel text;
	JTextField idb;
	static String id;
	
	public GUICancelar() {
		panel = new JPanel();
		frame = new JFrame();
		button = new JButton("Cancelar!");
		text = new JLabel("Escribe tu ID para cancelar tu asiento.");
		idb = new JTextField();
		button.addActionListener(this);
		
		panel.setLayout(new GridLayout(5,1));
		panel.setPreferredSize(new Dimension(550,300));
		
		panel.add(text);
		panel.add(idb);
		panel.add(button);

		frame.add(panel, BorderLayout.CENTER);
		frame.setSize(550,450);
		frame.setTitle("Teatro de Madrid.");
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
