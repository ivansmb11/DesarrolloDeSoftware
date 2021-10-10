import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Window {

	static JFrame frame;

	public Window() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Cambio del estado civil de una persona.");
		lblNewLabel.setBounds(25, 54, 254, 20);
		panel.add(lblNewLabel);
		
		JButton button1 = new JButton("");
		button1.setBackground(Color.DARK_GRAY);
		button1.setForeground(Color.DARK_GRAY);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioEC window = new cambioEC();
				window.frame2.setVisible(true);
			}
		});
		button1.setBounds(323, 54, 33, 23);
		panel.add(button1);
		
		JButton button4 = new JButton("");
		button4.setForeground(Color.BLACK);
		button4.setBackground(Color.DARK_GRAY);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioDepartamento window = new cambioDepartamento();
				window.frame5.setVisible(true);
			}
		});
		button4.setBounds(323, 159, 33, 23);
		panel.add(button4);
		
		JLabel lblNewLabel_1 = new JLabel("Reasignaci\u00F3n de oficina a Empleado.");
		lblNewLabel_1.setBounds(25, 94, 254, 14);
		panel.add(lblNewLabel_1);
		
		JButton button2 = new JButton("");
		button2.setForeground(Color.DARK_GRAY);
		button2.setBackground(Color.DARK_GRAY);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reasignarOficina window = new reasignarOficina();
				window.frame3.setVisible(true);
			}
		});
		button2.setBounds(323, 88, 33, 23);
		panel.add(button2);
		
		JLabel lblNewLabel_2 = new JLabel("MENU UNIVERSIDAD");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(107, 11, 228, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Inscribir un estudiante en un nuevo curso.");
		lblNewLabel_3.setBounds(25, 130, 272, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cambio de departamento de un profesor.");
		lblNewLabel_4.setBounds(25, 168, 261, 14);
		panel.add(lblNewLabel_4);
		
		JButton button3 = new JButton("");
		button3.setForeground(Color.BLACK);
		button3.setBackground(Color.DARK_GRAY);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioCurso window = new cambioCurso();
				window.frame4.setVisible(true);
				
			}
		});
		button3.setBounds(323, 122, 33, 23);
		panel.add(button3);
		
		JLabel lblNewLabel_5 = new JLabel("Cambio de secci\u00F3n de un empleado.");
		lblNewLabel_5.setBounds(25, 202, 272, 14);
		panel.add(lblNewLabel_5);
		
		JButton button5 = new JButton("");
		button5.setForeground(Color.BLACK);
		button5.setBackground(Color.DARK_GRAY);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cambioSeccion window = new cambioSeccion();
				window.frame6.setVisible(true);
			}
		});
		button5.setBounds(323, 193, 33, 23);
		panel.add(button5);
		
		JLabel lblNewLabel_6 = new JLabel("Imprimir toda la informaci\u00F3n.");
		lblNewLabel_6.setBounds(25, 236, 229, 14);
		panel.add(lblNewLabel_6);
		
		JButton button6 = new JButton("");
		button6.setForeground(Color.BLACK);
		button6.setBackground(Color.DARK_GRAY);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				logic.imprimirTodo();
			}
		});
		button6.setBounds(323, 227, 33, 23);
		panel.add(button6);
	}
}
