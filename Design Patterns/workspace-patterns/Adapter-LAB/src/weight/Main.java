package weight;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setWeight(15);
		Scales scales = new Scales();
		scales.setPerson(person);
		System.out.println(scales.getWeight());
	
		//WeightAdapter adapter = new ScalesPoundsAdapter(scales);
		//System.out.println(adapter.getWeight());
		
		//WeightAdapter adapter2 = new ScalesKilosAdapter(scales);
		//System.out.println(adapter2.getWeight());
		
		WeightAdapter adapter = new WeightAdapterImpl(scales);
		System.out.println(adapter.getWeightInPounds());
	}
}
