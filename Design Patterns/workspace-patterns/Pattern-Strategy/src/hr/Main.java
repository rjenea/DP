package hr;

public class Main {
	
	public static void main(String [] args) {

		Employee manager = new Manager("Curtis", 1);
		manager.work();
		manager.setWorkBehaviour(new HomeWorkBehaviour());
		manager.work();
		
		Employee consultant = new Consultant("Smith", 2);
		consultant.setWorkBehaviour(new HomeWorkBehaviour());
		consultant.work();
	}
}