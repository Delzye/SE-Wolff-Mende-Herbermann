package a19;

public abstract class Gui {
	private static GuiFabrik instance;

	public static void erstelleAwt() {
		Gui.instance = new AWTFabrik();
	}
	
	public static void erstelleSwt() {
		Gui.instance = new SWTFabrik();		
	}
	
	public static GuiFabrik getInstance() {
		if(Gui.instance == null){
			//Default-Framework
			Gui.erstelleAwt();			
		}
	return Gui.instance;
		
	}
}
