package classversion;

public class MyClass {

	public static void main(String[] args) {

		testClassAdapter();
	}

	private static void testClassAdapter() {
		Socket_120V sockAdapter = new SocketClassAdapterImpl();
		System.out.println("Class Adapter providing "
				+ sockAdapter.get120Volt().getVolts() + " V");
	}

}
