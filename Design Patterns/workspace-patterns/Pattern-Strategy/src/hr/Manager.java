package hr;

public class Manager extends Employee {

	public Manager(String surname, float salary) {
		super(surname, salary);
		// Create with implicit work behaviour
		setWorkBehaviour(new StandardWorkBehaviour());
	}
}