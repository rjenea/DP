package burglary_prevention;

public class TelevisionToChannel2Command implements Command {

	Television tv;
	int previousChannel;
	
	public TelevisionToChannel2Command(Television tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		previousChannel = tv.getChannel();
		tv.two();
	}

	@Override
	public void undo() {
		if(previousChannel == Television.CHANNEL_ONE) {
			tv.one();
		} else if (previousChannel == Television.CHANNEL_TWO) {
			tv.two();
		} else if (previousChannel == Television.CHANNEL_THREE) {
			tv.three();
		} else if (previousChannel == Television.OFF) {
			tv.off();
		}
	}
}