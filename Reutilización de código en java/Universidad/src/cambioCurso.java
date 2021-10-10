import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class cambioCurso extends logic{

	static JFrame frame4;
	private JTextField idTextF;
	private JTextField cursoTextF;
	JOptionPane jo;

	
	public cambioCurso() {
		initialize();
	}

	private void initialize() {
		frame4 = new JFrame();
		frame4.setBounds(100, 100, 450, 300);
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.getContentPane().setLayout(null);
		
		JLabel title = new JLabel("Cambio de Curso");
		title.setFont(new Font("Tahoma", Font.PLAIN, 24));
		title.setBounds(115, 11, 187, 47);
		frame4.getContentPane().add(title);
		
		JLabel label2 = new JLabel("Escribe el nuevo curso.");
		label2.setBounds(151, 145, 151, 14);
		frame4.getContentPane().add(label2);
		
		idTextF = new JTextField();
		idTextF.setBounds(128, 114, 163, 20);
		frame4.getContentPane().add(idTextF);
		idTextF.setColumns(10);
		
		JButton button = new JButton("Go!");
		button.setBounds(167, 203, 89, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ids = idTextF.getText();
				int id = Integer.parseInt(ids);
				String curso = cursoTextF.getText();
				logic.cambiodeCurso(id, curso);
				if (exitoC == 1) {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "Se ha cambiado el curso del alumno con éxito!","Mensaje",JOptionPane.INFORMATION_MESSAGE);
				} else {
					jo = new JOptionPane();
					JOptionPane.showMessageDialog(null, "No se ha encontrado ese ID, intente con otro.","Mensaje",JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		frame4.getContentPane().add(button);
		
		JLabel label1 = new JLabel("Introduce el ID del alumno.");
		label1.setBounds(140, 92, 151, 14);
		frame4.getContentPane().add(label1);
		
		cursoTextF = new JTextField();
		cursoTextF.setBounds(128, 170, 161, 20);
		frame4.getContentPane().add(cursoTextF);
		cursoTextF.setColumns(10);
	}
}