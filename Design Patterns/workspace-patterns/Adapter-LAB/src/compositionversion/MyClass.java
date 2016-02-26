package compositionversion;

public class MyClass {

	public static void main(String[] args) {

        testObjectAdapter();
    }
 
    private static void testObjectAdapter() {
    	Socket_120V sockAdapter = new SocketObjectAdapterImpl();        
        System.out.println("Object Adapter providing "+ sockAdapter.get120Volt().getVolts() + " V");
    }
}