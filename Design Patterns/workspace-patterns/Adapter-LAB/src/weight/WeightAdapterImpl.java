package weight;

public class WeightAdapterImpl implements WeightAdapter {

	Scales scales;
	
	public WeightAdapterImpl(Scales scales) {
		this.scales = scales;
	}
	
	@Override
	public float getWeightInPounds() {
		return scales.getPerson().getWeight() * 12;
	}

	@Override
	public float getWeightInKilos() {
		return scales.getPerson().getWeight()*6.35029f;
	}

}