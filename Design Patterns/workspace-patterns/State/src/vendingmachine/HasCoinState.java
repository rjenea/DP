package vendingmachine;

public class HasCoinState implements State {
	VendingMachine vendingMachine;
 
	public HasCoinState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
  
	public void insertCoin() {
		System.out.println("You can't insert another Coin");
	}
 
	public void ejectCoin() {
		System.out.println("Coin returned");
		vendingMachine.setState(vendingMachine.getNoCoinState());
	}
 
	public void turnCrank() {
		System.out.println("You turned...");
		vendingMachine.setState(vendingMachine.getSoldState());
	}

    public void dispense() {
        System.out.println("No soda dispensed");
    }
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
