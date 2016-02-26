package dzone;

public class DesktopColleague extends Colleague {
	
	public DesktopColleague(Mediator m) {
		super(m);
	}

	public void receive(String message) {
		System.out.println("Colleague Received: " + message);
	}

}