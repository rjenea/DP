package weight_nope;

public class ScalesPoundsAdapter implements WeightAdapter {

	Scales scales;
	
	public ScalesPoundsAdapter(Scales scales) {
		this.scales = scales;
	}
	
	@Override
	public float getWeight() {
		return scales.getPerson().getWeight()*14;
	}

}
