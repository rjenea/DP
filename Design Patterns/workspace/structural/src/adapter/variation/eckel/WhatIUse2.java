package adapter.variation.eckel;

// Approach 2: build adapter use into op():
public class WhatIUse2 extends WhatIUse {
	public void op(WhatIHave wih) {
		new SurrogateAdapter(wih).f();
	}
}