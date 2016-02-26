package weight;

public class Scales {

	Person p;
	
	public Scales() {
	}
	
	public void setPerson(Person p) {
		this.p = p;
	}
	
	public Person getPerson() {
		return p;
	}

	public int getWeight() {
		return p.weight;
	}
}