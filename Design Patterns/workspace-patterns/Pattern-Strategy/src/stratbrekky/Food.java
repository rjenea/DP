package stratbrekky;

public abstract class Food {
	
	float price;
	String desc;
	// Add behaviours
	CookingBehaviour cookingBehaviour;
	
	public Food(float price, String desc) {
		this.price = price;
		this.desc = desc;
	}
	
	// get/set behaviour
	public CookingBehaviour getCookingBehaviour() {
		return cookingBehaviour;
	}

	public void setCookingBehaviour(CookingBehaviour cookingBehaviour) {
		this.cookingBehaviour = cookingBehaviour;
	}

	// delegate cooking to current behaviour
	public void cook() {
		cookingBehaviour.cook();
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