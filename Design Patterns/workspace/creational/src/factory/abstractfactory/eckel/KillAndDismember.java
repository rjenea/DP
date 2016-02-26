package factory.abstractfactory.eckel;

public class KillAndDismember implements GameElementFactory {
	public Player makePlayer() {
		return new KungFuGuy();
	}

	public Obstacle makeObstacle() {
		return new NastyWeapon();
	}
}