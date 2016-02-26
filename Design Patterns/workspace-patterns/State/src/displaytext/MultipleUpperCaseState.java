package displaytext;

public class MultipleUpperCaseState implements DisplayState {

	/** Counter local to this state */
    private int count = 0;
    
	@Override
	public void display(DisplayText displayText, String text) {
		
		System.out.println(text.toUpperCase());
        /* Change state after StateMultipleUpperCase's display() gets invoked twice */
        if(++count > 1) {
            displayText.setState(new LowerCaseState());
        }
	}

}
