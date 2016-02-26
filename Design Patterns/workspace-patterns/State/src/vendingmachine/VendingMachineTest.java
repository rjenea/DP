package vendingmachine;

public class VendingMachineTest {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(3);

		System.out.println(vendingMachine);

		vendingMachine.insertCoin();
		vendingMachine.turnCrank();

		System.out.println(vendingMachine);

		vendingMachine.insertCoin();
		vendingMachine.turnCrank();
		
		System.out.println(vendingMachine);
		vendingMachine.insertCoin();
		vendingMachine.turnCrank();

		System.out.println(vendingMachine);
	}
}
