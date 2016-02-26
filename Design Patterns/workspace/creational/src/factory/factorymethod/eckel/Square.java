package factory.factorymethod.eckel;

public class Square extends Shape {
	Square() {
	} // Package-access constructor

	public void draw() {
		System.out.println("Square.draw");
	}

	public void erase() {
		System.out.println("Square.erase");
	}
}
