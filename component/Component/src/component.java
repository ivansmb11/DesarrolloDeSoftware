import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

public class component {

	private JFrame frame;
	JLabel lblIfYouClick, lblIllChangeTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					component window = new component();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public component() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnPressMe = new JButton("Press Me!");
		btnPressMe.setBounds(166, 51, 117, 25);
		btnPressMe.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Pressed button 1");
				lblIfYouClick.setText("You pressed the button!!!");
				
			}
		});
		frame.getContentPane().add(btnPressMe);
		
		lblIfYouClick = new JLabel("If you click the button, i'll change.");
		lblIfYouClick.setBounds(100, 102, 293, 15);
		frame.getContentPane().add(lblIfYouClick);
		
		JButton btnPressMe_1 = new JButton("Press Me! 2");
		btnPressMe_1.setBounds(166, 138, 117, 25);
		btnPressMe_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("Pressed button 2");
				lblIllChangeTo.setText("Si presionas este botón, cambiaré a español.");
				
			}
		});
		frame.getContentPane().add(btnPressMe_1);
		
		lblIllChangeTo = new JLabel("I'll change to spanish if you press the button.");
		lblIllChangeTo.setBounds(50, 186, 345, 15);
		frame.getContentPane().add(lblIllChangeTo);
	}
}
