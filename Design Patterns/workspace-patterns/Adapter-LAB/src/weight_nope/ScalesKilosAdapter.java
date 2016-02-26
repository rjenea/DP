package weight_nope;

public class ScalesKilosAdapter implements WeightAdapter {

	Scales scales;
	
	public ScalesKilosAdapter(Scales scales) {
		this.scales = scales;
	}
	
	@Override
	public float getWeight() {
		return scales.getPerson().getWeight()*6.35029f;
	}
}