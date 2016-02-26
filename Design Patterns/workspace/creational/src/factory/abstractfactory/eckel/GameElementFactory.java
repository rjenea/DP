package factory.abstractfactory.eckel;

// The Abstract Factory:
public interface GameElementFactory {
	Player makePlayer();

	Obstacle makeObstacle();
}