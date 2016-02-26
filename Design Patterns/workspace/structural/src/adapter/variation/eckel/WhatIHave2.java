package adapter.variation.eckel;

// Approach 3: build adapter into WhatIHave:
public class WhatIHave2 extends WhatIHave implements WhatIWant {
	public void f() {
		g();
		h();
	}
}