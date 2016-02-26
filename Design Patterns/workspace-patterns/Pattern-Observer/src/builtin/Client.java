package builtin;

public class Client {

	public static void main(String[] args) {
		
		Screen screen = new Screen();
		DataStore dataStore = new DataStore();
		dataStore.addObserver(screen);
		dataStore.setData("New Data");
	}
}
