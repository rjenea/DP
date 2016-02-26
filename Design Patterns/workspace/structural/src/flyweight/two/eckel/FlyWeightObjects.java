package flyweight.two.eckel;

//: flyweight:FlyWeightObjects.java

public class FlyWeightObjects {
	public static void main(String[] args) {
		for (int i = 0; i < ExternalizedData.size; i++) {
			FlyPoint.setI(i, FlyPoint.getI(i) + 1);
			FlyPoint.setF(i, 47.0f);
		}
		System.out.println(FlyPoint.str(ExternalizedData.size - 1));
	}
}