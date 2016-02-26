package command.eckel;

public class IAm implements Command {
	public void execute() {
		System.out.print("I'm the command pattern!");
	}
}