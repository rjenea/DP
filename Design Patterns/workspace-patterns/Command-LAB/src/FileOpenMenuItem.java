import javax.swing.JMenuItem;

public class FileOpenMenuItem extends JMenuItem implements Command {
	public void execute() {
		System.out.println("------------>>>>>> Execute method of the command is Executing ");
	}
}