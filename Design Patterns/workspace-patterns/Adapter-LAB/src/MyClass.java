
public class MyClass {

	public static void main(String[] args) {
        
        testClassAdapter();
        testObjectAdapter();
    }
 
    private static void testObjectAdapter() {
    	Socket_120V sockAdapter = new SocketObjectAdapterImpl();        
        System.out.println("Object Adapter providing "+ sockAdapter.get120Volt().getVolts() + " V");
    }
 
    private static void testClassAdapter() {
    	Socket_120V sockAdapter = new SocketClassAdapterImpl();        
        System.out.println("Class Adapter providing "+ sockAdapter.get120Volt().getVolts() + " V");
    }
     
    
}
