package chainofresponsibility.eckel;

// Carries the result data and 
// whether the strategy was successful:
public class LineData {
	public double[] data;

	public LineData(double[] data) {
		this.data = data;
	}

	private boolean succeeded;

	public boolean isSuccessful() {
		return succeeded;
	}

	public void setSuccessful(boolean b) {
		succeeded = b;
	}
}