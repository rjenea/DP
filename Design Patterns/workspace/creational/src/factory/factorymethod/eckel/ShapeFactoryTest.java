package factory.factorymethod.eckel;

// A simple static factory method.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ShapeFactoryTest {
	
	String shlist[] = { "Circle", "Square", "Square", "Circle", "Circle", "Square" };
	List<Shape> shapes = new ArrayList<Shape>();

	@Test
	public void test() {
		Iterator<?> it = Arrays.asList(shlist).iterator();
		while (it.hasNext())
			shapes.add(Shape.factory((String) it.next()));
		it = shapes.iterator();
		while (it.hasNext()) {
			Shape s = (Shape) it.next();
			s.draw();
			s.erase();
		}
	}
}