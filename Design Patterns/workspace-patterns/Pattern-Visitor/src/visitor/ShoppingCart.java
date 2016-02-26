package visitor;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ShoppingCart {

	private List<Visitable> items;
	
	public void setItems(List<Visitable> items) {
		this.items = items;
	}

	public double calculatePostage() {
		// Create and use visitor
		PostageVisitor visitor = new PostageVisitor();
		for (Visitable item : items) {
			item.accept(visitor);
		}
		double postage = visitor.getTotalPostage();
		return postage;
	}
}