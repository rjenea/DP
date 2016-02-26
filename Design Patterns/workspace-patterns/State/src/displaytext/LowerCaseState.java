package displaytext;

public class LowerCaseState implements DisplayState {

	@Override
	public void display(DisplayText displayText, String text) {
		System.out.println(text.toLowerCase());
        displayText.setState(new MultipleUpperCaseState());

	}

}
