package visitor.eckel;

public class Gladiolus implements Flower {
	public void accept(Visitor v) {
		v.visit(this);
	}
}