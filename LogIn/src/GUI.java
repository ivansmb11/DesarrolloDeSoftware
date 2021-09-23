import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends Main implements ActionListener {
	LocalDateTime dt = LocalDateTime.now();
	JPanel jp;
	JFrame jf;
	JButton jb;
	JLabel welcome, usr, pwd;
	JTextField usrT, pwdT;
	JOptionPane jo;

	public GUI(){
		//first frame
		jp = new JPanel();
		jf = new JFrame();
		jb = new JButton("Log In!!!");
		jb.addActionListener(this);
		welcome = new JLabel("Welcome to my Log In simulator.");
		usr = new JLabel("Usuario");
		pwd = new JLabel("Contraseña");
		usrT = new JTextField();
		pwdT = new JTextField();

		jp.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		jp.setLayout(new GridLayout(6,1));
		jp.setPreferredSize(new Dimension(550,450));
		jp.add(welcome);
		jp.add(usr);
		jp.add(usrT);
		jp.add(pwd);
		jp.add(pwdT);
		jp.add(jb);
		
		jf.add(jp, BorderLayout.CENTER);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(550,450);
		jf.setTitle("Log In");
		jf.pack();
		jf.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (usrT.getText().equals(usuario.getnUsuario()) && pwdT.getText().equals(usuario.getcPassword())) {
			System.out.println("El usuario "+usuario.getnUsuario()+" inició sesión: "+dt.getHour()+":"+dt.getMinute()+":"+dt.getSecond()+".");
			jf.dispose();
			jo = new JOptionPane();
			JOptionPane.showMessageDialog(null, "Log in Succesful.","Log In Message",JOptionPane.INFORMATION_MESSAGE);
		} else {
			jo = new JOptionPane();
			JOptionPane.showMessageDialog(null, "Error during Log in.","Log In Message",JOptionPane.ERROR_MESSAGE);
		}
		
		
		
	}
}