package chainofresponsibility.eckel;

public class LeastSquares implements Strategy {
	@SuppressWarnings("unused")
	public LineData strategy(LineData m) {
		System.out.println("Trying LeastSquares algorithm");
		LineData ld = (LineData) m;
		// [ Actual test/calculation here ]
		LineData r = new LineData(new double[] { 1.1, 2.2 }); // Dummy data
		r.setSuccessful(false);
		return r;
	}
}