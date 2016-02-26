package burglary_prevention;

public class Television {
	
	public static final int CHANNEL_ONE = 1;
	public static final int CHANNEL_TWO = 2;
	public static final int CHANNEL_THREE = 3;
	public static final int OFF = 0;
	int channel;

	public Television() {
		channel = OFF;
	}
	
	public void one() {
		channel = CHANNEL_ONE;
		System.out.println("TV on Channel 1");
	} 
 
	public void two() {
		channel = CHANNEL_TWO;
		System.out.println("TV on Channel 2");
	}
 
	public void three() {
		channel = CHANNEL_THREE;
		System.out.println("TV on Channel 3");
	}
  
	public void off() {
		channel = OFF;
		System.out.println("TV is off");
	}
  
	public int getChannel() {
		return channel;
	}
}
