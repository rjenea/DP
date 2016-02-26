package composite.eckel;

import java.util.ArrayList;
import java.util.Iterator;

public class Node extends ArrayList<Object> implements Component {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3922780958204214248L;
	private String name;

	public Node(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

	public void operation() {
		System.out.println(this);
		for (Iterator<?> it = iterator(); it.hasNext();)
			((Component) it.next()).operation();
	}
}