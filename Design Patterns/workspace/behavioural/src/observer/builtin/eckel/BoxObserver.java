package observer.builtin.eckel;

//: observer:BoxObserver.java
// Demonstration of Observer pattern using
// Java's built-in observer classes.
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class BoxObserver extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4653643428486972102L;
	Observable notifier = new BoxObservable();

	public BoxObserver(int grid) {
		setTitle("Demonstrates Observer pattern");
		Container cp = getContentPane();
		cp.setLayout(new GridLayout(grid, grid));
		for (int x = 0; x < grid; x++)
			for (int y = 0; y < grid; y++)
				cp.add(new OCBox(x, y, notifier));
	}

	public static void main(String[] args) {
		int grid = 8;
		if (args.length > 0)
			grid = Integer.parseInt(args[0]);
		JFrame f = new BoxObserver(grid);
		f.setSize(500, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
