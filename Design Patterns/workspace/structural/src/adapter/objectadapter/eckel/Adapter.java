package adapter.objectadapter.eckel;

public class Adapter extends Target {
	private Adaptee adaptee;

	public Adapter(Adaptee a) {
		adaptee = a;
	}

	public void request() {
		adaptee.specificRequest();
	}
}