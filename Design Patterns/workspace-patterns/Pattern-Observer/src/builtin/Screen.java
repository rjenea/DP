package builtin;

import java.util.Observable;
import java.util.Observer;

public class Screen implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Update: " + o);
	}

}
