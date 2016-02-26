package strategy.eckel;

import org.junit.Test;

//: strategy:StrategyPattern.java
import com.bruceeckel.util.*; // Arrays2.toString()

// The strategy interface:
interface FindMinima {
	// Line is a sequence of points:
	double[] algorithm(double[] line);
}

// The various strategies:
class LeastSquares implements FindMinima {
	public double[] algorithm(double[] line) {
		return new double[] { 1.1, 2.2 }; // Dummy
	}
}

class NewtonsMethod implements FindMinima {
	public double[] algorithm(double[] line) {
		return new double[] { 3.3, 4.4 }; // Dummy
	}
}

class Bisection implements FindMinima {
	public double[] algorithm(double[] line) {
		return new double[] { 5.5, 6.6 }; // Dummy
	}
}

class ConjugateGradient implements FindMinima {
	public double[] algorithm(double[] line) {
		return new double[] { 3.3, 4.4 }; // Dummy
	}
}

// The "Context" controls the strategy:
class MinimaSolver {
	private FindMinima strategy;

	public MinimaSolver(FindMinima strat) {
		strategy = strat;
	}

	double[] minima(double[] line) {
		return strategy.algorithm(line);
	}

	void changeAlgorithm(FindMinima newAlgorithm) {
		strategy = newAlgorithm;
	}
}

public class StrategyPattern  {
	MinimaSolver solver = new MinimaSolver(new LeastSquares());
	double[] line = { 1.0, 2.0, 1.0, 2.0, -1.0, 3.0, 4.0, 5.0, 4.0 };

	@Test
	public void test() {
		System.out.println(Arrays2.toString(solver.minima(line)));
		solver.changeAlgorithm(new Bisection());
		System.out.println(Arrays2.toString(solver.minima(line)));
	}
}