package proxy.simple.eckel;

import org.junit.Test;

//: proxy:ProxyDemo.java
// Simple demonstration of the Proxy pattern.

public class ProxyDemo {
	Proxy p = new Proxy();

	@Test
	public void test() {
		// This just makes sure it will complete
		// without throwing an exception.
		p.f();
		p.g();
		p.h();
	}
}