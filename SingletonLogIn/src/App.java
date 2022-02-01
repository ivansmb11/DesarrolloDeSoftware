
public class App {
	
	public static App app();
	
	private App() {
		
	}
	
	public static App getInstance() {
		if(null == app) {
			app = new App();
		}
		
		return app;
	}

}
