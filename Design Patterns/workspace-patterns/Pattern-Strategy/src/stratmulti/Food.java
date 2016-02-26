package stratmulti;

public abstract class Food {
	
	float price;
	String desc;
	// Add behaviours
	CookingBehaviour [] cookingBehaviours;
	
	public Food(float price, String desc) {
		this.price = price;
		this.desc = desc;
	}

	// get/set array of behaviours
	public CookingBehaviour[] getCookingBehaviours() {
		return cookingBehaviours;
	}

	public void setCookingBehaviours(CookingBehaviour[] cookingBehaviours) {
		this.cookingBehaviours = cookingBehaviours;
	}

	// delegate cooking to current behaviour
	public void cook() {
		for(int i = 0; i < cookingBehaviours.length; i++){
			cookingBehaviours[i].cook();
		}
	}
	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "Food [price=" + price + ", desc=" + desc + "]";
	}
}