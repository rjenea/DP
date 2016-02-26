package burglary_prevention;

public class OpenCurtain implements Command {
	
	Curtain curtain;
	
	public OpenCurtain(Curtain curtain) {
		this.curtain = curtain;
	}

	@Override
	public void execute() {
		curtain.openCurtain();
	}
}