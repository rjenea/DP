package command.eckel;

public class Hello implements Command {
	public void execute() {
		System.out.print("Hello ");
	}
}