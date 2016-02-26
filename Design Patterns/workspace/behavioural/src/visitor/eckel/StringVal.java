package visitor.eckel;

// Add the ability to produce a string:
public class StringVal implements Visitor {
	String s;

	public String toString() {
		return s;
	}

	public void visit(Gladiolus g) {
		s = "Gladiolus";
	}

	public void visit(Runuculus r) {
		s = "Runuculus";
	}

	public void visit(Chrysanthemum c) {
		s = "Chrysanthemum";
	}
}