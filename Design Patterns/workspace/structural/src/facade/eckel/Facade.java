package facade.eckel;

import org.junit.Test;

// Other classes that aren't exposed
// by the facade go here ...
public class Facade {
	static A makeA(int x) {
		return new A(x);
	}

	static B makeB(long x) {
		return new B(x);
	}

	static C makeC(double x) {
		return new C(x);
	}

	@SuppressWarnings("unused")
	@Test
	public void test() {
		// The client programmer gets the objects
		// by calling the static methods:
		A a = Facade.makeA(1);
		B b = Facade.makeB(1);
		C c = Facade.makeC(1.0);
	}
}