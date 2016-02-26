package command.eckel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// An object that holds commands:
public class Macro {
	private List<Command> commands = new ArrayList<Command>();

	public void add(Command c) {
		commands.add(c);
	}

	public void run() {
		Iterator<Command> it = commands.iterator();
		while (it.hasNext())
			((Command) it.next()).execute();
	}
}