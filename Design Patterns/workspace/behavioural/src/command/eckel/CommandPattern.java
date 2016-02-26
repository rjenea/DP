package command.eckel;

import org.junit.Test;

public class CommandPattern {
	Macro macro = new Macro();

	@Test
	public void test() {
		macro.add(new Hello());
		macro.add(new World());
		macro.add(new IAm());
		macro.run();
	}
} 