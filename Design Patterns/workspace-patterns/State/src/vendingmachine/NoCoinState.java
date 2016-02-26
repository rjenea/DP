package vendingmachine;

public class NoCoinState implements State {
    VendingMachine vendingMachine;
 
    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }
 
	public void insertCoin() {
		System.out.println("You inserted a coin");
		vendingMachine.setState(vendingMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's no coin");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
