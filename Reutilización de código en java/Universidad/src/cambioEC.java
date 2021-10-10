import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class cambioEC extends logic{

	static JFrame frame2;
	private JTextField idTextF;
	private JTextField estadoTextF;
	JOptionPane jo;

	
	public cambioEC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 450, 300);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Cambio de Estado Civil");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(88, 11, 260, 47);
		frame2.getContentPane().add(title);
		
		JLabel label2 = new JLabel("Escribe el nuevo estado civil.");
		label2.setBounds(138, 145, 151, 14);
		frame2.getContentPane().add(label2);
		
		idTextF = new JTextField();
		idTextF.setBounds(128, 114, 163, 20);
		frame2.getContentPane().add(idTextF);
		idTextF.setColumns(10);
		
		JButton button = new JButton("Go!");
		button.setBounds(167, 203, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ids = idTextF.getText();
				int id = Integer.parseInt(ids);
				String estado = estadoTextF.getText();
				logic.cambiarEstadoCivil(id, estado);
				if (exito == 1) {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "Se ha cambiado el estado civil con éxito!","Mensaje",JOptionPane.INFORMATION_MESSAGE);
				} else {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "No se ha encontrado ese ID, intente con otro.","Mensaje",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		frame2.getContentPane().add(button);
		
		JLabel label1 = new JLabel("Introduce el ID de la persona.");
		label1.setBounds(140, 92, 151, 14);
		frame2.getContentPane().add(label1);
		
		estadoTextF = new JTextField();
		estadoTextF.setBounds(128, 170, 161, 20);
		frame2.getContentPane().add(estadoTextF);
		estadoTextF.setColumns(10);
	}
}
