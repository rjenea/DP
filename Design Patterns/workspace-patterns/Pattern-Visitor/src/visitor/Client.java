package visitor;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		
		// Build cart
		ShoppingCart shoppingCart = new ShoppingCart();
		
		// Create items and add to list
		Book book = new Book(1, 2);
		CD cd = new CD(1.2, 1.1);
		List<Visitable> items = new ArrayList<Visitable>();
		items.add(book);
		items.add(cd);
		
		// Add items to cart
		shoppingCart.setItems(items);
		double postageCost = shoppingCart.calculatePostage();
		System.out.println("Postage: " + postageCost);
	}
}
