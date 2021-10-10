import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class cambioDepartamento extends logic{

	static JFrame frame5;
	private JTextField idTextF;
	private JTextField oficinaTextF;
	JOptionPane jo;

	
	public cambioDepartamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame5 = new JFrame();
		frame5.setBounds(100, 100, 450, 300);
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Reasignacion de Departamento");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(42, 11, 340, 47);
		frame5.getContentPane().add(title);
		
		JLabel label2 = new JLabel("Escribe el nuevo departamento.");
		label2.setBounds(128, 145, 161, 14);
		frame5.getContentPane().add(label2);
		
		idTextF = new JTextField();
		idTextF.setBounds(128, 114, 163, 20);
		frame5.getContentPane().add(idTextF);
		idTextF.setColumns(10);
		
		JButton button = new JButton("Go!");
		button.setBounds(167, 203, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ids = idTextF.getText();
				int id = Integer.parseInt(ids);
				String departamento = oficinaTextF.getText();
				logic.reasignarOficina(id, departamento);
				if (exitoR == 1) {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "Se ha cambiado de departamento con �xito!","Mensaje",JOptionPane.INFORMATION_MESSAGE);
					exitoR = 0;
				} else {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "No se ha encontrado ese ID, intente con otro.","Mensaje",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		frame5.getContentPane().add(button);
		
		JLabel label1 = new JLabel("Introduce el ID de la persona.");
		label1.setBounds(140, 92, 151, 14);
		frame5.getContentPane().add(label1);
		
		oficinaTextF = new JTextField();
		oficinaTextF.setBounds(128, 170, 161, 20);
		frame5.getContentPane().add(oficinaTextF);
		oficinaTextF.setColumns(10);
	}
}