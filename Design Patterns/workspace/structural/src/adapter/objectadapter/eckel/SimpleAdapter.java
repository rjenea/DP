package adapter.objectadapter.eckel;

import org.junit.Test;

//: adapter:SimpleAdapter.java
// "Object Adapter" from GoF diagram
public class SimpleAdapter {
	Adaptee a = new Adaptee();
	Target t = new Adapter(a);

	@Test
	public void test() {
		t.request();
	}
}