import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class reasignarOficina extends logic{

	static JFrame frame3;
	private JTextField idTextF;
	private JTextField oficinaTextF;
	JOptionPane jo;

	
	public reasignarOficina() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame3 = new JFrame();
		frame3.setBounds(100, 100, 450, 300);
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Reasignacion de Oficina");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(88, 11, 260, 47);
		frame3.getContentPane().add(title);
		
		JLabel label2 = new JLabel("Escribe la nueva oficina/area.");
		label2.setBounds(138, 145, 151, 14);
		frame3.getContentPane().add(label2);
		
		idTextF = new JTextField();
		idTextF.setBounds(128, 114, 163, 20);
		frame3.getContentPane().add(idTextF);
		idTextF.setColumns(10);
		
		JButton button = new JButton("Go!");
		button.setBounds(167, 203, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ids = idTextF.getText();
				int id = Integer.parseInt(ids);
				String oficina = oficinaTextF.getText();
				logic.reasignarOficina(id, oficina);
				if (exitoR == 1) {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "Se ha cambiado de oficina con éxito!","Mensaje",JOptionPane.INFORMATION_MESSAGE);
					exitoR = 0;
				} else {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "No se ha encontrado ese ID, intente con otro.","Mensaje",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		frame3.getContentPane().add(button);
		
		JLabel label1 = new JLabel("Introduce el ID de la persona.");
		label1.setBounds(140, 92, 151, 14);
		frame3.getContentPane().add(label1);
		
		oficinaTextF = new JTextField();
		oficinaTextF.setBounds(128, 170, 161, 20);
		frame3.getContentPane().add(oficinaTextF);
		oficinaTextF.setColumns(10);
	}
}