package chainofresponsibility.eckel;

public class ConjugateGradient implements Strategy {
	
	@SuppressWarnings("unused")
	public LineData strategy(LineData m) {
		System.out.println("Trying ConjugateGradient algorithm");
		LineData ld = (LineData) m;
		// [ Actual test/calculation here ]
		LineData r = new LineData(new double[] { 5.5, 6.6 }); // Dummy data
		r.setSuccessful(true);
		return r;
	}
}