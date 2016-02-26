package chainofresponsibility.eckel;

import org.junit.Test;

//: chainofresponsibility:FindMinima.java
import com.bruceeckel.util.*; // Arrays2.toString()

public class FindMinima  {
	LineData line = new LineData(new double[] { 1.0, 2.0, 1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0 });

	@Test
	public void test() {
		System.out.println(Arrays2.toString(((LineData) MinimaFinder.solve(line)).data));
	}

}