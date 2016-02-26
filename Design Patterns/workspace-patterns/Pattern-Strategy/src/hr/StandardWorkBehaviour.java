package hr;

public class StandardWorkBehaviour implements WorkBehaviour {

	@Override
	public void work() {
		System.out.println("Standard work hours.  Office: 9-5");
	}
}