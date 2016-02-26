package visitor.eckel;

public class Chrysanthemum implements Flower {
	public void accept(Visitor v) {
		v.visit(this);
	}
}