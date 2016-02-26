package visitor;

public class PostageVisitor implements Visitor {
	private double totalPostageForCart;

	// collect data about the book
	public void visit(Book book) {
		// assume we have a calculation here related to weight and price
		// free postage for a book over 10
		if (book.getPrice() < 10.0) {
			totalPostageForCart += book.getWeight() * 2;
		}
	}

	public void visit(CD cd) {
		if(cd.getPrice() < 5.0) {
			totalPostageForCart += cd.getWeight() * 1.4;
		}
	}

	// add other visitors here
 	// public void visit(DVD dvd){...}

	// return the internal state
	public double getTotalPostage() {
		return totalPostageForCart;
	}
}
