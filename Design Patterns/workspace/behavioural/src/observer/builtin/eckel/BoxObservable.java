package observer.builtin.eckel;

import java.util.Observable;

// You must inherit a new type of Observable:
public class BoxObservable extends Observable {
	public void notifyObservers(Object b) {
		// Otherwise it won't propagate changes:
		setChanged();
		super.notifyObservers(b);
	}
}