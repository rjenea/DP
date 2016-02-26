package builtin;

import java.util.Observable;

public class DataStore extends Observable {

	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
		// mark the observable as changed
		setChanged();
		notifyObservers();
	}

	@Override
	public String toString() {
		return "DataStore [data=" + data + "]";
	}
}
