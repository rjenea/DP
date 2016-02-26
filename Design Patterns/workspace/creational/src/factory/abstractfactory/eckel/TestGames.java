package factory.abstractfactory.eckel;

import org.junit.Test;

// An example of the Abstract Factory pattern.
public class TestGames {
	GameElementFactory kp = new KittiesAndPuzzles(), kd = new KillAndDismember();
	GameEnvironment g1 = new GameEnvironment(kp), g2 = new GameEnvironment(kd);

	// These just ensure no exceptions are thrown:
	@Test
	public void test1() {
		g1.play();
	}

	@Test
	public void test2() {
		g2.play();
	}
}