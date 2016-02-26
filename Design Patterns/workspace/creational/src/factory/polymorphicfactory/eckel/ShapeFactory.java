package factory.polymorphicfactory.eckel;

import java.util.HashMap;
import java.util.Map;

public abstract class ShapeFactory {
	protected abstract Shape create();

	private static Map<String, ShapeFactory> factories = new HashMap<String, ShapeFactory>();

	public static void addFactory(String id, ShapeFactory f) {
		factories.put(id, f);
	}

	// A Template Method:
	public static final Shape createShape(String id) {
		if (!factories.containsKey(id)) {
			try {
				// Load dynamically
				Class.forName("factory.polymorphicfactory.eckel." + id);
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Bad shape creation: " + id);
			}
			// See if it was put in:
			if (!factories.containsKey(id))
				throw new RuntimeException("Bad shape creation: " + id);
		}
		return ((ShapeFactory) factories.get(id)).create();
	}
}