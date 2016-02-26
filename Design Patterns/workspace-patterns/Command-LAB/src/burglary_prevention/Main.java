package burglary_prevention;

public class Main {

	public static void useRemote() {
		RemoteControl controller = new RemoteControl();
		Curtain curtain = new Curtain();
		OpenCurtain openCurtain = new OpenCurtain(curtain);
		controller.setCommand(openCurtain);
		controller.buttonWasPressed();		
	}
	
	public static void useRemote2() {
		RemoteControl2 controller = new RemoteControl2();
		Television tv = new Television();
		TelevisionToChannel3Command tvToThree = new TelevisionToChannel3Command(tv);
		TelevisionToChannel2Command tvToTwo = new TelevisionToChannel2Command(tv);
		controller.setCommand(0, tvToThree, tvToTwo);
		
		controller.onButtonWasPushed(0);
		controller.undoButtonWasPushed();
	}
	
	// Main is the burglary prevention system.
	public static void main(String[] args) {
		useRemote2();
	}
}
