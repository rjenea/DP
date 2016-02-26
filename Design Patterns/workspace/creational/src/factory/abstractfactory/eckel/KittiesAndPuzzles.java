package factory.abstractfactory.eckel;

// Concrete factories:
public class KittiesAndPuzzles implements GameElementFactory {
	public Player makePlayer() {
		return new Kitty();
	}

	public Obstacle makeObstacle() {
		return new Puzzle();
	}
}