package composite.eckel;

public class Leaf implements Component {
	private String name;

	public Leaf(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void operation() {
		System.out.println(this);
	}
}