package factory.polymorphicfactory.eckel;

//: factory:shapefact2:ShapeFactory2.java
// Polymorphic factory methods.
import java.util.*;

import org.junit.Test;

public class ShapeFactory2 {
	String shlist[] = { "Circle", "Square", "Square", "Circle", "Circle", "Square" };
	List<Shape> shapes = new ArrayList<Shape>();

	@Test
	public void test() {
		// This just makes sure it will complete
		// without throwing an exception.
		Iterator<?> it = Arrays.asList(shlist).iterator();
		while (it.hasNext())
			shapes.add(ShapeFactory.createShape((String) it.next()));
		it = shapes.iterator();
		while (it.hasNext()) {
			Shape s = (Shape) it.next();
			s.draw();
			s.erase();
		}
	}
}
