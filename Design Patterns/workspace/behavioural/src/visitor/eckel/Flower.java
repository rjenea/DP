package visitor.eckel;

// The Flower hierarchy cannot be changed:
public interface Flower {
	void accept(Visitor v);
}