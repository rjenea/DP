package adapter.variation.eckel;

//Approach 4: use an inner class:
public class WhatIHave3 extends WhatIHave {
	private class InnerAdapter implements WhatIWant {
		public void f() {
			g();
			h();
		}
	}

	public WhatIWant whatIWant() {
		return new InnerAdapter();
	}
}