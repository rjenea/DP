package stratbrekky;

public class Main {

	public static void main(String[] args) {
		
		Food egg = new Egg(1.2F, "Battery");
		egg.setCookingBehaviour(new FriableCookingBehaviour());
		egg.cook();
	}
}