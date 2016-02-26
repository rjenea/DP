package chainofresponsibility.eckel;

public class Bisection implements Strategy {
	
	@SuppressWarnings("unused")
	public LineData strategy(LineData m) {
		System.out.println("Trying Bisection algorithm");
		LineData ld = (LineData) m;
		// [ Actual test/calculation here ]
		LineData r = new LineData(new double[] { 5.5, 6.6 }); // Dummy data
		r.setSuccessful(true);
		return r;
	}
}