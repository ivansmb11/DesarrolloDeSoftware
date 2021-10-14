import java.awt.EventQueue;

public class Main extends Window{
	
	public static void main(String[] args) {
		info.llenarAlumnos();
		info.llenarProfes();
		info.llenarPersonal();
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}