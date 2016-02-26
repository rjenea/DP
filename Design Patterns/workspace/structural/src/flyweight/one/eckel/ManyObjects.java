package flyweight.one.eckel;

//: flyweight:ManyObjects.java

public class ManyObjects {
	static final int size = 1000000;

	public static void main(String[] args) {
		DataPoint[] array = new DataPoint[size];
		for (int i = 0; i < array.length; i++)
			array[i] = new DataPoint();
		for (int i = 0; i < array.length; i++) {
			DataPoint dp = array[i];
			dp.setI(dp.getI() + 1);
			dp.setF(47.0f);
		}
		System.out.println(array[size - 1]);
	}
}