package stratmulti;

public class Main {

	public static void main(String[] args) {
		
		Food egg = new Egg(1.2F, "Battery");
		CookingBehaviour [] cookingBehaviours = { new FriableCookingBehaviour(), new GrillableCookingBehaviour() };
		egg.setCookingBehaviours(cookingBehaviours);
		egg.cook();
	}
}