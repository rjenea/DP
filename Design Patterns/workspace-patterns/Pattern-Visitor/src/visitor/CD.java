package visitor;

//concrete element 
public class CD implements Visitable {
	private double price;
	private double weight;
	
	CD(double price, double weight) {
		this.price = price;
		this.weight = weight;
	}

	// accept the visitor
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}
}