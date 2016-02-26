package visitor.eckel;

//: visitor:BeeAndFlowers.java
// Demonstration of "visitor" pattern.
import java.util.*;

import org.junit.Test;

public class BeeAndFlowers {
	List<Flower> flowers = new ArrayList<Flower>();

	public BeeAndFlowers() {
		for (int i = 0; i < 10; i++)
			flowers.add(FlowerGenerator.newFlower());
	}
	
	@Test
	public void test() {
		// It's almost as if I had a function to
		// produce a Flower string representation:
		StringVal sval = new StringVal();
		Iterator<Flower> it = flowers.iterator();
		while (it.hasNext()) {
			((Flower) it.next()).accept(sval);
			System.out.println(sval);
		}
		// Perform "Bee" operation on all Flowers:
		Bee bee = new Bee();
		it = flowers.iterator();
		while (it.hasNext())
			((Flower) it.next()).accept(bee);
	}
}