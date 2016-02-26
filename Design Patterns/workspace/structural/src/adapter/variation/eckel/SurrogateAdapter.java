package adapter.variation.eckel;

public class SurrogateAdapter implements WhatIWant {
	WhatIHave whatIHave;

	public SurrogateAdapter(WhatIHave wih) {
		whatIHave = wih;
	}

	public void f() {
		// Implement behavior using
		// methods in WhatIHave:
		whatIHave.g();
		whatIHave.h();
	}
}